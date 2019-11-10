import javax.swing.*;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Player {
    Image img = new ImageIcon("res/player.png").getImage();
    int v = 100; // скорость, например 40 пикселей в час
    int dv = 0; // ускорение
    int s = 0; // полный путь

    // координаты авто по xy
    int x = 30;
    int y = 200;

    int layer1 = 0; // координата первого слоя
    int layer2 = 1200; // координата второго слоя

    public void move() {
        s += v; // сколько проехали
        if (layer2-v == 0) {
			layer1 = 0;
			layer2 = 1200;
		} else {
			layer1 -= v; // скорость увеличивается, а координата слоя уменьшается, таким образом будем создавать иллюзию движения
	        layer2 -= v;
		}
    }
    
    // при нажатии на клавишу
 	public void keyPressed(KeyEvent e) {
// 		JOptionPane.showMessageDialog(null, "key pressed");
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT) { // VK_RIGHT - код клавиши вправо
            
        }
 	}
 	
 	// при отпускании клавиши
 	public void keyReleased(KeyEvent e) {
// 		JOptionPane.showMessageDialog(null, "key released");
 	}
}
