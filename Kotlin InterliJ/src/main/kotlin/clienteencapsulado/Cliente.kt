package clienteencapsulado

class Cliente(
    private var nome: String

) {
    private var endereco = ""
    private var telefone = "0000-0000"
    private val listaDeCompras = mutableListOf<String>()

    init {
        if (nome == ""){
            throw Exception("A classe foi instanciada incorretamente, o nome não pode ser vázio")
        }
    }


    constructor(nome: String, endereco: String) : this(nome) {
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String) : this(nome, endereco) {
        this.telefone = telefone

    }

    fun adcCompra(produto: String){
        if (produto != ""){
            listaDeCompras.add(produto)
        }else{
            println("O item não pode ser vazio!!!")
        }
    }

    fun rmvCompra(produto: String){
        if (listaDeCompras.contains(produto)){
            listaDeCompras.remove(produto)
            println("Produto removido com sucesso.")
        }else{
            println("Este item não está na sua lista!!!")
        }
    }

    fun listarCompras(){
        println("-----Lista de Compras-----")
        listaDeCompras.forEach{ println(it)}
    }
}
