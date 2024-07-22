fun main(args: Array<String>): Unit {
    // valで宣言すると不変
    val id: Int = 100
    println(id) // 100
    // 再代入しようとするとコンパイルエラーが発生する
    // id = 200

    // varで宣言すると可変
    var name: String = "msk"
    println(name)
    name = "bob"
    println(name)

    val name2: String
    // 以下の if 文は必ずどちらかのブロックで 1 回だけ初期化されていることが保証されているため、コンパイルが通る
    name2 = if (isRandom()) {
        "Alice"
    } else {
        "Bob"
    }
    println(name2)
}

/**
 * isRandom()
 *
 * Math.random() は 0 <= n < 1 範囲でランダムな数字（Double）を生成する
 * 二分の一の確率で true/false が決まる
 */
fun isRandom(): Boolean = Math.random() >= 0.5