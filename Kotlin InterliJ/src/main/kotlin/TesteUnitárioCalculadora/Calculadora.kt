package TesteUnitárioCalculadora

import kotlin.math.pow
import kotlin.math.sqrt

 class Calculadora{

    fun soma(): Double {
        println("A soma é do tipo S = (X1 + X2)")
        print("Digite X1: ")
        var x1 = readln().toDouble()
        print("Digite X2: ")
        var x2 = readln().toDouble()
        return x1 + x2
    }
    fun subtracao(): Double {
        println("A subtração é do tipo S = (X1 - X2)")
        print("Digite X1: ")
        var x1 = readln().toDouble()
        print("Digite X2: ")
        var x2 = readln().toDouble()
        return x1 - x2
    }
    fun multiplicacao(): Double {
        println("A multiplicação é do tipo M = (X1 * X2)")
        print("Digite X1: ")
        var x1 = readln().toDouble()
        print("Digite X2: ")
        var x2 = readln().toDouble()
        return x1 * x2
    }
    fun divisao(): Double {
        println("A divisão é do tipo M = (X1/X2)")
        print("Digite X1: ")
        var x1 = readln().toDouble()
        print("Digite X2: ")
        var x2 = readln().toDouble()
        return x1 / x2
    }
    fun potencia(): Double{
        println("A potencia é do tipo Pn = (X)^n, ou seja, n é o número da potencia que você deseja elevar X")
        print("Digite X: ")
        var x = readln().toDouble()
        print("Digite n: ")
        var n = readln().toInt()
        var pot = x.pow(n)
        return pot
    }
    fun raiz(): Double{
        println("A raiz quadrada é do tipo √X , ou seja, X é o número que você deseja saber a raiz quadrada")
        print("Digite X: ")
        var x = readln().toDouble()
        var rai = sqrt(x)
        return rai
    }
}
 object Calculadora1{

     fun soma(x1:Double,x2:Double): Double {

         return x1 + x2
     }
     fun subtracao(x1:Double,x2:Double): Double {

         return x1 - x2
     }
     fun multiplicacao(x1:Double,x2:Double): Double {

         return x1 * x2
     }
     fun divisao(x1:Double,x2:Double): Double {

         return x1 / x2
     }
     fun potencia(x:Double,n:Double): Double{

         return x.pow(n)
     }
     fun raiz(x:Double): Double{

         return sqrt(x)
     }
}