/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */

class Solution {
    public int reverse(int x) {
        int sign =1;
        boolean flag = false;
        try {
            if(x < 10 && x > -10){
                return x;
            }
            
            if(x<0){
                sign =-1;
                x = x / -1;
            }
            String Number = String.valueOf(x);
            char[] NumberChars = Number.toCharArray();
            String Reverse="";
        
            int i=0;
            int last = NumberChars.length - 1;
            while(i <= last){
                Reverse+= NumberChars[last - i];
                i=i+1;
            }
            x = Integer.parseInt(Reverse);
            return x * sign;
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
            flag = true;
        }
        finally{
            if(flag){
                return 0;
            }
            return x * sign;
        }

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
}
