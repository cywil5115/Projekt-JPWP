import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyStriker extends KeyMaker implements KeyListener {

        private boolean shouldPlay;
        public void shouldPlaySet(boolean shouldPlay){
            this.shouldPlay=shouldPlay;
        }

        @Override
        public void keyTyped (KeyEvent e){ // klawisz powoduje odtworzenie dźwięku
            if (shouldPlay==true) {
                switch (e.getKeyChar()) {
                    case '1' -> key[0].pressKey(key[0].getIdKey());
                    case '2' -> key[1].pressKey(key[1].getIdKey());
                    case '3' -> key[2].pressKey(key[2].getIdKey());
                    case '4' -> key[3].pressKey(key[3].getIdKey());
                    case '5' -> key[4].pressKey(key[4].getIdKey());
                    case '6' -> key[5].pressKey(key[5].getIdKey());
                    case '7' -> key[6].pressKey(key[6].getIdKey());
                    case '8' -> key[7].pressKey(key[7].getIdKey());
                    case '9' -> key[8].pressKey(key[8].getIdKey());
                    case '0' -> key[9].pressKey(key[9].getIdKey());
                    case '-' -> key[10].pressKey(key[10].getIdKey());
                    case '=' -> key[11].pressKey(key[11].getIdKey());
                    case ']' -> key[12].pressKey(key[12].getIdKey());
                }
            }
        }

        @Override
        public void keyPressed (KeyEvent e){

        }

        @Override
        public void keyReleased (KeyEvent e){

        }

    public int getKeyIdMethod(int idKey) {
            int tabPosition = idKey-1;
            return key[tabPosition].getIdKey();
    }
    public char getKeyNameMethod(int idKey) {
        int tabPosition = idKey-1;
        return key[tabPosition].getNameKey();
    }

}
