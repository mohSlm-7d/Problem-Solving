/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int low=0;
        int high= low+1;
        boolean Checked = false;
        while(low < words.length && high < words.length){
            int j=0;
            while(j< words[low].length() && j< words[high].length()){
                char LowChar = words[low].charAt(j);
                char HighChar = words[high].charAt(j);
                if(LowChar != HighChar){
                    int i=0;
                    int LowInOrder = -1;
                    int HighInOrder = -1;
                    while(i< order.length()){
                        if(LowInOrder != -1 && HighInOrder != -1){
                            break;
                        }
                        if(LowChar == order.charAt(i)){
                            LowInOrder = i;                            
                        }

                        if(HighChar == order.charAt(i)){
                            HighInOrder = i;
                        }

                        i++;
                    }
                    System.out.println("Checking "+ low+", "+high);
                    if(HighInOrder < LowInOrder){
                        return false;
                    }
                    else{
                        Checked = true;
                        break;
                    }
                }
                j=j+1;
            }
            if(!Checked && words[high].length() < words[low].length()){
                return false;
            }
            
            low = low +1;
            high = high +1;
        }

        return true;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
