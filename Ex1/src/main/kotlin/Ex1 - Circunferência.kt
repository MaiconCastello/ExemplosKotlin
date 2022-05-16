import kotlin.math.PI
import kotlin.math.pow

fun main(){

    println("PROGRAMA QUE CÁLCULA ÁREA E COMPRIMENTO DE CIRCUNFERÊNCIA COM BASE NO DIÃMETRO")
    println("\nDigite o diâmetro 'd' em metros (m) de uma circunferência:")
    print("d= ")
    val d = readln().toDouble()
    val C = PI*d
    val A = PI*d.pow(2)/4

    println("\nA àrea A= ${"%.2f".format(A)} m² e o Comprimento C= ${"%.2f".format(C)} m")

}