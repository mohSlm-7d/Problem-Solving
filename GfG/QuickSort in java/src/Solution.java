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
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if( low < high){
            int divide= partition(arr, low, high);
            
            quickSort(arr, low, divide - 1);
            quickSort(arr, divide+ 1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot= arr[low];
        
        while(low != high){
            
            while(arr[high] > pivot && low < high){
                high--;
            }
            if(low != high){
                arr[low++] = arr[high];
            }
            
            
            while(arr[low] < pivot && low < high){
                low++;
            }
            if(low != high){
                arr[high--]= arr[low];
            }
            
        }
        
        arr[low] = pivot;
        return high;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
