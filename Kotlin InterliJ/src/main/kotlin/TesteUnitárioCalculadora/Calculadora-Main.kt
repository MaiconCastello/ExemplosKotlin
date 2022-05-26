package TesteUnitárioCalculadora

fun main(){

    val calc = Calculadora()
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
            1 -> {var exibir = calc.soma()
                println("$exibir")
            }
            2 -> println("\n${calc.subtracao()}")

            3 -> println("\n${calc.multiplicacao()}")
            4 -> println("\n${calc.divisao()}")
            5 -> println("\n${calc.potencia()}")
            6 -> println("\n${calc.raiz()}")
        }


    }while (menu !=7)


}