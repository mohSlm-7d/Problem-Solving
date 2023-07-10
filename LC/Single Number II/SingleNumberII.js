/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    let set = new Set();
    let target = new Map();
    for(let num of nums){
        if(!set.has(num)){
            target.set(num, num);
            set.add(num);
        }
        else{
            target.delete(num);
        }
    }

    let targetVal;
    target.forEach((val)=>{
        targetVal = val;
    });
    return targetVal;
};