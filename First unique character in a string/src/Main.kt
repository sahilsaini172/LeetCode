fun main() {
    println(firstUniqChar("aabb"))
}

fun firstUniqChar(s: String): Int {
    var i = 0
    var j = 1
    var index = -1
    var first: Char
    var second: Char
    if (s.length != 1) {
        while (i < s.length) {
            first = s[i]
            while (j < s.length) {
                second = s[j]
                if (first == second) {
                    index = -1
                    break
                } else if (first != second) index = i
                j++
            }
            i++
        }
    } else {
        index = 0
    }
    return index
}