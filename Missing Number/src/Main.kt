fun main() {
    println(missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
}

fun missingNumber(nums: IntArray): Int {
    val expectedSum = (nums.size * (nums.size + 1)) / 2
    var actualSum = 0
    for (num in nums) {
        actualSum += num
    }
    return expectedSum - actualSum
}
