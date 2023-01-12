import javax.swing.*;
import java.awt.*;
public class MenuGUI extends JFrame {

    protected JPanel panel;
    protected JButton startButton, tabOfPlayersPointsButton,testPlayButton, exitButton;

    public MenuGUI(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(146,146,146)); //8F00FF
        this.setSize(1000,700);
        this.setTitle("Ear Awesome Trainer");
        this.setLocationRelativeTo(null);

        this.panel= new JPanel();
        this.panel.setLayout(new GridLayout(0,1));

        startButton = new JButton("Zagraj");
        this.startButton.setFocusable(false);
        this.startButton.setBackground(new Color(143, 0, 255));
        this.startButton.setForeground(new Color(240, 250, 161));
        this.startButton.setFont(new Font("Segoe Print", Font.PLAIN, 40));
        this.panel.add(startButton);

        tabOfPlayersPointsButton = new JButton("Wyniki");
        this.tabOfPlayersPointsButton.setFocusable(false);
        this.tabOfPlayersPointsButton.setBackground(new Color(121, 1, 217, 255));
        this.tabOfPlayersPointsButton.setForeground(new Color(240, 250, 161));
        this.tabOfPlayersPointsButton.setFont(new Font("Segoe Print", Font.PLAIN, 40));
        this.panel.add(tabOfPlayersPointsButton);

        testPlayButton = new JButton("Test");
        this.testPlayButton.setFocusable(false);
        this.testPlayButton.setBackground(new Color(99, 1, 176, 255));
        this.testPlayButton.setForeground(new Color(240, 250, 161));
        this.testPlayButton.setFont(new Font("Segoe Print", Font.PLAIN, 40));
        this.panel.add(testPlayButton);

        exitButton = new JButton("Zakończ");
        this.exitButton.setBackground(new Color(82, 0, 143));
        this.exitButton.setForeground(new Color(240, 250, 161));
        this.exitButton.setFocusable(false);
        this.exitButton.setFont(new Font("Segoe Print", Font.PLAIN, 40));
        this.exitButton.addActionListener(new CloseListiner());
        this.panel.add(exitButton);

        this.add(panel);
        this.setVisible(true);
    }

    private LevelGUI levelWindow;
    public void pressZagraj(){
        this.levelWindow = new LevelGUI(this.getX(), this.getY());
        this.setVisible(false);
        this.levelWindow.gameItSelf();
    }

    public void setPosition(int x, int y){
        this.setPosition(x,y);
    }
}