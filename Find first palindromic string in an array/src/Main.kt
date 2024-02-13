fun main() {
    val words = arrayOf("notapalindrome","racecar")
    println(firstPalindrome(words))
}

fun firstPalindrome(words: Array<String>): String {
    var result: String = ""
    if (words.isEmpty()) {
        result = ""
    } else {
        var i = 0
        while (i < words.size) {
            var word = words[i]
            if (word == word.reversed()) {
                result = word
                break
            } else {
                i++
            }
        }
    }
    return result
}