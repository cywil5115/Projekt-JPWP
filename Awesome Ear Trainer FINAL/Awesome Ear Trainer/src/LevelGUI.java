import javax.swing.*;
import java.awt.*;
import java.awt.desktop.ScreenSleepEvent;
import java.util.concurrent.TimeUnit;

public class LevelGUI extends JFrame {

    Mechanika mechanika;
        KeyStriker levelStriker;
        ImageIcon icon2 = new ImageIcon("images/obrazek2.png");
        JButton menu;
        JLabel display;
        int x,y;
        String licznikPytan = new String("0");
        String licznikPunktow = new String("0");
        BazaDanych baza;
        boolean play=false;

    public LevelGUI(int x, int y){
            this.baza = new BazaDanych();
            this.levelStriker = new KeyStriker(this.baza);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);
            this.setLayout(null);
            this.getContentPane().setBackground(new Color(101, 94, 145)); //8F00FF
            this.setSize(1000,700);
            this.setTitle("Ear Awesome Trainer");
            this.setLocation(x, y);

            jRama background = new jRama();
            //background.setIcon(icon2);
            background.setBounds(0, 60, 1000, 640);
            add(background);
            background.repaint();


            this.menu = new JButton("Menu");
            this.menu.setBackground(new Color(82, 0, 143));
            this.menu.setForeground(new Color(240, 250, 161));
            this.menu.setFocusable(false);
            this.menu.setSize(150,70);
            this.menu.setLocation(0,5);
            this.menu.setFont(new Font("Segoe Print", Font.PLAIN, 40));
            /*GridBagConstraints c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = 0;
            c.weightx = 0.5;
            c.weighty = 0;
            c.anchor = GridBagConstraints.NORTHWEST;*/
            this.add(menu);
            try {
                Robot robot = new Robot();
                robot.mouseMove(x+80, y+70);

            } catch (AWTException e) {
                e.printStackTrace();
            }


            this.display = new JLabel(licznikPytan+"/10"+" Poprawne: "+licznikPunktow+"/10pkt");
            this.display.setBackground(new Color(82, 0, 143));
            this.display.setForeground(new Color(240, 250, 161));
            this.display.setFocusable(false);
            this.display.setLocation(175,5);
            this.display.setSize(700,70);
            this.display.setFont(new Font("Segoe Print", Font.PLAIN, 40));
            /*GridBagConstraints d = new GridBagConstraints();
            d.gridx = 0;
            d.gridy = 0;
            d.weightx = 0.5;
            d.weighty = 0;
            d.anchor = GridBagConstraints.NORTH;*/
            this.add(display);

            this.addKeyListener(levelStriker);
            this.levelStriker.shouldPlaySet(true);
            this.setVisible(true);

        }
        Intervaler pytajnik = new Intervaler();
        public void gameItSelf(){
           this.menu.addActionListener(new MenuListiner(this));
           this.menu.addActionListener(e -> this.setVisible(false));
           this.play=true;
           mechanika = new Mechanika(this);
           mechanika.start();
        }
}