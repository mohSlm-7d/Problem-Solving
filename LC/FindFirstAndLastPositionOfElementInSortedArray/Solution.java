package FindFirstAndLastPositionOfElementInSortedArray;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 1){
            if(nums[0] == target){
                return new int[] {0,0};
            }
        }
        int[] range = new int[2];
        range[0] = -1;
        range[1] = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] > target){
                high = mid-1;
            }
            else if(nums[mid] < target){
                low = mid+1;
            }
            else{
                int l = mid;
                while(l >= 0 && nums[l] == target){
                    l--;
                }
                
                int h=mid;
                while(h< nums.length && nums[h] == target){
                    h++;
                }

                if(l == h && nums[h] != target){
                    break;
                }

                range[0] = l+1;
                range[1] = h-1;
                return range;
            }
        }
        return range;
    }
}
