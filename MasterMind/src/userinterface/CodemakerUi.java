/*
 * Travis Kerr
 * COP 3330
 * MasterMind
 */
package userinterface;

// Imports
import core.Codemaker;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

// GUI for codemaker
public class CodemakerUi {
    
    // Declare JPanels and instance of codemaker
    JPanel codemakerResponse;
    JPanel secretCode;
    Codemaker codemaker;
    JLabel[] secretLabels;
    JLabel[][] responseLabels;
    ImageIcon question;

    
    // Getter for codemakerResponse
    public JPanel getCodemakerResponse(){
        return codemakerResponse;
    }
    
    // Getter for secretCode
    public JPanel getSecretCode(){
        return secretCode;
    }
    
    // CodemakerUi constructor
    public CodemakerUi(Codemaker make) {
        
        // Initializes codemaker to argument
        codemaker = make;
        
        initComponents();
    
    }
    
    private ImageIcon imageResize(ImageIcon icon)
    {
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);
        return icon;
    }

    
    // Initializes all components
    public void initComponents(){
        
        // Initializes JPanels
        codemakerResponse = new JPanel();
        secretCode = new JPanel();
        
        FlowLayout flow = new FlowLayout();
        GridLayout grid = new GridLayout(10, 4);
        
        
        // Sets Border and Size of JPanels
        codemakerResponse.setMinimumSize(new Dimension(310, 550));
        codemakerResponse.setPreferredSize(new Dimension(310, 550));
        codemakerResponse.setBorder(BorderFactory.createTitledBorder("Codemaker Response")); 
        // Sets Layout for codemakerResponse
        codemakerResponse.setLayout(grid);
        secretCode.setMinimumSize(new Dimension(800, 50));
        secretCode.setPreferredSize(new Dimension(800, 50));
        secretCode.setBorder(BorderFactory.createTitledBorder("Secret Code"));
        // Sets Layout for secretCode
        secretCode.setLayout(flow);
        // Initializes the JLabel arrays and instance of ImageIcon
        secretLabels = new JLabel[4];
        responseLabels = new JLabel[10][4];
        question = new ImageIcon(getClass().getResource("question.png"));
        // Loop that implements the secretLabels array
        for(int i = 0; i < secretLabels.length; i++)
        {
            // Initializes instance of JLabel
            secretLabels[i] = new JLabel();
            // Initializes instance of ImageIcon
            ImageIcon image = new ImageIcon();
            // Resizes image
            image = imageResize(question);
            // Sets the instance of JLabel as the image
            secretLabels[i].setIcon(image);
            // Adds the JLabel array to secretCode
            secretCode.add(secretLabels[i]);
        }
        // Check Button
        JButton button = new JButton("Check");
        
        // Adds check button to secretCode
        secretCode.add(button);
        // Nested Loop that implements the responseLabels array
        for(int n = 0; n < responseLabels.length; n++)
        {
            for(int j = 0; j < responseLabels[n].length; j++)
            {
                // Initializes an instance of JLabel
                responseLabels[n][j] = new JLabel();
                // Sets a border for the instance of JLabel
                responseLabels[n][j].setBorder(BorderFactory.createLineBorder(Color.black));
                // Adds instance of JLabel to codemakerResponse
                codemakerResponse.add(responseLabels[n][j]);
            }
        }
        
    }

}
