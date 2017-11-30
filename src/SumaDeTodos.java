/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
public class SumaDeTodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int a,b;
   
    for(a = 1; a <= 10; a++){
      for(b = 1; b <= 10; b++){
        if(a * b < 10){
          System.out.print(a * b + "  ");
        }
        else{
          System.out.print(a * b + " ");
        }
        if(b == 10){
          System.out.println("");
        }
    }
    
    }
    }
}
