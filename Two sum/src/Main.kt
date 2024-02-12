fun main() {
val nums = intArrayOf(2,7,11,15)
    println(twoSum(nums,9))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    // Use a HashMap to store seen numbers and their indices
    val seen = HashMap<Int, Int>()

    // Iterate through the array
    for (i in nums.indices) {
        val complement = target - nums[i]

        // Check if the complement is already in the HashMap
        if (seen.containsKey(complement)) {
            // If found, return the indices in any order
            return intArrayOf(seen[complement]!!, i)
        }

        // Add the current number and its index to the HashMap
        seen[nums[i]] = i
    }

    // If no solution is found, return an empty array
    return intArrayOf()
}
