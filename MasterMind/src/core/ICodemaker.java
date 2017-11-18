/*
 * Travis Kerr
 * COP 3330
 * MasterMind
 */
package core;
// Imports
import java.awt.Color;
import java.util.ArrayList;


public interface ICodemaker {
    // Method signatures
    public void generateSecretCode();
    public void checkAttemptedCode(ArrayList<Color> colorlist);
}
