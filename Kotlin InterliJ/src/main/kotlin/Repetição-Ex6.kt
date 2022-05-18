fun main(){

    /*
    6- Escrever um programa que receba vários números inteiros no teclado. E no
    final imprimir a média dos números múltiplos de 3. Para sair digitar
    0(zero).(DO...WHILE)
    */

    var n = 0
    var soma =0
    var ndigitados = 0 // quantidade de números digitados que são múltiplos de 3

    println("Este programa lê números e calcula a média dos números digitados que são múltiplos de 3. \n" +
            "Para finalizar o programa digite 0 (zero)")

    do{
        print("Digite um número: ")
        n = readln().toInt()
        if(n%3 == 0 && n!=0){
            soma += n
            ndigitados++
        }


    } while(n != 0)

    if (ndigitados == 0){
        print("Você não digitou números múltiplos de 3")
    }else  print("A média dos números digitados múltiplos de 3 é ${soma/ndigitados}")

}