package ExercícioHerançaPolimorfismo

class Cavalo (nome: String, idade: Int): Animal(nome, idade) {

    fun correr (){
        println("Correndo como um cavalo")
    }
    override fun emitirSom(){
        super.emitirSom()
        println("Relinchando - iiirrrrí, iiirrrrí...")
    }
}