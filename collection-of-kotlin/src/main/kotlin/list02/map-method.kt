package list02

fun main(args: Array<String>): Unit {
    val numbers = listOf(1, 2, 3, 4, 5)
    val twoTimeNumbers = numbers.map { it * 2 }
    println(twoTimeNumbers)
}