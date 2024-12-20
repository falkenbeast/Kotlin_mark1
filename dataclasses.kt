data class User(val name: String, val age: Int)

fun main() {
    val user1 = User("Alice", 30)
    val user2 = User("Bob", 25)

    println(user1) // Output: User(name=Alice, age=30)
    println(user2) // Output: User(name=Bob, age=25)

    println(user1 == User("Alice", 30)) // Output: true (structural equality)

    val user3 = user1.copy(age = 31)
    println(user3) // Output: User(name=Alice, age=31)
}


//a data class Automatically generates equals(), hashCode(), toString(), copy(), and componentN() methods. Focuses on holding data (properties).