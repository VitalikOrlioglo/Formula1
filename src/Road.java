import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

/**
 * чтобы что-то поместить на frame, надо его сначала поместить в jpanel
 */
public class Road extends JPanel implements ActionListener {
	
    Timer mainTimer = new Timer(20, this); // каждые 20 миллисекунд будет запускать метод actionPerformed по обьекту this

    Image img = new ImageIcon("res/road2.png").getImage();
    Player player = new Player();
    
     public Road() {
    	 mainTimer.start();
	}
     
     private class myKeyAdapter extends KeyAdapter {
    	// при нажатии на клавишу
		public void keyPressed(KeyEvent e) {
			player.keyPressed(e);
		}
		// при отпускании клавиши
		public void keyReleased(KeyEvent e) {
			player.keyReleased(e);
		}
	}

    /**
     * override paint() in JComponent
     * вызывается каждый раз когда нам нужно перерисовать нашу панель
     * @param g
     */
    @Override
    public void paint(Graphics g){
//        g = (Graphics2D) g;
        g.drawImage(img, player.layer1,0, null); // рисуем первый слой
        g.drawImage(img, player.layer2,0, null); // рисуем второй слой
        g.drawImage(player.img, player.x, player.y, null); // рисуем player
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
    	player.move();
    	repaint(); // перерисовывает paint()
    }
}
