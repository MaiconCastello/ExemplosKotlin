fun main(){

    /*
    2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
    */
    var pares =0
    var impares =0
    println("Este programa lê 10 números e informa quantos são pares e quantos são ímpares")
    for(i in 1..10){
        print("Digite um número: ")
        var n = readln().toDouble()
        if(n%2 == 0.0){
            pares++
        }else impares++

    }

    print("Você digitou $pares números pares e $impares números ímpares...")

}