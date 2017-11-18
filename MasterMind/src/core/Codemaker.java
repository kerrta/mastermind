/*
 * Travis Kerr
 * COP 3330
 * MasterMind
 */
package core;

// Imports
import static constants.Constants.MAX_PEGS;
import static constants.Constants.codeColors;
import static core.Codebreaker.codebreakerAttempt;
import java.util.ArrayList;
import java.awt.Color;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
// Creates the secret code and counts correct guesses in correct positions
public class Codemaker implements ICodemaker {
    // The secret code
    static Set<Color> secretCode;
    // The code maker's response
    static ArrayList<Color> codemakerResponse;
    // ArrayList version of secretCode
    static ArrayList<Color> secretlist;    
    // Getter for secretCode
    public Set getSecretCode(){
        return secretCode;
    }
    // Getter for codemakerResponse
    public ArrayList getCodemakerResponse(){
        return codemakerResponse;
    }
    // Setter for secretCode
    public void setSecretCode(Set secretCode){
        this.secretCode = secretCode;
    }
    // Setter for codemakerResponse
    public void setCodemakerResponse(ArrayList codemakerResponse){
        this.codemakerResponse = codemakerResponse;
    }
    // Constructor that generates the secret code
    public Codemaker(){
        // Initializes secretCode
        secretCode = new HashSet();
        // Initializes codemakerResponse
        codemakerResponse = new ArrayList();
        // Generates secret code
        generateSecretCode();
    }
    // Getter for secretlist
    public ArrayList getsecretlist(){
        return secretlist;
    }
    // Sees how close user is to secretCode
    public void checkAttemptedCode(ArrayList<Color> colorlist)
    {
        // red = correct color in correct position, white = correct color in wrong position, n = counter
        int red = 0, white = 0, n = 0;
        // Stores the peg colors
        Set<Color> pegs = new HashSet();
        // Initializes secretlist
        secretlist = new ArrayList<Color>(secretCode);  
        
        System.out.println("Codemaker is checking codebreaker's attempt");
        // User guesses correct code
        if(secretlist.equals(codebreakerAttempt))
        {
            System.out.println("Your guessed it!!!");
            
            red = 4;
            white = 0;
        }
        // User guesses some or no color right in code
        else
        {
            // Finds correct color in correct position
            for(int i = 0; i < MAX_PEGS; i++)
            {
                // Correct color in correct position
                if(secretlist.get(i) == codebreakerAttempt.get(i))
                {
                    System.out.println("Found correct color in correct position!");
                    red++;
                    // Adds correct guess to pegs
                    pegs.add(codebreakerAttempt.get(i));
                }
            }
            // Finds correct color in wrong position
            for(Color color : codebreakerAttempt)
            {
                // Correct color in wrong position
                if(secretlist.get(n) != color && secretlist.contains(color) && !pegs.contains(color))
                {
                    System.out.println("Found correct color in wrong position");
                    white++;
                    // Adds correct color guess to pegs
                    pegs.add(color);
                }
                
                n++;
            }
        }
        
        System.out.println("Red pegs: " + red + " White pegs: " + white);
        // Adds all reds to codemakerResponse
        for(int i = 0; i < red; i++)
        {
            codemakerResponse.add(Color.RED);
        }
        // Adds all whites to codemakerResponse
        for(int i = 0; i < white; i++)
        {
            codemakerResponse.add(Color.WHITE);
        }
        System.out.println("Codemaker's Response:");
        // Prints codemakerResponse
        for(Color colors : codemakerResponse)
        {
            System.out.println(colors);
        }
        // Clears codemakerResponse
        codemakerResponse.clear();
    }
    // Method that generates the secret code
    public void generateSecretCode(){
        // Random initialization
        Random rand = new Random();
        Color col;
        int index;
        // Adds random colors to secretCode
        for(int i = 0; i < 4; )
        {
            // Randomly selects index
            index = 0 + rand.nextInt(7);
            // Stores the randomly selected color
            col = codeColors.get(index);
            // Adds color to secretCode
            if(secretCode.add(col)){
                i++;
            }
            
        }
        // Prints the secret code
        for(Color c : secretCode){
            
            System.out.println(c);
        }
        
    }
    
}
