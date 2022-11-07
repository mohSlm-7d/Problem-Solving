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
    void Merge(int data[], int first, int mid,  int last){
        int i= first, j= mid+1, k = 0;
        int[] SubArray = new int[last - first +1];    
    
        while(i<= mid && j<= last){
            if(data[i] < data[j]){
                SubArray[k++] = data[i++];
            }
            else if(data[j] < data[i]){
                SubArray[k++] = data[j++];
            }
            else{
                SubArray[k++]=data[i++];
                SubArray[k++]=data[j++];
            }
         }

        while(i<= mid){
            SubArray[k++]=data[i++];
        }
        while(j<= last){
            SubArray[k++]=data[j++];
        }

        k=0;
        i = first;
        while(k < last - first +1){
            data[i] = SubArray[k];
            k++;
            i++;
        }
    
    }
    void mergeSort(int data[] , int first, int last){
        if(first < last){
            int mid = (first + last) /2;
            mergeSort(data, first, mid);
            mergeSort(data, mid + 1, last);
            Merge(data, first, mid, last);
        }
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

