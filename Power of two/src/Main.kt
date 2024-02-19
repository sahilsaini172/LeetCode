import kotlin.math.pow

fun main() {
    println(isPowerOfTwo(16777217))
}

fun isPowerOfTwo(n: Int): Boolean {
    return if (n <= 0) false else (n and -n) == n
}