/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var swap = (a, _1st, _2nd)=>{
    let temp = a[_1st];
    a[_1st] = a[_2nd];
    a[_2nd] = temp;
 };
 var partition = function(nums, first, last){
    let pivotIndex = parseInt(Math.random() * (last - first + 1) + first);
    swap(nums, first, pivotIndex);
    let pivot = nums[first];
    while(first < last){
        while(first < last && pivot < nums[last]){
            last--;
        }
        if(first < last){
            swap(nums, first, last);
        }

        while(first < last && nums[first] <= pivot){
            first++;
        }
        if(first < last){
            swap(nums, first, last);
        }
    }
    nums[last] = pivot;
    return first;
 };
 var quickSort = function(nums, first, last){
     if(first < last){
        let pivot = partition(nums, first, last);
        quickSort(nums, first, pivot-1);
        quickSort(nums, pivot+1, last);
     }
 };
var sortColors = function(nums) {
    quickSort(nums, 0, nums.length - 1);
    return nums;
};