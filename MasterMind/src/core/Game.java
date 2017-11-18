/*
 * Travis Kerr
 * COP 3330
 * MasterMind
 */
package core;
// Imports
import static constants.Constants.MAX_ATTEMPTS;
import static core.Codebreaker.codebreakerAttempt;
import static core.Codemaker.secretlist;
import java.awt.Color;
import java.util.ArrayList;
// Runs the MasterMind game
public class Game implements IGame {
    int attempt;
    // Instance of Codebreaker
    Codebreaker codebreaker;
    // Instance of Codemaker
    Codemaker codemaker;
    // Getter for attempt
    public int getAttempt(){
        return attempt;
    }
    // Getter for codebreaker
    public Codebreaker getCodebreaker(){
        return codebreaker;
    }
    // Getter for codemaker
    public Codemaker getCodemaker(){
        return codemaker;
    }
    // Setter for attempt
    public void setAttempt(int attempt){
        this.attempt = attempt;
    }
    // Setter for codebreaker
    public void setCodebreaker(Codebreaker codebreaker){
        this.codebreaker = codebreaker;
    }
    // Setter for codemaker
    public void setCodemaker(Codemaker codemaker){
        this.codemaker = codemaker;
    }
    // Constructor that calls Codebreaker, codemaker, and play
    public Game(){
        // Calls Codebreaker
        codebreaker = new Codebreaker();
        // Calls Codemaker
        codemaker =  new Codemaker();
        // Calls play
        //play();
    }
    // Runs the MasterMind gamer
    public void play(){
        // User guesses until they guess the secret code or they have guessed 10 times
        for(int i = 0; (i < MAX_ATTEMPTS) && !(codebreakerAttempt.equals(secretlist)); i++)
        {
            // Calls getter for codebreakerAttempt
            ArrayList<Color> list = codebreaker.getCodebreakerAttempt();
            // Calls checkAttemptedCode
            codemaker.checkAttemptedCode(list);
            // Calls getter for codemakerResponse
            ArrayList<Color> newlist = codemaker.getCodemakerResponse();

            //System.out.println("Codemaker's Response:");

            /*for(Color c : newlist)
            {

                System.out.println(c);
            }*/
        }
    }
}
