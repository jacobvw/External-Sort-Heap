/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp317.assign1;

/**
 *
 * @author jacobvw
 */
public class Comp317Assign1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length != 2) {
            System.err.println("Usage: MakeRuns <int> <filename>");
        }
        
        try {
            int memSize = Integer.parseInt(args[0]);
            String fileName = args[1];
        } catch(Exception e) {
            System.err.println("Usage: MakeRuns <int> <filename>");
            System.exit(1);
        }
    }
    
}
