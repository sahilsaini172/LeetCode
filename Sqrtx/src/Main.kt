fun main() {
    println(mySqrt(8))
}

fun mySqrt(x: Int): Int {
    return Math.sqrt(x.toDouble()).toInt()
}
