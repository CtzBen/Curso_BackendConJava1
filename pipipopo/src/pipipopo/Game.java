
package pipipopo;

/**
 *
 * @author Costanzo
 */
public class Game {

    private GameWindow gameWindow;
    private GamePanel gamePanel;
    
    public Game() {
        System.out.println("I AM ALIVE!");
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
    }
    
    
    
}
