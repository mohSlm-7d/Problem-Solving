/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */



class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
     private static void Swap(int [] array, int i, int j){
            int temp= array[i];
            array[i]= array[j];
            array[j]= temp;
            
        }
    private static int Partition(int []start, int[] finish, int low, int high){
        int pivot_F = finish[low];
        int pivot_S= start[low];
        
        while(low< high){
            
            while(finish[high] > pivot_F && low < high ){
                high--;
            }
            if(low != high){
                Swap(finish, low, high);
                Swap(start, low, high);
                low++;
                
            }
            
            
            while(finish[low] < pivot_F && low < high){
                low++;
            }
            if(low != high){
                Swap(finish, low, high);
                Swap(start, low, high);
                high--;
            }           
        
        }
        
        finish[high]= pivot_F;
        start[high]= pivot_S;
        return low;
        
    }
    private static void QuickSort(int[] start, int[] finish, int first, int last){
        if(first < last){
            int pivotLoc= Partition(start, finish, first, last);
            QuickSort(start, finish, first, pivotLoc-1);
            QuickSort(start, finish, pivotLoc+1, last);
        }
        
    }
   
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        QuickSort(start, end, 0, n-1);
        int[] Recent= new int[2];
        
        int meetings=0;
        int i=0; 
        while(i< n){
            if(i==0 ){
                Recent[0] = start[i];
                Recent[1] = end[i];
                
                meetings++;
            }
            else if(Recent[1] < start[i]){
                Recent[0] = start[i];
                Recent[1] = end[i];
                
                meetings++;
            }
            
            i++;
        }
        
        return meetings;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}