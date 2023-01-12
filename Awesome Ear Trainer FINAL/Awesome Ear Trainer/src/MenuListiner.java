import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListiner implements ActionListener {
    LevelGUI level;
    public MenuListiner(LevelGUI level){
        this.level = level;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.level.play=false;
        Game game = new Game();
        game.startGame();
    }
}

