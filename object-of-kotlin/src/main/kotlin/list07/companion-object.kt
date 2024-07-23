package list07

class PointXY private constructor(val x: Int, val y: Int) {
    companion object {
        fun create(x: Int, y: Int): PointXY {
            return PointXY(x, y)
        }
    }
}

fun main(args: Array<String>): Unit {
    println(PointXY.create(1,2))
}