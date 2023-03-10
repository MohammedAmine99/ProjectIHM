/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jhangman1;

import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class JHangman1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int WIDTH = 800;
        final int HEIGHT = 600;
        final String TITLE = "Hangman (Java Edition)";
        final ImageIcon backgroundImg = new ImageIcon("C:/Users/PC/Documents/NetBeansProjects/JHangman1/src/img/StartScreen.jpg");

 

        JFrame screen = new JFrame();
        CardLayout cardLayout = new CardLayout();
        screen.setSize(new Dimension(WIDTH, HEIGHT));
        screen.setTitle(TITLE);
        screen.setLocationRelativeTo(null);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        
        ImageIcon image = new ImageIcon("C:/Users/PC/Documents/NetBeansProjects/JHangman1/src/img/png-transparent-computer-icons-hangman-icon-miscellaneous-game-logo-thumbnail.png");
        screen.setIconImage(image.getImage());
        
        JPanel container = new JPanel();
        container.setLayout(cardLayout);
        screen.add(container);

        Words words = new Words();

        StartScreenPanel startScreenPanel = new StartScreenPanel(WIDTH, HEIGHT, backgroundImg, container, cardLayout);
        MainGamePanel mainGamePanel = new MainGamePanel(WIDTH, HEIGHT, container, cardLayout, words);
        CategoryScreenPanel categoryScreenPanel = new CategoryScreenPanel(WIDTH, HEIGHT, backgroundImg, container, cardLayout, mainGamePanel, words);

        container.add(startScreenPanel, "1");
        container.add(categoryScreenPanel, "2");
        container.add(mainGamePanel, "3");

        screen.setVisible(true);
    }
    
}
