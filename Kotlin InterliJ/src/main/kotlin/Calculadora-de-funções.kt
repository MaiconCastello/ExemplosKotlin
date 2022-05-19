import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    println("CALCULADORA")
fun soma(){
    println("A soma é do tipo Sn = (X1 + X2 +X3 ...+Xn), ou seja, n é o número de termos que você deseja somar")
    print("Digite n: ")
    var n = readln().toInt()
    var soma = 0.0
    for (i in 1..n){
        print("X$i = ")
        var num = readln().toDouble()
        soma += num

    }
    println("S$n = $soma")
}
fun subtracao() {
    println(
        "A subtração é do tipo Sn = (X1 - X2 - X3 ...-Xn), ou seja, n é o número de termos que você deseja subtrair\n" +
                "Obs: não precisa digitar os números negativos!"
    )
    print("Digite n: ")
    var n = readln().toInt()
    var sub = 0.0
    var num = 0.0
    for (i in 1..n) {
        if (i != 1) {
            print("-X$i = ")
            num = readln().toDouble()
            sub -= num

        } else {
            print("X$i = ")
            num = readln().toDouble()
            sub += num
        }
        println("S$n = $sub")
    }
}
fun multiplicacao(){
    println("A multiplicação é do tipo Mn = (X1 x X2 x X3 ...x Xn), ou seja, n é o número de termos que você deseja multiplicar")
    print("Digite n: ")
    var n = readln().toInt()
    var multi = 0.0
    for (i in 1..n){
        if (i != 1) {
            print("X$i = ")
            var num = readln().toDouble()
            multi = multi*num

        } else {
            print("X$i = ")
            var num = readln().toDouble()
            multi = num
        }
}
    println("M$n = $multi")
}
fun divisao() {
    println("A divisão é do tipo Dn = X1/(X2 x X3 ...x Xn), ou seja, n é o número de termos que você deseja dividir")
    print("Digite n: ")
    var n = readln().toInt()
    var div = 0.0
    for (i in 1..n) {
        if (i != 1) {
            print("X$i = ")
            var num = readln().toDouble()
            div = div / num
            println("Parcial: D$i = $div")

        } else {
            print("X$i = ")
            var num = readln().toDouble()
            div = num
        }

    }
    println("D$n = $div")
}
fun potencia(){
    println("A potencia é do tipo Pn = (X)^n, ou seja, n é o número da potencia que você deseja elevar X")
    print("Digite X: ")
    var x = readln().toDouble()
    print("Digite n: ")
    var n = readln().toInt()
    var pot = x.pow(n)
    println("P$n = $pot")

}
fun raiz(){
    println("A raiz quadrada é do tipo √X , ou seja, X é o número que você deseja saber a raiz quadrada")
    print("Digite X: ")
    var x = readln().toDouble()
    var rai = sqrt(x)
    println("√$x = $rai")

}

    do{
        print("\nQual operação você deseja fazer?\n" +
                "1 → Soma\n" +
                "2 → Subtração\n" +
                "3 → Multiplicação\n" +
                "4 → Divisão\n" +
                "5 → Potência\n" +
                "6 → Raiz Quadrada\n" +
                "7 → Sair\n" +
                "R: ")

        var menu = readln().toInt()

        when(menu){
            1 -> soma()
            2 -> subtracao()
            3 -> multiplicacao()
            4 -> divisao()
            5 -> potencia()
            6 -> raiz()
        }


    }while (menu !=7)

}