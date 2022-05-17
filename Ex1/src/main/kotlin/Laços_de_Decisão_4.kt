import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.math.pow

fun main(){

    //Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

    print("Digite um número inteiro: ")
    var n = readln().toInt()
    var resto = n%2
    if(resto==0){

        var aux = n.toDouble()
        print("O número digitado é par e sua raiz é: √$n = ${"%.1f".format(sqrt(aux))}")

    }else{

        var aux = n.toDouble()
        print("O número digitado é ímpar e seu quadrado é: $n² = ${"%.1f".format(aux.pow(2))}")

    }
}
