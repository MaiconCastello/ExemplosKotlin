package ExercícioHerançaPolimorfismo

class Cachorro (nome: String, idade: Int): Animal(nome, idade) {

    fun correr (){
        println("Correndo como um cachorro")
    }
    override fun emitirSom(){
        super.emitirSom()
        println("Latindo - Roof Roof Roof...")
    }
}