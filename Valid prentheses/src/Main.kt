import java.util.*

fun main() {
    val s = "()"
    println(isValid(s))
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()

    for (char in s) {
        when (char) {
            '(', '{', '[' -> stack.push(char)
            ')' -> if (stack.isEmpty() || stack.pop() != '(') return false
            '}' -> if (stack.isEmpty() || stack.pop() != '{') return false
            ']' -> if (stack.isEmpty() || stack.pop() != '[') return false
        }
    }

    return stack.isEmpty()
}
