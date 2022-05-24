package `Exercícios-Classes`

/* Definindo os atributos e métodos do cliente.
   Atributos:
       Nome, Marca, Status de Bateria, Conexão com a internet
       construtor secundário: se faz transações financeiras

   Métodos:
       Carregamento de bateria, habilitar e desabilitar transações finaceiras, informa as características do dispositivo.

    */

class ProdutoEletrônico(
    val nome: String, val marca: String, var statusBateria: Int
) {
    var internet: Boolean = false
    var trans: Boolean = false

    constructor(
        nome: String, statusBateria: Int, marca: String
    ): this(nome,marca,statusBateria){
       this.internet = internet
        this.trans = trans
    }
fun carregar(){
    statusBateria =100
    println("1,2,3... Bateria carregada com sucesso")
}
fun auttrans(){
    if(!trans){
        println("Liberando transações... só um minuto...Pronto")
        trans = true
    }else {
        println("Bloqueando transações imediatamente! ... Concluído")
        trans = false
    }
}
fun status (){
    println("Nome: $nome" +
            "\nMarca: $marca" +
            "\nConexão com a Internet: ${if (internet){
            "Conectado"}else "Desconectado"
            }" +
            "\nTransações finânceiras: ${
                if (trans) {
                    "Habilitado"
                }else "Desabilitado"
            }" +
            "\nBateria: $statusBateria%")

}
}
