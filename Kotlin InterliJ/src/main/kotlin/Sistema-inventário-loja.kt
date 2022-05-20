
fun main(){
    val nomes = mutableListOf<String>()
    val qtds = mutableListOf<Int>()
        println("INVENTÁRIO DA MAICK'STORE")
    fun adicionar(){
        do {
            println("Digitie nome do produto e quantidade:")
            print("Nome: ")
            var nome = readln()
            print("Quantidade: ")
            var qtd = readln().toInt()
            nomes.add(nome)
            qtds.add(qtd)
            print("Deseja adicionar outro produto ao estoque? (digite 1 ou 2)" +
                    "\n1 → Sim" +
                    "\n2 → Não" +
                    "\nR: ")
            var control1 = readln().toInt()

        }while(control1 == 1)


    }
    fun exibir() {
        val control2 = nomes.size
        println("INVENTÁRIO - MAICK'STORE - Itens: $control2" +
                "\n------------------------------------" +
                "\nID  -  Nome do Produto  -  Qtd" +
                "\n------------------------------------")
        for (i in 1..control2){
            println("$i - ${nomes[i-1]} - ${qtds[i-1]} ")
        }

    }
    fun atualizar(){
        exibir()
        println("Digite o nome do produto que você deseja editar:")
        var edit = readln()
        if (nomes.contains(edit)){
            var index = nomes.indexOf(edit)

        fun editnome(){
            println("Digite o novo nome: ")
            val novonome = readln()
            nomes[index] = novonome
            println("Nome atualizado com sucesso")
        }
        fun editqtd(){
            println("Digite a nova quantidade disponível: ")
            val novaqtd = readln().toInt()
            qtds[index] = novaqtd
            println("Quantidade atualizada com sucesso")
        }

            print("Qual característica você deseja editar:\n" +
                    "1 → Nome\n" +
                    "2 → Quantidade\n" +
                    "R: ")
            var menu2 = readln().toInt()

            when(menu2){
                1 -> editnome()
                2 -> editqtd()
            }
            println("Deseja alterar outro status:" +
                    "\nSim → 1" +
                    "\nNão → 2")
            var control1 = readln().toInt()
            if(control1==1){
                atualizar()
            }
        }else{
            println("Nome não localizado na base de dados!")
            println("Deseja alterar outro status:" +
                    "\nSim → 1" +
                    "\nNão → 2")
            var control1 = readln().toInt()
            if(control1==1){
                atualizar()
            }
        }


    }
    fun remover() {
        exibir()
        println("Digite o nome do item que deseja remover do inventário:")
        var delete = readln()
        if (nomes.contains(delete)) {
            println(
                "Deseja mesmo Excluir este item?" +
                        "\nSim → 1" +
                        "\nNão → 2"
            )
            var control1 = readln().toInt()
            if (control1 == 1) {
                var index = nomes.indexOf(delete)
                index = qtds[index]
                nomes.remove(delete)
                qtds.remove(index)
                println("Item deletado com sucesso")
            } else println("Operação cancelada")

            println(
                "Deseja exluir outro item:" +
                        "\nSim → 1" +
                        "\nNão → 2"
            )
            var control2 = readln().toInt()
            if (control2 == 1) {
                remover()
            }
        } else {
            println("Nome não localizado na base de dados!")
            println(
                "Deseja excluir outro item:" +
                        "\nSim → 1" +
                        "\nNão → 2"
            )
            var control2 = readln().toInt()
            if (control2 == 1) {
                remover()
            }

        }
    }


    do{
        print("\nMENU: Digite uma operação\n" +
                "1 → Adicionar produto ao estoque\n" +
                "2 → Exibir estoque de inventário\n" +
                "3 → Atualizar estoque\n" +
                "4 → Remover item do inventário\n" +
                "5 → sair\n" +
                "R: ")

        var menu = readln().toInt()
        print("\n")
        when(menu){
            1 -> adicionar()
            2 -> exibir()
            3 -> atualizar()
            4 -> remover()
            5 -> break
            else -> println("Opção inválida, selecione uma opção válida!")
        }


    }while (menu !=5)

}