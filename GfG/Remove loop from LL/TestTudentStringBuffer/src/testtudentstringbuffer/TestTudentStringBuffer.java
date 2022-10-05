/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testtudentstringbuffer;

/**
 *
 * @author DELL
 */
import java.util.*;
public class TestTudentStringBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student Current= new Student("Mohammad", 201990901, "Male");
        Student Other= new Student("Mohammad", 20190901, "Male");
        StringBuffer CurrentNm= Current.Get_Name();
        StringBuffer OtherNm= Other.Get_Name();
        if(CurrentNm == OtherNm){
            System.out.println( Current.Get_Name());
            System.out.print("HHHHH");
        }
        
        //System.out.println(Other.Get_Name());
    }
    
}
