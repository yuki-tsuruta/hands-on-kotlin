package list01

data class Person(var name: String, var age: Int)

fun main(args: Array<String>): Unit {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.get(2))
    println(numbers[2])
    println(numbers.size)
    println(numbers.isEmpty())

    val mNumbers = mutableListOf(1,2,3,4)
    mNumbers.add(5)
    println(mNumbers)
    mNumbers.removeAt(1)

    val alice = Person("Alice", 31)
    val bob = Person("Bob", 32)
    val people = listOf(alice, bob)
    println(people)
    bob.age = 33
    println(people)
}