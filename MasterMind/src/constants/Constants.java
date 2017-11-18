/*
 * Travis Kerr
 * COP 3330
 * MasterMind
 */
package constants;
// Imports
import java.util.Arrays;
import java.util.ArrayList;
import java.awt.Color;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// All constant variables
public class Constants {
    public static final ArrayList<Color> codeColors = new ArrayList<Color>(Arrays.asList(Color.BLUE, Color.BLACK, Color.ORANGE, Color.WHITE, Color.YELLOW, Color.RED, Color.GREEN, Color.PINK));
    public static final ArrayList<Color> responseColors = new ArrayList<Color>(Arrays.asList(Color.RED, Color.WHITE));
    public static final int MAX_ATTEMPTS = 10;
    public static final int MAX_PEGS = 4;
    public static final int COLORS = 8;
}
