package ExercícioHerançaPolimorfismo

fun main() {

    fun menu2(n: Int, nome: String, idade: Int) {
        while (true) {
            println("\nMENU")
            if (n == 3) {
                println(
                    "\"Selecione uma ação:" +
                            "\n1 → Emitir som" +
                            "\n2 → Subir em àrvore" +
                            "\n3 → Sair"
                )
            } else {
                println(
                    "Selecione ação:" +
                            "\n1 → Correr" +
                            "\n2 → Emitir som" +
                            "\n3 → Sair"
                )
            }
            var menu = readln().toInt()

            when (n) {
                1 -> {
                    val cachorroX = Cachorro(nome, idade)
                    when (menu) {
                        1 -> cachorroX.correr()
                        2 -> cachorroX.emitirSom()
                        3 -> break
                    }


                }
                2 -> {
                    val cavaloX = Cavalo(nome, idade)
                    when (menu) {
                        1 -> cavaloX.correr()
                        2 -> cavaloX.emitirSom()
                        3 -> break
                    }
                }
                3 -> {
                    val preguicaX = Preguica(nome, idade)
                    when (menu) {
                        1 -> preguicaX.emitirSom()
                        2 -> preguicaX.subirArvore()
                        3 -> break
                    }
                }
            }
        }


    }

    while (true) {

        println("MENU")
        println(
            "Selecione um tipo de Animal:" +
                    "\n1 → Cachorro" +
                    "\n2 → Cavalo" +
                    "\n3 → Preguiça" +
                    "\n4 → Sair"
        )
        var menu = readln().toInt()
        if (menu == 1 || menu == 2 || menu == 3) {
            println("Digite o nome do animal: ")
            var nome = readln()
            println("Digite a idade do animal: ")
            var idade = readln().toInt()
            menu2(menu, nome, idade)
        }
        if (menu == 4) {
            break
        } else println("Opção inválida, insira uma opção válida")
    }

}

