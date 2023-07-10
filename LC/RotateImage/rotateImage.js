/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    let i=0;
    let copy_matrix = [];
    
    while(i< matrix.length){
        let new_matrix= []
        let j=0;
        while(j< matrix[i].length){
            new_matrix.push(matrix[i][j]);
            j++;
        }
        copy_matrix.push(new_matrix);
        i++;
    }

    i=0;
    while(copy_matrix.length > 0){
        let new_matrix = copy_matrix.pop();
        console.log(new_matrix)
        let j=0;
        while(j< new_matrix.length){
            matrix[j][i] = new_matrix[j];
            j++;
        }
        i++;
    }
    
};