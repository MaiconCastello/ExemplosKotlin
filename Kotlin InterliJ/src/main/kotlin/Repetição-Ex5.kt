fun main(){

    /*
    5- Crie um programa que leia um número do teclado até que encontre um
    número igual a zero. No final, mostre a soma dos números
    digitados.(DO...WHILE)
    */

    var n = 0.0
    var soma =0.0
    println("Este programa lê números e calcula a soma dos números inseridos até que você digite 0 (zero)")

    do{
        print("Digite um número: ")
        n = readln().toDouble()
        soma += n

        } while(n != 0.0)


    print("A soma dos números digitados é ${"%.1f".format(soma)}")

}