package list02

class Button(val color: String, var number: Int) {
    fun click(): Unit {
        println("$number of $color button was clicked!")
    }
}

fun main(args: Array<String>) {

    val button = Button("Red", 3)
    // getter が呼びされている
    println("button.color: ${button.color}")
    println("button.number: ${button.number}")
    button.click()

    // button.color = "Blue" コンパイルエラーが発生する
    // setter が呼び出されている
    button.number = 1
    button.click()
}