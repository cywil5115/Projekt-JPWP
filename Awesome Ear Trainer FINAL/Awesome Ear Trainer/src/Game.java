//MECHANIKA GRY (okna)
public class Game{
    private MenuGUI menuWindow;
    private TestGUI testWindow;
    public void startGame() {
            this.menuWindow = new MenuGUI();
            this.menuWindow.startButton.addActionListener(e -> menuWindow.pressZagraj());
            this.menuWindow.testPlayButton.addActionListener(e -> testWindow = new TestGUI(menuWindow.getX(), menuWindow.getY()));

    }

}