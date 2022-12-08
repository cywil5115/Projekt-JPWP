public class KeyMaker {

    protected Key key[] = new Key[13];
    public KeyMaker() {
        this.key[0] = new Key(1, '1');
        this.key[1] = new Key(2, '2');
        this.key[2] = new Key(3, '3');
        this.key[3] = new Key(4, '4');
        this.key[4] = new Key(5, '5');
        this.key[5] = new Key(6, '6');
        this.key[6] = new Key(7, '7');
        this.key[7] = new Key(8, '8');
        this.key[8] = new Key(9, '9');
        this.key[9] = new Key(10, '0');
        this.key[10] = new Key(11, '-');
        this.key[11] = new Key(12, '=');
        this.key[12] = new Key(13, ']');
    }
}
