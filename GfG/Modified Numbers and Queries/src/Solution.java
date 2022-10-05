/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */



//User function Template for Java
class Solution
{
    public int PrimeSumOf(int num){
        int Sum=0;
        if (num==1){
            return 1;
        }
        int i=2;
        while(i <= num ){
            if(Sum>= num){
                return Sum;
            }
            if(num % i !=0){
                i++;
                continue;
            }
            int j= i/2;
            while(j>=1){
                if(i % j==0 ){
                    break;
                }
                j= j-1;
            }
            if(j<= 1 && Sum + i <= num){
                Sum+= i;
                if(Sum == num ){
                    return Sum;
                }
            }
            i= i +1;
        }
       return Sum; 
        
    }
    //public static int count;
    public int sumOfAll(int l, int r)
    {
        
        //Solution.count= Solution.count +1;
        /*if(Solution.count >= 80){
            return -1;
        }*/
        // code here
        int size= r-l +1;
        int Result= 0;
        int i=0;
        int num=l;
        while(i< size){
            Result = Result + PrimeSumOf(num);
            num++;
            i++;
        }
        
        
        
        return Result;
        
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
