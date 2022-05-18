fun main(){

    /*
    3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    idade for =-99. (WHILE)
    */

    var menos21 =0
    var mais50 =0
    var idade = 0
    var npessoas = 0
    println("Este programa lê a idade digitada e categoriza entre menor que 21 anos e maior que 50 \n" +
            "Para finalizar a inserção dos dados insira no console número -99 e pressione enter")
    while(idade != -99){
        print("Digite a sua idade: ")
       idade = readln().toInt()
        if(idade<21 && npessoas!=0){
            menos21++
        }else if(idade>50){
                mais50++
            }
        npessoas++

        }



    print("Você digitou ${npessoas -1} idades válidas, e com relação as idades digitadas, $menos21 são pessoas com menos de 21 anos, e $mais50 são pessoas com mais de 50 anos...")

}