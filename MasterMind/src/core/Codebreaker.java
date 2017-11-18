/*
 * Travis Kerr
 * COP 3330
 * MasterMind
 */
package core;
// Imports
import static constants.Constants.MAX_PEGS;
import java.util.ArrayList;
import java.awt.Color;
import java.util.Scanner;
// Class that allows user to guess the color code
public class Codebreaker implements ICodebreaker {
    // Stores user's guess
    public static ArrayList<Color> codebreakerAttempt;
    // Getter for codebreakerAttempt
    public ArrayList getCodebreakerAttempt(){
        //consoleAttempt();
        return codebreakerAttempt;
    }
    // Setter for codebreakerAttempt
    public void setCodebreakerAttempt(ArrayList codebreakerAttempt){
        this.codebreakerAttempt = codebreakerAttempt;
    }
    // Constructor to initialize ArrayList codebreakerAttempt
    public Codebreaker(){
        codebreakerAttempt = new ArrayList();
    }
    
    public void checkCode(ArrayList<Color> attempt){
        
    }
    // Method that takes in and prints the user's color code guess
    private void consoleAttempt(){
        // Clears codebreakerAttempt
        codebreakerAttempt.clear();
        // Scanner initialization
        Scanner scan = new Scanner(System.in);
        // Used to store user's guess as color
        Color c = null;
        
        System.out.println("\nEnter your colors in left to right order\n" + "Use BLUE, BLACK, ORANGE, WHITE, YELLOW, RED, GREEN, PINK:");
        // Allows user to guess 4 colors for the color code
        for(int i = 0; i < 4;)
        {
            // User input
            String str = scan.next();
            // All uppercase string version of str
            String strUp = str.toUpperCase();
            
            
            // Tests if the user has entered a valid color and stores the user's attempt into codebreakerAttempt
            if(strUp.equals("BLUE"))
            {
                // 1 -- Stores user's entered string as color
                c = Color.BLUE;
                // 2 -- Checks for duplication
                if(codebreakerAttempt.contains(c))
                {
                    System.out.println("You have already entered this color!");
                }
                else
                {
                    System.out.println("You entered " + strUp);
                    // 3 -- Adds user's guess to codebreakerAttempt
                    codebreakerAttempt.add(c);
                    i++;
                }
            }
            else if(strUp.equals("BLACK"))
                {
                    // 1
                    c = Color.BLACK;
                    // 2
                    if(codebreakerAttempt.contains(c))
                    {
                        System.out.println("You have already entered this color!");
                    }
                    else
                    {
                        System.out.println("You entered " + strUp);
                        // 3
                        codebreakerAttempt.add(c);
                        i++;
                    }
                }
            else if(strUp.equals("ORANGE"))
                {
                    // 1
                    c = Color.ORANGE;
                    // 2
                    if(codebreakerAttempt.contains(c))
                    {
                        System.out.println("You have already entered this color!");
                    }
                    else
                    {
                        System.out.println("You entered " + strUp);
                        // 3
                        codebreakerAttempt.add(c);
                        i++;
                    }
                }
            else if(strUp.equals("WHITE"))
                {
                    // 1
                    c = Color.WHITE;
                    // 2
                    if(codebreakerAttempt.contains(c))
                    {
                        System.out.println("You have already entered this color!");
                    }
                    else
                    {
                        System.out.println("You entered " + strUp);
                        // 3
                        codebreakerAttempt.add(c);
                        i++;
                    }
                }
            else if(strUp.equals("YELLOW"))
                {
                    // 1
                    c = Color.YELLOW;
                    // 2
                    if(codebreakerAttempt.contains(c))
                    {
                        System.out.println("You have already entered this color!");
                    }
                    else
                    {
                        System.out.println("You entered " + strUp);
                        // 3
                        codebreakerAttempt.add(c);
                        i++;
                    }
                }
            else if(strUp.equals("RED"))
                {
                    // 1
                    c = Color.RED;
                    // 2
                    if(codebreakerAttempt.contains(c))
                    {
                        System.out.println("You have already entered this color!");
                    }
                    else
                    {
                        System.out.println("You entered " + strUp);
                        // 3
                        codebreakerAttempt.add(c);
                        i++;
                    }
                }
            else if(strUp.equals("GREEN"))
                {
                    // 1
                    c = Color.GREEN;
                    // 2
                    if(codebreakerAttempt.contains(c))
                    {
                        System.out.println("You have already entered this color!");
                    }
                    else
                    {
                        System.out.println("You entered " + strUp);
                        // 3
                        codebreakerAttempt.add(c);
                        i++;
                    }
                }
            else if(strUp.equals("PINK"))
                {
                    // 1
                    c = Color.PINK;
                    // 2
                    if(codebreakerAttempt.contains(c))
                    {
                        System.out.println("You have already entered this color!");
                    }
                    else
                    {
                        System.out.println("You entered " + strUp);
                        // 3
                        codebreakerAttempt.add(c);
                        i++;
                    }
                }
            // Invalid color
            else
            {
                System.out.println("You have entered an invalid color");
            }

            // User cannot enter more than 4 pegs
            if(codebreakerAttempt.size() < MAX_PEGS)
            {
                System.out.println("Next color");
            }
        }
        System.out.println("Codebreaker's Attempt:");
        // Prints codebreaker Attempt
        for(Color col : codebreakerAttempt)
        {
            System.out.println(col);
        }
        
        
    }
    
    public void removeAll()
    {
        
        codebreakerAttempt.clear();
            
    }
    
    
}
