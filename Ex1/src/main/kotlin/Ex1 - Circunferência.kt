import kotlin.math.PI

fun main(){

    println("PROGRAMA QUE CÁLCULA ÁREA E COMPRIMENTO DE CIRCUNFERÊNCIA COM BASE NO DIÃMETRO")
    println("\nDigite o diâmetro 'd' em metros (m) de uma circunferência:")
    print("d= ")
    val d = readln().toDouble()
    val C = PI*d
    val A = PI*d*d/4

    println("\nA àrea A= $A m² e o Comprimento C=$C m")

}