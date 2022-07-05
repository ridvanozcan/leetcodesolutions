   fun twoSum(numbers: IntArray, target: Int): IntArray {
            var start = 0
            var end = numbers.size - 1
            var sum = 0
            while (start < end) {
                sum = numbers[start] + numbers[end]
                if (sum == target) {
                    return intArrayOf(start + 1, end + 1)
                } else if (sum < target) {
                    start++
                } else {
                    end--
                }
            }
            return intArrayOf()
        }