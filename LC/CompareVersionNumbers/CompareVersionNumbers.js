class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1Splitted = version1.split("[.]");
        String[] v2Splitted = version2.split("[.]");
        
        int[] nums1 = null;
        int[] nums2 = null;
        int size = 0;
        if(v1Splitted.length > v2Splitted.length){
            size = v1Splitted.length;
            nums1 = new int[size];
            int i=0;
            for(String num1 : v1Splitted){
                nums1[i++]=Integer.valueOf(num1);
            }
            
            nums2 = new int[size];
            for(i=0; i< size; i++){
                if(i>= v2Splitted.length){
                    nums2[i] = 0;
                }
                else{
                    nums2[i] = Integer.valueOf(v2Splitted[i]);
                }
            }

        }
        else if(v2Splitted.length > v1Splitted.length){
            size = v2Splitted.length;
            nums2 = new int[size];
            int i=0;
            for(String num2 : v2Splitted){
                nums2[i++]=Integer.valueOf(num2);
            }
            
            nums1 = new int[size];
            for(i=0; i< size; i++){
                if(i>= v1Splitted.length){
                    nums1[i] = 0;
                }
                else{
                    nums1[i] = Integer.valueOf(v1Splitted[i]);
                }
            }
        }
        else{
            size = v1Splitted.length;
            nums1 = new int[size];
            int i=0;
            for(String num1 : v1Splitted){
                nums1[i++]=Integer.valueOf(num1);
            }


            nums2 = new int[size];
            i=0;
            for(String num2 : v2Splitted){
                nums2[i++]=Integer.valueOf(num2);
            }            
        }


        int i=0;
        while(i< size){
            if(nums1[i] > nums2[i]){
                return 1;
            }
            else if(nums2[i] > nums1[i]){
                return -1;
            }
            i++;
        }
        return 0;
    }
}