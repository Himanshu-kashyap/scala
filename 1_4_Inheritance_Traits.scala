object Inheritance_Traits extends App{
    // abs class definitely have abs method but may also have non abs methods
    // diff b/w abs class and traits
    //  - traits do not have constructor parameters
    //  - mult traits can be inherited by same class 
    abstract class Animal{
        val n_legs = 4
        def nocturnal:Boolean  = false  //
    }

    trait Mammal{
        val fur = true
        def family = println("Monke")
    }

    trait Bites{
        val bites = true
        def rabies:Boolean
    }

    class Dog extends Animal with Mammal with Bites{
        def nocturnal = false
        def rabies = false
        println(nocturnal)
        println(rabies)

        println(n_legs,fur,bites)

    }


    var d = new Dog
}