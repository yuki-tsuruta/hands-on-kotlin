package list01

fun main(args: Array<String>): Unit {
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
    println(numbersMap)
    println(numbersMap.get("key1"))
    println(numbersMap.get("key0"))

    val mNumbersMap = mutableMapOf("one" to 1, "two" to 2)
    println(mNumbersMap)
    mNumbersMap.put("three", 3)
    mNumbersMap["one"] = 11
    println(mNumbersMap)
}