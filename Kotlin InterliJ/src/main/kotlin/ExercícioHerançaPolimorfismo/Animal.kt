package ExercícioHerançaPolimorfismo

abstract class Animal(var nome:String, var idade:Int) {

    open fun emitirSom(){
        println("Emitindo som!")
    }


}