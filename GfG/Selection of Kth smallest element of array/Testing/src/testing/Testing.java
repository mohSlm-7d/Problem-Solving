/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing;

/**
 *
 * @author DELL
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    
    private static void Swap(int [] array, int i, int j){
            int temp= array[i];
            array[i]= array[j];
            array[j]= temp;
            
        }
        
    private static int Partition(int[] array, int low, int high){
        int pivot = array[low];
        
        while(low< high){
            
            while(array[high] > pivot && low < high ){
                high--;
            }
            if(low != high){
                Swap(array, low, high);
                low++;
                
            }
            
            
            while(array[low] < pivot && low < high){
                low++;
            }
            if(low != high){
                Swap(array, low, high);
                high--;
            }           
        
        }
        
        array[high]= pivot;
        return low;
        
    }
    public static int quickSort(int[] arr, int l, int r, int k){
        if(l >=  r){
            return arr[k];
        }
        
        int divide= Partition(arr, l, r);
        System.out.println("K: "+ k+"\n"+"l: "+l+"\n"+"r: "+r);
        if(k < divide){
            kthSmallest(arr, l, divide - 1, k);
        }
        
        else if(k > divide){
            kthSmallest(arr, divide+1, r, k);
        }
        else{
            return arr[k];
        }
        
        /*int i=0;
        while(i< k){
            quickSort(arr, l, r);
            i++;
        }
        return arr[k];*/
        
        return arr[k];
    }
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
       return quickSort(arr, l, r, k);
        
    } 
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*int[] num =new int[6];
      
        num[0]= 7;
        num[1]= 10;
        num[2]= 4;
        num[3]=3;
        num[4]= 20;
        num[5]= 15;
        */
        
        String testcase= "73 188 894 915 940 616 900 548";
        String [] testStrings= testcase.split(" ");
        int num[]= new int[testcase.split(" ").length];
        
        for(int i=0; i< testStrings.length; i++){
            num[i]=Integer.parseInt(testStrings[i]);
        }
        
        
        System.out.println("Answer: "+kthSmallest(num, 0, 7, 7));
        
        for(int i=0; i< num.length; i++){
            System.out.println(num[i]);
        }
    }
    
}
