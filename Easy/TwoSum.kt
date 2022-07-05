   fun twoSum(nums: IntArray, target: Int): IntArray? {
        val map: MutableMap<Int, Int> = HashMap()
        val res = IntArray(2)
        for (i in nums.indices) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map[target - nums[i]]!!
                res[1] = i
            } else {
                map[nums[i]] = i
            }
        }
        return res
    }