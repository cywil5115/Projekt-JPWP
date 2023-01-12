import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class TestGUI extends JFrame {

   ImageIcon icon = new ImageIcon("images/obrazek.png");
    KeyStriker testStriker = new KeyStriker(new BazaDanych());
    public TestGUI(int x, int y){

        this.setSize(890,480);
        this.setTitle("Ear Awesome Trainer Tryb: Pianino                                                                                                      By wyjść należy zamknąć okno");
        this.setLocation(x+50, y+100);
        this.setResizable(false);
        this.setVisible(true);

       JLabel background = new JLabel("",icon,JLabel.CENTER);
       background.setBounds(0, 0, 890, 480);
       add(background);

        this.addKeyListener(testStriker);
        this.testStriker.shouldPlaySet(true);
    }
}
