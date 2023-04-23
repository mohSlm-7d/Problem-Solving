import java.util.ArrayList;
import java.util.HashMap;
import java.util.Enumeration;
public class Solution {
    public static void main(String[] args){
        int size = 5;
        boolean val = true;
        
        int[][] image = new int[5][5];
        for(int i=0; i<size; i++){
            for(int j=0; j< size; j++){
                val = !val;
                image[i][j] = val? 1 : 0;

            }
        }

        System.out.println("Before: ");
        for(int i=0; i<size; i++){
            for(int j=0; j< size; j++){
                System.out.print(image[i][j]+"\t");

            }
            System.out.println();
        }
        try{
            UpdateMatrix(image);
        }catch(Exception runtime_error){
            System.out.println(runtime_error.getMessage());
        }finally{
            System.out.println("After: ");
            for(int i=0; i<size; i++){
                for(int j=0; j< size; j++){
                    System.out.print(image[i][j]+"\t");
    
                }
                System.out.println();
            }
        }

    }
    
    public static void UpdateMatrix(int[][] pixels) throws Exception{
        HashMap<Integer, Integer> ColsMap = new HashMap<>();
        int i=0, j=0;
        while(j< pixels[i].length){
            i=0;
            int count=0;
            while(i< pixels.length){
                if(pixels[i][j] == 1){
                    count++;
                }
                i++;
            }
            ColsMap.put(j, count);
            j++;
        }

        HashMap<Integer, Integer> RowsMap = new HashMap<>();
        i=0;
        j=0;
        while(i< pixels.length){
            j=0;
            int count=0;
            while(j< pixels[i].length){
                if(pixels[i][j] == 1){
                    count++;
                }
                j++;
            }
            RowsMap.put(i, count);
            i++;
        }

        i=0;
        j=0;
        while(i< pixels.length){
            j=0;
            while(j< pixels[i].length){
                pixels[i][j] = RowsMap.get(i) - ColsMap.get(j);
                j++;
            }
            i++;
        }


    }
}
