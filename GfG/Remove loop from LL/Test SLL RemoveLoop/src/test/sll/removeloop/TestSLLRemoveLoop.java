/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test.sll.removeloop;

/**
 *
 * @author DELL
 */
import java.util.*;
public class TestSLLRemoveLoop {

    /**
     * @param args the command line arguments
     */
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        
        Vector<Node> Nodes= new Vector<>();
        Node p = head;
        Node before = null;
        int Count=0;
        
        
        //Node Search= head;
        while(p != null){
            Count = Nodes.indexOf(p)+1;
            if(Count != 0){
                System.out.println(Nodes.toArray(a));
                break;                
            }
            
            
            Nodes.add(p);
            
            before = p;
            p=p.next;
        }
        if(p==null){
            return ;
        }
        before.next = null;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Node loop;
        /*Node test= new Node();
        Node p= new Node();
        
        loop= test;
        
        test.data= 7;
        //System.out.println("Passed!"+test.data);
        p.data= 58;
        test.next=p;
        
        p.next= new Node();
        p=p.next;
        p.data= 36;
        
        p.next = new Node();
        p=p.next;
        p.data= 34;
        
        
        p.next= new Node();
        p=p.next;
        p.data= 16;
        
        p.next= loop;
        //36 34 16    1
        
        
        
        Node I= test;
        boolean flag=false;
        while(I != test || !flag){
            System.out.println(I.data);
            if( I == loop){
                flag= true;
            }
            I= I.next;
            
        }
        
        
        removeLoop(test);
        System.out.println("\n\nAFTER: \n\n");
        
        I= test;
        while(I!=null){
            System.out.println(I.data);
            
            I= I.next;
        }*/
        
        


////////////////////////////////////////62 20 37 80 14 14 69 71 56 47

        
        Node test2= new Node();
        Node p= new Node();
        
        test2.data= 62;
       
        p.data= 20;
        test2.next=p;
        
        loop = new Node();
        loop.data= 37;
        p.next= loop;
        p= p.next;
        
        
        
        
        
        p.next = new Node();
        p=p.next;
        p.data= 80;
        
        
        p.next= new Node();
        p=p.next;
        p.data= 14;
        
        p.next= new Node();
        p=p.next;
        p.data= 14;
        
        p.next= new Node();
        p=p.next;
        p.data= 69;
        
        p.next= new Node();
        p=p.next;
        p.data= 71;
        
        
        p.next= new Node();
        p=p.next;
        p.data= 56;
        
        
        p.next= new Node();
        p=p.next;
        p.data= 47;
        
        p.next = loop;
        
        Node I= test2;
        boolean flag=false;
        while(I != loop || !flag){
            System.out.println(I.data);
            if(I == loop){
                flag= true;
            }
            I= I.next;
            
        }
        System.out.println(I.next.data);
        
        removeLoop(test2);
        System.out.println("\n\nAFTER: \n\n");
        
        I= test2;
        while(I!=null){
            System.out.println(I.data);
            
            I= I.next;
        }        
        
        
        
    }
    
}
