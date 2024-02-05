fun main() {
    val s = "MDCLXVII"
    println(romanTOInt(s))
    println(s.length)
}

fun romanTOInt(s: String): Int {
    val map = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    var result = 0
    var i = 0
    while (i < s.length) {
        val current = s[i]
        val value = map[current] ?: return 0
        if (i + 1 < s.length && map[s[i + 1]]!! > value) {
            result -= value
        } else {
            result += value
        }
        i++
    }
    return result
}