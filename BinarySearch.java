/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Al-Amin Ahmed <alaminahmed@BRACU>
 */

import java.util.Arrays;
import java.util.Scanner;



public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] uniqueArraySequence = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int index, id ;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer ID: ");
        id = keyboard.nextInt();
        
        index = Arrays.binarySearch( uniqueArraySequence, id );
        
        // If found variable "index" should show index in the array; 
        // if not, the insertion point of new value with negative sign.
        // Uncomment the following line to check the value of returned index 
//         System.out.println(index);
        
        if ( index < 0 ){
            System.out.println( id + " is not in the unique array sequence" );
        }
        else{
            System.out.println( id + " is in the unique array sequence at index: " + index );
        }
        
    }
    
}
