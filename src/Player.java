import javax.swing.*;
import java.awt.Image;

public class Player {
    Image img = new ImageIcon("res/player.png").getImage();
    int v = 40; // скорость, например 40 пикселей в час
    int dv = 0; // ускорение
    int s = 0; // полный путь

    // координаты авто по xy
    int x = 30;
    int y = 200;

    int layer1 = 0; // координата первого слоя

    public void move() {
        s += v; // сколько проехали
        layer1 -= v; // скорость увеличивается, а координата слоя уменьшается, таким образом будем создавать иллюзию движения
    }
}
