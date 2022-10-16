/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package number.of.valid.clock.times;

/**
 *
 * @author DELL
 */
class Solution {
    public int countTime(String time) {
        String [] TimeParts =  time.split(":", 2);
        int count = 0;
        
        if(TimeParts[0].charAt(0) == '?' && TimeParts[0].charAt(1) == '?'){
            count += 24;
        }
        else if(TimeParts[0].charAt(0) == '?' || TimeParts[0].charAt(1) == '?'){
            if(TimeParts[0].charAt(0) == '?'){
                int Check = Character.getNumericValue(TimeParts[0].charAt(1));
                int i=0;
                while( (i * 10 ) + Check <= 23){
                    count += 1;
                    i++;
                }
                
            }
            else{
                int Check = Character.getNumericValue(TimeParts[0].charAt(0));
                int i=0;
                while( (Check * 10) + i <= 23 && i<= 9){
                    count += 1;
                    i++;
                }
            }
            
        }
        
        else{
            count = 1;
        }
        
        
        
        // mins
        
        
        
        int countMins = 0;
        if(TimeParts[1].charAt(0) == '?' && TimeParts[1].charAt(1) == '?'){
            countMins += 60;
        }
        else if(TimeParts[1].charAt(0) == '?' || TimeParts[1].charAt(1) == '?'){
            if(TimeParts[1].charAt(0) == '?'){
                int Check = Character.getNumericValue(TimeParts[1].charAt(1));
                int i=0;
                while( (i * 10 ) + Check <= 59){
                    countMins += 1;
                    i++;
                }
                
            }
            else{
                int Check = Character.getNumericValue(TimeParts[0].charAt(0));
                int i=0;
                while( (Check * 10) + i <= 59 && i<= 9){
                    countMins += 1;
                    i++;
                }
            }
            
        }
        
        else{
            countMins = 1;
        }
        
        
        return count * countMins;
    }
    
    public static void main(String [] args){
        //Code Here...
    }
}
