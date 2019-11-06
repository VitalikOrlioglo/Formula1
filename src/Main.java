import javax.swing.JFrame;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("Formula1");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1100, 600);
        f.add(new Road()); // добавляем дорогу

        f.setVisible(true);
    }

}
