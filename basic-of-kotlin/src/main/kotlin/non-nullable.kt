fun main(args: Array<String>): Unit {
    val fuga: String? = null
    val piyo: String = "piyo"
    fun hoge(s: String): String {
        return s
    }
}

//fun printNullableStringLength(s: String?) {
//    println(s.length) // s が null の可能性がないので、コンパイルエラーが発生しない
//}

fun printStringLength(s: String): Unit {
    println(s.length) // sがnllの可能性がないので、コンパイルエラーが発生しない
}

fun printStringLengthIf(s: String): Unit {
    if (s.isNullOrBlank()) {
        println(0)
    } else {
        println(s.length) // sがnullの可能性がないので、コンパイルエラーにならない
    }
}

fun printStringLengthSafe(s: String?): Unit {
    // sがnullでない場合、文字列の長さを返す。nullの場合0を返す
    println(s?.length ?: 0)
}