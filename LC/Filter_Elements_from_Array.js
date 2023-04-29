/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let newArr = new Array();
    arr.forEach((item, index)=> {
        if(fn(item, index)){
            newArr.push(item);
        }
    })

    return newArr;
};