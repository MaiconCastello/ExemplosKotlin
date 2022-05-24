package `Exercícios-Classes`

fun main() {

    val ClienteX = Cliente(mutableListOf<String>("Celular", "Notebook", "Cadeira Gamer"), 100, 5000.00, "Bom")



    do {
        print(
            "\nOlá Cliente X que operação você deseja fazer?\n" +
                    "1 → Fazer uma compra\n" +
                    "2 → Verificar meu Score\n" +
                    "3 → Verificar meu Limite\n" +
                    "4 → Alterar humor\n" +
                    "5 → Sair\n" +
                    "R: "
        )

        var menu = readln().toInt()

        when (menu) {
            1 -> {
                println("Digite o nome do produto que você comprou:")
                var produto = readln()
                println("Digite o valor do produto que você comprou:")
                var valor = readln().toDouble()
                ClienteX.comprar(produto, valor)
                println(
                    "O produto que você comprou é eletrônico?" +
                            "\n1 → Sim" +
                            "\n2 → Não"
                )
                var aux = readln().toInt()
                if (aux == 1) {
                    println("Qual a marca do seu dispositivo?")
                    var marca = readln()
                    var status = 50
                    println(
                        "Seu dispositivo eletrônico possui conexão com a internet?" +
                                "\n1 → Sim" +
                                "\n2 → Não"
                    )
                    aux = readln().toInt()
                    var internet = false
                    if (aux == 1) {
                        internet = true
                    }
                    var ProdutoX = ProdutoEletrônico(produto, status, marca)
                    ProdutoX.internet = internet
                    println(
                        "Deseja configurar seu dispositivo?" +
                                "\n1 → Sim" +
                                "\n2 → Não"
                    )
                    aux = readln().toInt()
                    if (aux == 1) {
                        do {
                            print(
                                "\n                   MENU                 Bateria:${ProdutoX.statusBateria}%\n" +
                                        "1 → Carregar bateria do dispositivo\n" +
                                        "2 → Informações do aparelho \n" +
                                        "3 → Habilitar/Desabilitar transações financeiras\n" +
                                        "4 → Sair\n" +
                                        "R: "
                            )
                            var menu = readln().toInt()
                            ProdutoX.statusBateria -= 5
                            when (menu) {
                                1 -> ProdutoX.carregar()
                                2 -> ProdutoX.status()
                                3 -> ProdutoX.auttrans()

                            }


                            if (ProdutoX.statusBateria <= 15) {
                                println(
                                    "Bateria está baixa (${ProdutoX.statusBateria}%)" +
                                            "\nAo chegar a zero o aparelho desligará automáticamente e sua operação é encerrada"
                                )
                            }

                        } while (menu != 4 && ProdutoX.statusBateria > 0)

                    }
                }
            }
            2 -> ClienteX.verScore()
            3 -> ClienteX.verLimite()
            4 -> {
                println(
                    "Deseja mesmo alterar seu humor?" +
                            "\n1 → Sim" +
                            "\n2 → Não"
                )
                var i = readln().toInt()
                ClienteX.alterahumor(i)
            }
        }
    } while (menu != 5)
}

