/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let unique = new Set(nums)
    while(nums.length > 0){
        nums.pop()
    }
    unique.forEach((item)=> nums.push(item))
};