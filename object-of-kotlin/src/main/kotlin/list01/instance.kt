package list01

class Empty

class Button {
    fun click(): Unit {
        println("clicked")
    }
}

class ButtonConstructor(private var color: String) {
    fun click(): Unit {
        println("$color button was clicked!")
    }
}

fun main(args: Array<String>) {
    // インスタンス化
    val empty = Empty()
    val button = Button()
    button.click()

    // コンストラクタ
    val subButton = ButtonConstructor("Red")
    // private にすることで外部から参照不可にできる
    // subButton.color = "Blue"
    subButton.click()
}