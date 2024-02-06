fun main() {
    println(isPalindrome(121))
}

fun isPalindrome(x: Int): Boolean {
    var num = x
    var remainder = 0
    var reversedNumber = 0
    while (num > 0) {
        remainder = num % 10
        reversedNumber = (reversedNumber * 10) + remainder
        num /= 10
    }
    return x == reversedNumber
}