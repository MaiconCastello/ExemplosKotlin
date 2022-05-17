fun main() {

    //Faça um programa que entre com três números e coloque em ordem crescente.

    // Inicialçizando variáveis

    var p1:Double = 0.0
    var p2:Double = 0.0
    var p3:Double = 0.0

    println("Digite três Números:")

    print("1º: ")
    val a:Double = readln().toDouble()
    print("2º: ")
    val b:Double = readln().toDouble()
    print("3º: ")
    val c:Double = readln().toDouble()

    if (a>b && a>c) {
        p3 = a
        if(b > c){
            p2 = b
            p1 = c
        }else{
            p2 = c
            p1 = b
        }

    }else
        if(b > c) {
            p3 = b
            if(a > b){
                p2 = a
                p1 = c
            } else {
                p2 = c
                p1 = a
            }

        }else{
            p3 = c
            if(a > b){
                p2 = a
                p1 = b
            }else{
                p2 = b
                p1 = a
            }

    }
    println("A sequência em decrescente dos números digitados é: $p1, $p2, $p3.")
}
