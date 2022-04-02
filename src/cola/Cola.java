/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cola;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class Cola {

    /**
     * @param args the command line arguments
     */
 
  public static void main(String[] args){
      
      LinkedList cola1 = new LinkedList();
      LinkedList cola2 = new LinkedList();
      LinkedList cola3 = new LinkedList();
      
      cola1.addFirst(3);
      cola1.addFirst(4);
      cola1.addFirst(2);
      cola1.addFirst(8);
      cola1.addFirst(12);
      
      cola2.addFirst(6);
      cola2.addFirst(2);
      cola2.addFirst(9);
      cola2.addFirst(11);
      cola2.addFirst(3);
      
      while(cola1.size()>0 && cola2.size() > 0)
          cola3.addFirst((int) cola1.removeLast()+ (int) cola2.removeLast());
      
      while(cola3.size() > 0)
          System.out.print("Dato: " + (int) cola3.removeLast() + "\n");
      
      System.out.print("\n\nColas sumadas");
  }
    
}
