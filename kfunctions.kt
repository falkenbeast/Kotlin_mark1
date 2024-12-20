

import kotlin.repeat






fun main(){                     //main function, by default all function return UNIT type object like void in java not exactly but like that 
    makenoise()
    greet("ayush")
   println(mult(3, 5)) 
}


fun makenoise (){
    println("argh!!")    //new function , in kotlin we don't need to specify any return type if its not returning any thing 
}



fun greet(name : String)        //normal passing fucntion
{
   
     println("hello $name")
}



fun mult(a : Int , b: Int): Int{     //return type function 
    var aa : Int = a
    var bb : Int = b
     val c = aa*bb
    return c
}


// *** ways to do one functino ***//

fun sq(number : Int): Int {
   return number * number
}


fun sq2(number : Int) : Int = number * number



fun sq3(number : Int ) = number*number


