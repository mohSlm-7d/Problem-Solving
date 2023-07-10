package RemoveDuplicatesFromSortedArrayVersion_2;

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;         
        int k = 0;
        for(int i=1; i< nums.length - k; i++){
            if(nums[i] == nums[i-1]){                       
                count++;
            }
            
            else if(nums[i] != nums[i-1] && count>=3){
                int swaps = count - 2;
                k+= swaps;
                
                int start=i-swaps;
                int j =start;
                i=i-swaps;
                while(swaps > 0){
                    j = start;
                    while(j+1<= nums.length-1){
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                        j++;
                    }

                    swaps--;
                }
                
                count = 1;
                
            }
            else if(nums[i] != nums[i-1]){
                count = 1;
            }

            if( count>=3 && i+1 == nums.length){
                k+= count-2;                
                count = 1;
            }
            
        }
        if(count >= 3){
            k+= count - 2;
        }
        return nums.length - k;
    }
}
