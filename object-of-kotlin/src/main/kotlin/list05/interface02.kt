package list05

interface Name {
    val firstName: String
    val lastName: String
}

class Person(override val firstName: String, override val lastName: String): Name

fun main(args: Array<String>): Unit {
    val person = Person("Alice", "Sample01")
    println("firstName:${person.firstName}, lastName:${person.lastName}")
}