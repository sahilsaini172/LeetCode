fun main() {
    println(strStr("leetcode","leeto"))
}

fun strStr(haystack: String, needle: String): Int {
    if (needle.isEmpty()) return 0

    for (i in 0 until haystack.length - needle.length + 1) {
        if (haystack.regionMatches(i, needle, 0, needle.length)) {
            return i
        }
    }
    return -1
}
