object OOP_basics extends App{
    var m = new Module2("Elephant",100)
    println(m another "amar") // synctactic sugar i.e. using natural language 
    println(m.another("amar")) // same as above but does not resemble natural language
    m.+("amar","akbar")

    println(m.apply())
    println(m())    

}

// class parameters are different from class fields
class Module2(var name:String, var age:Int){ // using a var before a function will make it a 
                                             // class field and hence callable using object
        println(name) // side effects always execute on instantiation

        def another(name:String):Unit = { println(s"this is $name talking") } 
        def +(name1:String,name2:String) = {println(s"these people are $name1 and $name2")}

        // postfix notation
        def apply() : String = s"this is a test for the faint hearted $name"


    }