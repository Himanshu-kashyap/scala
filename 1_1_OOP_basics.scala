object OOP_basics extends App{

    // class vs instantiation
    //      a class organizes data and behavior ie code
    //      instantiation is the concrete realization in the memory that conform to actual data structure of the class







    var m = new Module2("Elephant",100)
    println(m another "amar") // synctactic sugar i.e. using natural language 
    println(m.another("amar")) // same as above but does not resemble natural language
    m.+("amar","akbar")

    println(m.apply())
    println(m())    
    println(m.isAlive())

}

// providing with arguments in class argument is equivalent to constructor


// class parameters are different from class fields
class Module2(var name:String, var age:Int){ // using a var before a function will make it a 
                                             // class field and hence callable using object
        println(name) // side effects always execute on instantiation

        def another(name:String):Unit = { println(s"this is $name talking") } 
        def +(name1:String,name2:String) = {println(s"these people are $name1 and $name2")}

        // postfix notation
        def apply() : String = s"this is a test for the faint hearted $name"
        def isAlive() : Boolean => 1==2

    }