
package pipipopo;

import javax.swing.JFrame;

public class GameWindow {

    private JFrame jframe;

    public GameWindow(GamePanel gamePanel) {
        
        jframe = new JFrame();
        
        
        
        jframe.setSize(640, 480);
        jframe.setDefaultCloseOperation(3);
        jframe.add(gamePanel);
        jframe.setVisible(true);
    }
    
    
            
    
}
