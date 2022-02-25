object Demo {

    abstract class Animal {
        def name: String
    }

    abstract class Pet extends Animal {}

    class Cat extends Pet {
        override def name: String = "Cat"
    }

    class Dog extends Pet {
        override def name: String = "Dog"
    }

    // P must be a subtype if Pet
    class PetContainer[P <: Pet](p: P) {
        def pet: P = p
    }

    def main(args: Array[String]): Unit = {
        val catContainer = new PetContainer[Cat](new Cat)
        val dogContainer = new PetContainer[Dog](new Dog)
        
        println(catContainer.pet.name)
        println(dogContainer.pet.name)
    }
}