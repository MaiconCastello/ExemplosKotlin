fun main(){

    /*
    4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
    */

    //Definindo variáveis

    var idade = 0
    var sexo = 0
    var caracter = 0 // características psicológicas dos indivíduos
    var calmos = 0 // calmos
    var mn = 0 //mulheres nervosas
    var hagg = 0 //homens agressivos
    var outc = 0 //Outros calmos
    var n40mais = 0 //pessoas nervosas com mais de 40 anos
    var c18menos = 0 //pessoas calmas com menos de 18 anos
    var npessoas = 1 // número de pessoas

    println("Este programa lê os dados de 150 pessoas")

    while(npessoas <= 150){
        print("Digite a sua idade: ")
        idade = readln().toInt()

        print("Pessoa $npessoas, Digite seu sexo: \n" +
                "1 - Feminino\n" +
                "2 - Masculino\n" +
                "3 - Outros\n")
        sexo = readln().toInt()
        print("Pessoa $npessoas, Com qual característica você se identifica mais: \n" +
                "1 - Sou calme (a/o)\n" +
                "2 - Sou nervouse (a/o)\n" +
                "3 - Sou agressive (a/o)\n")
        caracter = readln().toInt()

        if (caracter == 1){
            calmos++
        }

        if(caracter == 2 && sexo == 1){
            mn++
        }

        if(caracter == 3 && sexo == 2){
            hagg++
        }

        if(caracter == 1 && sexo == 3){
            outc++
        }

        if(caracter == 2 && idade > 40){
            n40mais++
        }

        if(caracter == 1 && idade < 18){
            c18menos++
        }

        npessoas++
        }
    print("De acordo com os dados inseridos:\n" +
            "o número de pessoas calmas: $calmos \n" +
            "o número de mulheres nervosas: $mn\n" +
            "o número de homens agressivos: $hagg\n" +
            "o número de outros calmos: $outc\n" +
            "o número de pessoas nervosas com mais de 40 anos: $n40mais\n" +
            "o número de pessoas calmas com menos de 18 anos: $c18menos\n\n\n")
    }







