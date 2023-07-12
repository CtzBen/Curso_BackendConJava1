package pipipopo;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Costanzo
 */
public class GamePanel extends JPanel{

    public GamePanel() {
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.fillRect(500, 400, 1550, 100);
    }
    
}
