/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */


class Solution {
    
    public void merge(int [] Sub1, int [] Sub2, double[] Array){
        int i=0;
        int j=0;
        int k=0;
        while(i < Sub1.length && j< Sub2.length){
            if(Sub1[i] < Sub2[j]){
                Array[k++] = Sub1[i++];
            }
            else if(Sub2[j] < Sub1[i]){
                Array[k++] = Sub2[j++];
            }
            else{
                Array[k++] = Sub1[i++];
                Array[k++] = Sub2[j++];
            }
        }
        
        while(i < Sub1.length){
            Array[k++] = Sub1[i++];
        }
        
        while(j < Sub2.length){
            Array[k++] = Sub2[j++];
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double [] Merged = new double [nums1.length + nums2.length];
        
        merge(nums1, nums2, Merged);
        
        int median = Merged.length / 2;
        if(Merged.length % 2 == 0){
            return (Merged[median] + Merged[median - 1]) / 2;
        }
        return Merged[median];
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}