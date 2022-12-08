//MECHANIKA GRY
public class Game extends KeyStriker  {
    private KeyStriker striker;

    public Game() {
        this.striker = new KeyStriker();
    }

    void startGame() {
        this.striker.shouldPlaySet(true); //na ten moment true
        int keyId = striker.getKeyIdMethod(1);// roboczo
    }

}
