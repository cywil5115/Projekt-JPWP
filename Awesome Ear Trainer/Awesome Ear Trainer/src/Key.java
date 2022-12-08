
public class Key  {

    private int idKey; // to nie klucz tylko klawisz
    private char nameKey;
    private Piano piano = new Piano();

    public Key(int idKey, char nameKey) {
        this.idKey = idKey;
        this.nameKey = nameKey;
    }

    public int getIdKey() {
        return idKey;
    }
    public char getNameKey() {
        return nameKey;
    }


    protected void pressKey(int idKey){
        piano.playSound(this.idKey);
    }
}
