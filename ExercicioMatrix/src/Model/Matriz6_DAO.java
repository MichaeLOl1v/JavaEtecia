
package Model;

import static java.awt.PageAttributes.MediaType.C;
import java.util.Random;
import javax.swing.JOptionPane;

public class Matriz6_DAO {
    public static void vetor () {
        Random gerador = new Random();
        
        int [][] val = new int [6][6];
        String total = " ";
        for(int L = 0 ; L < 6 ; L++){
             for(int c = 0 ; c < 6 ; c++){
                 
                val [L][c] = gerador.nextInt(3);
                total = total + val [L][c] + "  ";     
             }
             
         total = total + "\n";
     
    }
    
     JOptionPane.showMessageDialog(null, total);
    
}

}