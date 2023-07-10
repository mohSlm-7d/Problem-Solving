/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function(matrix) {
    let Rows = new Set();
    let Cols = new Set();
    let i = 0;
    while(i < matrix.length){
        let j =0;
        while(j< matrix[i].length){
            if(matrix[i][j] === 0){
                Rows.add(i);
                break;
            }
            j++;
        }
        i++;
    }

    i=0;
    j=0;
    while(j < matrix[i].length){
        let i = 0;
        while(i< matrix.length){
            if(matrix[i][j] === 0){
                Cols.add(j);
                break;
            }
            i++;
        }
        j++;
    }
    Rows.forEach((row)=> {
        for(i=0; i<matrix[row].length; i++){
            matrix[row][i] = 0;
        }
    })
    
    Cols.forEach((col)=> {
        for(i=0; i<matrix.length; i++){
            matrix[i][col] = 0;
        }
    })
};