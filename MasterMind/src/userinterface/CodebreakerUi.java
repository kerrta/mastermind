/*
 * Travis Kerr
 * COP 3330
 * MasterMind
 */
package userinterface;

// Imports
import static constants.Constants.codeColors;
import core.Codebreaker;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

// GUI for Codebreaker
public class CodebreakerUi {
    
    // Declaration of panels, instance of codebreaker, and RoundButton arrays
    JPanel codebreakerAttempt;
    JPanel codebreakerColors;
    Codebreaker codebreaker;
    RoundButton[] buttons;
    RoundButton[][] attempts;
    Color colorSelected;

    
    // Getter for codebreakerAttempt
    public JPanel getCodebreakerAttempt(){
        return codebreakerAttempt;
    }

    // Getter for codebreakerColors
    public JPanel getCodebreakerColors(){
        return codebreakerColors;
    }
    
    // CodebreakerUi constructor
    public CodebreakerUi(Codebreaker br) {
        // Initialize codebreaker to argument
        codebreaker = br;
        
        initComponents();
    
    }
    
    // Initializes all components
    public void initComponents(){
        
        // Initializes the JPanels
        codebreakerAttempt = new JPanel();
        codebreakerColors = new JPanel();
        // Initializes instances of FlowLayout and GridLayout
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        GridLayout grid = new GridLayout(10, 4);
        
        
        // Sets Border and Size of each JPanel
        codebreakerAttempt.setMinimumSize(new Dimension(460, 550));
        codebreakerAttempt.setPreferredSize(new Dimension(460, 550));
        codebreakerAttempt.setBorder(BorderFactory.createTitledBorder("Codebreaker Attempt")); 
        // Sets Layout for codebreakerAttempt
        codebreakerAttempt.setLayout(grid);
        codebreakerColors.setMinimumSize(new Dimension(800, 50));
        codebreakerColors.setPreferredSize(new Dimension(800, 50));
        codebreakerColors.setBorder(BorderFactory.createTitledBorder("Codebreaker Colors")); 
        // Sets Layout for codebreakerColors
        codebreakerColors.setLayout(flow);
        // Initializes RoundButton arrays
        buttons = new RoundButton[8];
        attempts = new RoundButton[10][4];
        // Loop that implements the codebreakerColors RoundButtons
        for(int i = 0; i < buttons.length; i++)
        {
            // Initialiazes instance of RoundButton
            buttons[i] = new RoundButton();
            // Sets the size of the RoundButton for better visuals
            buttons[i].setMinimumSize(new Dimension(50, 50));
            buttons[i].setPreferredSize(new Dimension(25, 25));
            // Instance of Color in codeColors ArrayList
            Color col = codeColors.get(i);
            // Sets background color of RoundButton
            buttons[i].setBackground(col);
            // Adds color key to instance of RoundButton
            buttons[i].putClientProperty("color", col);
            // Sets tool tip text to color name
            buttons[i].setToolTipText(col.toString());
            // Initializes ActionListener
            SelectButton select = new SelectButton();
            // Adds action listener to instance of RoundButton
            buttons[i].addActionListener(select);
            // Adds instance of RoundButton to codebreakerColors
            codebreakerColors.add(buttons[i]);
        }
        // Nested Loop that implements codebreakerAttempt RoundButtons
        for(int n = 0; n < attempts.length; n++)
        {
            for(int j = 0; j < attempts[n].length; j++)
            {
                // Initializes an instance of RoundButton
                attempts[n][j] = new RoundButton();
                attempts[n][j].putClientProperty("row", attempts[n]);
                // Disables all RoundButtons that are not on the bottom row
                if(n != (attempts.length-1))
                {
                    attempts[n][j].setEnabled(false);
                }
                else
                {
                    attempts[n][j].setEnabled(true);
                }
                // Adds the instance of RoundButton to codebreakerAttempt
                codebreakerAttempt.add(attempts[n][j]);
            }
            
        }
        
    }
    
    public class SelectButton implements ActionListener{
        
        public void actionPerformed(ActionEvent e)
        {
            RoundButton instbutton = new RoundButton();
            Object ob = e.getSource();
            instbutton = (RoundButton)ob;
        }
        
        
    }
    
}
