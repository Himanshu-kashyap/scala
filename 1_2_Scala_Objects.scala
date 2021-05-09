// scala objects are different than objects used to refer instances of the class
// 1. class level functionality  - scala does not have one it has better feature of using objects
// in other languages we use static values and when we call using obj.var_name it shows <--- this is class level functionality
// instead of using static to use class level values we use object in scala
// 
object Scala_Objs extends App{
    object inner_test{
        var t = 20   // this is equivalent to using static int t= 20 in java aka class level functionality
    }

    println(inner_test.t)

    var test1 = inner_test // notice the absense of new identifier indicating use of singleton instance
    var test2 = inner_test

    if(test1 == test2){
        println("matches")   //this will match bc objects create single instance so any no of var used will point to same inst
    }


    var tt = new ThisClass()
    tt.checkout


}

class ThisClass(){
    object checkout{
        println("inside checkout")
        var test = 2
    }
}