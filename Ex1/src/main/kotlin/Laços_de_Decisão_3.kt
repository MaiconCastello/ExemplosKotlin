fun main(){

    //Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:

    println("Digite a sua idade para saber sua categoria")
    print("Idade: ")
    val idade = readln().toInt()

    when(idade){

        in 10..14 -> {
            println("Categoria Infantil.")
        }
        in 15..17 -> {
            println("Categoria Juvenil.")
        }
        in 18 ..25 -> {
            println("Categoria Adulto.")
        }
        else -> println("Idade inválida.")
    }

}
