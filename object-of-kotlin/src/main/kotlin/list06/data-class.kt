package list06

data class User(val firstName: String, val lastName: String, val age: Int)

fun main(args: Array<String>): Unit {
    val Alice = User("Alice", "Sara", 30)
    val Sara = User("Alice", "Sara", 30)
    println(Alice.equals(Sara))
    println(Alice.hashCode())
    println(Alice.toString())

    // copyメソッド
    println("=== copy ===")
    val Alice2 = Alice.copy(firstName = "Alice2")
    println(Alice2)
    println(Alice.hashCode())
    println(Alice2.hashCode())
}