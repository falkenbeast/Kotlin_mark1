fun main (){

//var b : String = null //cannot do this in kotlin , cannot move forward without initiallizing 
 //for creating null variable there is a special  way using question mark
 var d : String = "bye "
 println(d.uppercase())

 var c : String ? = null
 println(c)
 c = "hello "
 println(c.uppercase())  //cannot use methods with null variables without taking extra steps




 var a : String ? = null
 println(a?.uppercase())    //add '?' befor ' .fun()'  the variable 

/* or  */
 
var e: String ? = null 
e = "thi is now not null"
if (e != null)
{
    e!!.uppercase();      //this is called non null assertion 
}

}