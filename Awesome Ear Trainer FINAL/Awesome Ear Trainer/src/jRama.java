import javax.swing.*;
import java.awt.*;
public class jRama extends JPanel {
    public jRama(){
        super();
    }
    @Override
    protected void paintComponent(Graphics g){
     super.paintComponent((Graphics) g);
     g.drawImage(new ImageIcon("images/obrazek2.png").getImage(),0,0 ,null);
    }
}
