package arrayList;

import java.util.ArrayList;

import com.sun.corba.se.impl.presentation.rmi.IDLTypeException;

public class arrayli 
{ 
public static void main(String[] args) throws IDLTypeException 
    { 
        int n = 5; 
  
        //declaring ArrayList with initial size n 
        ArrayList al = new ArrayList();
        
        ArrayList <Integer> arrli = new ArrayList<Integer>(n); 
  // Please do some practice about ArrayList and Generics 
        // Appending the new element at the end of the list 
        for (int i=1; i<=n; i++) 
            arrli.add(i); 
  
//        arrli.add("Ten");
        
        // Printing elements 
        System.out.println(arrli); 
  
        // Remove element at index 3 
        arrli.remove(3); 
  
        // Displaying ArrayList after deletion 
        System.out.println(arrli); 
  
        // Printing elements one by one 
        for (int i=0; i<arrli.size(); i++) 
            System.out.print(arrli.get(i)+" "); 
    } 
} 