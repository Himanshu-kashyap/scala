object Inheritance extends App{

    
    class Animal(feet:Int = 4,fur:Boolean){
        def barks = false
        def isADog = println("Not a Dog")
        final var isAnimal = true
        var type_var = "Reptile"
        val type_val = "Reptile"
        val horns = 2

        //def this(fur:Boolean) = this(4,fur)
    }

    /*
        correct syntax for inheritance is providing class constructors
        for both parent and child class 
    
    */

    class Dog(feet:Int,fur:Boolean,breed:String) extends Animal(feet,fur){
        println("printing while instantiating")
        println(feet+"\n"+fur+"\n"+breed+"\n")


        // calling isADog which calls parent method not overriden yet
        print("Before overriding ---> ")   // will call the function in same scope if declared 
        isADog      // comment the overriden method in current Dog class to print parent value else will print curr val

        // what happens after overriding the method
        override def isADog = println("definitely a dog")
        // try and call the super method for is a Dog
        print("After overriding ---> ")
        isADog

        print("Calling super after overriding ---> ")
        super.isADog

        override def barks = true
        override val type_val = "Mammal"
        type_var = "Mammal" // mutable variable cannot be overriden but can be reassigned value
        // comment above line to print parent's value
        override val horns = 0

        // override var isAnimal = false  // gives error as trying to override final method

    }

    val x:Animal = new Dog(4,true,"Pug")
    // var y = new Animal
    println(x.barks + "\t" + x.type_var + "\t" + x.horns + "\t" + x.type_val) 
    
}