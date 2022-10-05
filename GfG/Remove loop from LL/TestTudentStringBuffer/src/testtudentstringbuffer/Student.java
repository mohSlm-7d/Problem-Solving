/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testtudentstringbuffer;

/**
 *
 * @author DELL
 */
import java.util.*;
class Student{
    private StringBuffer Name= new StringBuffer("");
    private int ID;
    private String Gender;
    
    public Student(String Name, int ID, String Gender){
        this.Name= this.Name.append(Name);
        this.ID= ID;
        this.Gender= Gender;
    }
    
    public StringBuffer Get_Name(){
        return Name;
    }
    
    
}


