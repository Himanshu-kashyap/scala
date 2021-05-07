object OOP_basics extends App{
    var m = new Module2("Elephant",100)
    println(m another "amar")

}

// class parameters are different from class fields
class Module2(var name:String, var age:Int){ // using a var before a function will make it a 
                                             // class field and hence callable using object
        println(name) // side effects always execute on instantiation

        def another(name:String):Unit = { println(s"this is $name talking") } 
         
    }