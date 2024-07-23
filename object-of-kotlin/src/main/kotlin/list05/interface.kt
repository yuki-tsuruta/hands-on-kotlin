package list05

interface Clickable {
    fun click()
    fun defaultImp() = println("これはデフォルトの実装です")
    val color: String

    // プロパティのデフォルト値も設定できる
    val size: String
        get() = "normal"
}

class Button(override val color: String): Clickable {
    override fun click() = println("interface button")
}

fun main(args: Array<String>): Unit {
    val button = Button("Red")
    button.click()

    // interfaceのデフォルト実装
    button.defaultImp()

    // プロパティをもたせる
    println("color is ${button.color}")
    println("size is ${button.size}")
}