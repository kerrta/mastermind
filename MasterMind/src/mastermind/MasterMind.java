/*
 * Travis Kerr
 * COP 3330
 * MasterMind
 */

package mastermind;
// Imports
import core.Game;
import javax.swing.JOptionPane;
import userinterface.MasterMindUi;


public class MasterMind {

   
    // MasterMind
    public static void main(String[] args) {
        // Welcomes user
        System.out.println("Welcome to MasterMind!");
        // Popup
        JOptionPane.showMessageDialog(null, "Let's Play MasterMind!");
        System.out.println("generated the secret code!");
        // Runs the MasterMind game
        Game g = new Game();
        
        MasterMindUi master = new MasterMindUi(g);
        
    }
    
}
