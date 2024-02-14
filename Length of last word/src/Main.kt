fun main() {
    val s = "Hello World"
    println(lengthOfLastWord(s))
}

fun lengthOfLastWord(s: String): Int {
    var result = 0
    for (i in s.length - 1 downTo 0) {
        if ((s[i].toString() == " " && result == 0)) continue
        if ((s[i].toString() == " " && result != 0)) break
        result++
    }
    return result
}