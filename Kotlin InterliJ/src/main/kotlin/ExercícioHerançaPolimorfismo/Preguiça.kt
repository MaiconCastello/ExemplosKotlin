package ExercícioHerançaPolimorfismo

class Preguica (nome: String, idade: Int): Animal(nome, idade) {

    fun subirArvore (){
        println("Subindo em árvore...YUP YUP!!")
    }
    override fun emitirSom(){
        super.emitirSom()
        println("Som de Preguiça - Ahnn Ahnn Ahnn...")
    }
}