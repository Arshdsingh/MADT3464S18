/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern2;

/**
 *
 * @author macstudent
 */
public class Pattern2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          for(int i=5; i>=1; i--) {
            for (int j=1;j<i;j++) {
                System.out.print(j+" ");
            }
            
            
            System.out.println();
        }
        for(int i=2;i<=5;i++) {
            for(int j=1;j<i;j++) {
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
        
        
                    }
    }
    
