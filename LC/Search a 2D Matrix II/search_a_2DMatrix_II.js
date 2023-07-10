/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    const values = new Set();
    /*let i = matrix.length - 1;
    let j = matrix[0].length - 1;*/

    for(let i = 0; i< matrix.length; i++){
        if(target < matrix[i][0]){
            continue;
        }
        else if(target > matrix[i][matrix[0].length - 1]){
            continue;
        }
        for(let j = 0; j< matrix[0].length; j++){
            if(target < matrix[i][j]){
                break;
            }
            else if(target === matrix[i][j]){
                return true;
            }
        }
    }

    return false;
};