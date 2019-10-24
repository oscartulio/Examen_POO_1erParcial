import javax.lang.model.util.ElementScanner6
import kotlin.concurrent.thread

fun main() {


    println("El elevador de encuentra DETENIDO en el lobby")
    Thread.sleep(1000)
    var piso: Int?
    var estado: String
    println("Ingrese el piso al que desea ir: ")
    piso = readLine()?.toInt() as Int

    if (piso>1){
        estado="ARRIBA"
    }
    else
    {
        estado="ABAJO"
    }

    for(n in 1..piso) {
    println("Estado del elevador $estado, piso $n")
    piso++
        Thread.sleep(1000)
    }


}





