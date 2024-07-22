fun main(args: Array<String>) {
    // forの基本
    for (i in 1..5) {
        println(fizzBuzz(i))
    }

    // for: downTo
    for (i in 15 downTo 10) {
        println(fizzBuzz(i))
    }

    // fot: step
    for (i in 0..15 step 5) {
        println(i)
    }
}

fun fizzBuzz(i: Int) =
    when {
        i % 15 == 0 -> "FizzBuzz"
        i % 5 == 0 -> "Buzz"
        i % 3 == 0 -> "Fizz"
        else -> "$i"
    }