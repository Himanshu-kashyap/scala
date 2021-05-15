// scala objects are different than objects used to refer instances of the class
// 1. class level functionality  - scala does not have one it has better feature of using objects
// in other languages we use static values and when we call using obj.var_name it shows <--- this is class level functionality
// instead of using static to use class level values we use object in scala
// 
object Scala_Objs extends App{
    
    /*  
     * 1 demonstation of object properties singleton 
    */
    
    object inner_test{
        var t = 20   // this is equivalent to using static int t= 20 in java aka class level functionality
    }


    /*
        use of companion class with object
    */
    
    object Companion_Demo{
        // this one is for class level functionality inside scala objs object
        println("this should run on instance creation of inner object and will print only once since it's same instance everywhere")
        var test = 2  // this is the alternative of static 

        // using factory method for using this companion object and class structure with ease

        def apply(name:String):Companion_Demo = return new Companion_Demo(name)

    }

    class Companion_Demo(var name:String){
        
        var test = 30 // inside class
        println(s"this should print for $name")

    }

    // demo of class level fxnality
    println(inner_test.t)

    // singleton instance
    var test1 = inner_test // notice the absense of new identifier indicating use of singleton instance
    var test2 = inner_test

    if(test1 == test2){
        println("matches")   //this will match bc objects create single instance so any no of var used will point to same inst
    }


    // using fxnality of both object and class with factory method
    var inst_demo = Companion_Demo // prints 
    var amar = Companion_Demo("Amar")
    var akbar = Companion_Demo("Akbar")

}