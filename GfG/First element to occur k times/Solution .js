
//User function Template for javascript



/**
 * @param {number[]} arr
 * @param {number} n
 * @param {number} k
 * @returns {number}
*/

class Solution{
    firstElementKTime(arr,n,k){
        //code here
        
        let count =0;
        let Occurrences= new Array(n);
        for(let i=0; i< n; i++){
            let num= arr[i];
            Occurrences[i]=1;
            let j=i-1;
            while(j>=0){
                if(num === arr[j]){
                     Occurrences[j]++;
                     Occurrences[i] =Occurrences[j];
                }
                j--;
            }
            if(Occurrences[i] === k){
                return num;
            }
            
        }
        
        
        
        return -1;
        
    }
}
