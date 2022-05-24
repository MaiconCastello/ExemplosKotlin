package clienteencapsulado

fun main(){

    while (true){
        print("Olá, insira seu nome: ")
        val nome = readln()
        try {
            val ClienteX = Cliente(nome)

            while (true){

                println("MENU\n" +
                        "1 → Adicionar Item\n" +
                        "2 → Remover Item\n" +
                        "3 → Exibir lista de compras\n" +
                        "4 → Sair")
                var menu = readln().toInt()

                when(menu){
                    1 -> {
                        print("Digite o nome do Item que você deseja adicionar a lista: ")
                        var produto = readln()
                        ClienteX.adcCompra(produto)
                    }
                    2 -> {
                        print("Digite o nome do Item que você deseja remover da lista: ")
                        var produto = readln()
                        ClienteX.rmvCompra(produto)
                    }
                    3 -> ClienteX.listarCompras()
                    4 -> break
                }

            }
        }catch (e: Exception){
            println(e.message)
        }
        println("Deseja finalizar o programa?" +
                "\n1 → Sim" +
                "\n2 → Não")
            var sair = readln().toInt()
        if (sair == 1){
            break
        }
    }

}