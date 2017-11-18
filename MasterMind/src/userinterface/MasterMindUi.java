/*
 * Travis Kerr
 * COP 3330
 * MasterMind
 */
package userinterface;

// Imports
import core.Game;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

// GUI for MasterMind
public class MasterMindUi {
    // Member variables
    Game game;
    CodebreakerUi codebreakerUi;
    CodemakerUi codemakerUi;
    JFrame frame;
    JMenuBar menuBar;
    JMenu gameMenu;
    JMenu helpMenu;
    JMenuItem newGameMenuItem;
    JMenuItem exitMenuItem;
    JMenuItem aboutMenuItem;
    JMenuItem rulesMenuItem;
    
    // MasterMindUi constructor
    public MasterMindUi(Game game) {
        
        // Initialize codebreakerUi & codemakerUi
        codebreakerUi = new CodebreakerUi(game.getCodebreaker());
        codemakerUi = new CodemakerUi(game.getCodemaker());
        
        initComponents();
    
}
    // Initializes all components
    public void initComponents(){
        // Initializing frame, menus, and menu items
        frame = new JFrame();
        gameMenu = new JMenu("Game");
        helpMenu = new JMenu("Help");
        newGameMenuItem = new JMenuItem("New Game");
        exitMenuItem = new JMenuItem("Exit");
        aboutMenuItem = new JMenuItem("About");
        rulesMenuItem = new JMenuItem("Rules");
        Dimension preferSize = new Dimension(800, 700);
        // Size and layout of frame
        frame.setPreferredSize(preferSize);
        frame.setMinimumSize(preferSize);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        // Layout
        frame.setLayout(new BorderLayout());
        // Initialize menu bar & add menus
        menuBar = new JMenuBar();
        // Add menu to menu bar
        menuBar.add(gameMenu);
        // Add menu items to menu
        gameMenu.add(newGameMenuItem);
        gameMenu.add(exitMenuItem);
        // Add menu to menu bar
        menuBar.add(helpMenu);
        // Add menu items to menu
        helpMenu.add(aboutMenuItem);
        helpMenu.add(rulesMenuItem);
        // Set menu bar to frame
        frame.setJMenuBar(menuBar);
        
        // Initialize action listeners
        ExitAction exitact = new ExitAction();
        AboutAction aboutact = new AboutAction();
        RuleAction ruleact = new RuleAction();
        
        // Add action listeners to menu items
        exitMenuItem.addActionListener(exitact);
        aboutMenuItem.addActionListener(aboutact);
        rulesMenuItem.addActionListener(ruleact);
        
        // Add initial layout of GUI
        frame.add(codebreakerUi.getCodebreakerAttempt(), BorderLayout.LINE_START);
        frame.add(codebreakerUi.getCodebreakerColors(), BorderLayout.PAGE_END);
        frame.add(codemakerUi.getCodemakerResponse(), BorderLayout.LINE_END);
        frame.add(codemakerUi.getSecretCode(), BorderLayout.PAGE_START);
        
        // Set Visible
        frame.setVisible(true);
    }
    
    // Exit Action Listener
    public class ExitAction implements ActionListener{
        
        // Confirm Dialog if yes, exit
        public void actionPerformed(ActionEvent e) { 
            
            // Confirm to exit MasterMind
            if(JOptionPane.showConfirmDialog(null, "Confirm to exit MasterMind?", "Exit?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
        }
    }
    
    // About Action Listener
    public class AboutAction implements ActionListener{
        
        // About Message Dialog
        public void actionPerformed(ActionEvent e) { 
            
            // About Message
            JOptionPane.showMessageDialog(null, "MasterMind 1.0\nTravis Kerr\nFall 2017");
            
        }
    }
    
    // Rules Action Listener
    public class RuleAction implements ActionListener{
        
        // Rules Message Dialog
        public void actionPerformed(ActionEvent e) { 
            
            // Rules
            JOptionPane.showMessageDialog(null, "Step 1: The codemaker selects a four color secret code, in any order, no duplicate colors.\n\nStep 2: The codebreaker places a guess in the bottom row, no duplicate colors.\n\nStep 3: The codemaker gives feedback next to each guess row with four pegs\n~ Each red peg means that one of the guessed colors is correct, and is in the right location.\n~ Each white pegs means that one of the guessed colors is correct, but is in the wrong location.\n\nStep 4: Repeat with the next row, unless the secret code was guessed on the first turn.\n\nStep 5: Continue until the secret code is guessed or there are no more guesses left, there are 10 attempts.");
            
        }
    }
}

   

