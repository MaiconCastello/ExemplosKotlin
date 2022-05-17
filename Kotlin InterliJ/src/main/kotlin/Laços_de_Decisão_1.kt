fun main() {

    //Faça um programa que receba três inteiros e diga qual deles é o maior.

    println("Digite três Números Inteiros:")

    print("1º: ")
    val a:Int = readln().toInt()
    print("2º: ")
    val b:Int = readln().toInt()
    print("3º: ")
    val c:Int = readln().toInt()

    if (a>b && a>c) {
        println("\nO número $a foi o maior número digitado!")

        }else if (b>c) {
            println("\nO número $b foi o maior número digitado!")

        }else println("\nO número $c foi o maior número digitado!")

}