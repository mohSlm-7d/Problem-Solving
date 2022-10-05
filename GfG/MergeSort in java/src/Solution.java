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
    
    void merge(int arr[], int l, int m, int r)
    {
        
         // Your code here
         int size1= m - l +1;
         int size2= r-m;
         int [] first = new int [size1];
         int[] last=new int[size2];
         
         int c=0;
         while (c < size1){
             first[c] = arr[l+c];
             c++;
         }
         
         c=0;
         while (c < size2){
             last[c] = arr[m+1+c];
             c++;
         }
         
         int i=0, j=0, k=l;
         while(i < size1 && j< size2){
             if(last[j] < first[i]){
                 arr[k]= last[j];
                 
                 j++;
                 k++;
             }
             
             else if(first[i] < last[j]){
                arr[k]= first[i];
                i++;
                k++;
             }
             else{
                 arr[k]= first[i];
                 i++;
                 k++;
                 
                 
                 arr[k]= last[j];
                 j++;
                 k++;
             }
         }
         
         if(i < size1){
             while(i < size1){
                 arr[k]= first[i];
                 i++;
                 k++;
             }
         }
         
         else{
             while(j< size2){
                 arr[k]= last[j];
                 j++;
                 k++;
             }
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        
        if( r > l){
            int mid = (l+r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

