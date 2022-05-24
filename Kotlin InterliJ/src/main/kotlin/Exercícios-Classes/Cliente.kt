package `Exercícios-Classes`


/* Definindo os atributos e métodos do cliente.
   Atributos:
       →Histórico de compras
       →Score financeiro (dados de pagamento)
       →Limite de crédito
       →Humor
   Métodos:
       →Adiciona movimentação financeira ao histórico (faz compra)
       →Verifica status de score financeiro e limite de crédito disponível
       →Altera humor

    */

class Cliente(
    var histórico: MutableList<String>, val score: Int,
    var limite: Double, var humor: String
) {
    fun comprar(produto:String, valor: Double) {
        if(limite>=0 && valor<=limite){
            histórico.add(produto)
            limite -= valor
            println("Seu limite foi atualizado $limite\n")
            println("Seu histórico de compras foi atualizado, confira o extrato abaixo.")
            histórico.forEach { println("$it") }
            println()
        }else{
            println("Operação Inválida -- Limite indisponível")
        }

    }
    fun verScore(){
        println("Seu Score é $score")
    }
    fun verLimite(){
        println("Seu Limite é $limite")
    }
    fun alterahumor(aux:Int){
        if(aux==1){
            print("\nQual das opções abaixo melhor traduz sua relação conosco?\n" +
                    "1 → Excelente\n" +
                    "2 → Boa\n" +
                    "3 → Ruim\n" +
                    "4 → Péssima\n")
            var i = readln().toInt()
            var aux = humor
            when(i){
                1 -> humor = "Excelente"
                2 -> humor = "Boa"
                3 -> humor = "Ruim"
                4 -> humor = "Péssima"

            }
            println("Seu humor era '$aux' e foi atualizado para '$humor'")
        }
    }
}