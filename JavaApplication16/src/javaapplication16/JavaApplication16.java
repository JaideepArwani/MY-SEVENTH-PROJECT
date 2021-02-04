/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner db=new Scanner (System.in);
   
        System.out.println("enter your marks ");
    int mark=db.nextInt();
    
    if (mark<100) {
      
        if (mark>=40){
       System.out.println("pass");  
        }
        else
        { System.out.println("fail");
        }
    }
    else
    {
    System.out.println("not valid");
     }
    
    }
    }


