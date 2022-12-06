/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package k_th_smallest_element_in_bst;

/**
 *
 * @author DELL
 */
public class K_th_Smallest_Element_In_BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Solution Run = new Solution();
        Node root = new Node(0);
        System.out.println(Run.KthSmallestElement(root, 1));
    }
    
}
