class Person(val name: String, val age: Int, val address: String? = null) {           //normal constructor class 

    fun displayInfo() {
        println(name)
        println(age)
        println(address) // Prints null if address is not provided
    }
}


class Personn(                              //class with construction with init block
    val name: String,
    val age: Int,
    val phoneNumber: String,
    val displayName: String,
    val address: String? = null,
    val email: String? = null
) {
    init {
        println("Person object created:")
        println("Name: $name")
        println("Display Name: $displayName")
        println("Phone Number: $phoneNumber")
        println("Age: $age")
        address?.let { println("Address: $it") } ?: println("Address: Not Provided")
        email?.let { println("Email: $it") } ?: println("Email: Not Provided")
        println("--------------------")
    }

    fun displayInfo() {
        println(name)
        println(age)
        println(address)
        println(phoneNumber)
        println(displayName)
        println(email)
    }
}

class Product {                                         //class with two constructor of different parameters 
    val name: String
    val price: Double
    val description: String?
    val category: String

    // Primary constructor (takes all parameters)
    constructor(name: String, price: Double, description: String?, category: String) {
        this.name = name
        this.price = price
        this.description = description
        this.category = category
    }

    // Secondary constructor (omits description)
    constructor(name: String, price: Double, category: String) : this(name, price, null, category) {
        println("Secondary constructor called for $name") //Demonstration of code execution
    }

    fun displayInfo() {
        println("Name: $name")
        println("Price: $price")
        println("Description: ${description ?: "Not available"}")
        println("Category: $category")
    }
}




fun main() {
    val person1 = Person("Alice", 30, "123 Main St")
    val person2 = Person("Bob", 25)

    person1.displayInfo()
    person2.displayInfo()



    val person3 = Personn("Alice", 30, "555-1234", "Ali", "123 Main St", "alice@example.com")
    val person4 = Personn("Bob", 25, "555-5678", "Bobby")

    person3.displayInfo()
    println()
    person4.displayInfo()


    val product1 = Product("Laptop", 1200.00, "High-performance laptop", "Electronics")
    val product2 = Product("Book", 15.99, "Fiction")

    product1.displayInfo()
    println()
    product2.displayInfo()


}



  

    



  