package list01

fun main(args: Array<String>): Unit {
    val numbers = setOf(1,2,3,4)
    if (numbers.contains(1)) {
        println("1 is in the set")
    }

    println(numbers.toList())

    val mNumbers = mutableSetOf(4,3,2,1)
    mNumbers.add(5)
    println(mNumbers)
    mNumbers.remove(1)
    println(mNumbers)
}