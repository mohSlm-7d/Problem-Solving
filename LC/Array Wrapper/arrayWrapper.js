/**
 * @param {number[]} nums
 */
var ArrayWrapper = function(nums) {
    this.nums = nums;
};

ArrayWrapper.prototype.valueOf = function() {
    let result = 0;
    for(let num of this.nums){
        result+=num;
    }
    return result;
}

ArrayWrapper.prototype.toString = function() {
    let string = "[";
    for(let num of this.nums){
        string += num+",";
    }
    if(string.length === 1){
        string+="]";
        return string;
    }
    string = string.substr(0, string.length - 1);
    string +="]";
    return string;
}

/**
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */