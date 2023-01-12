import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyStriker extends KeyMaker implements KeyListener {
        BazaDanych baza;
        public  KeyStriker(BazaDanych baza){
            this.baza = baza;
        }
        private boolean shouldPlay;
        public void shouldPlaySet(boolean shouldPlay){
            this.shouldPlay=shouldPlay;
        }

        @Override
        public void keyTyped (KeyEvent e){ // klawisz powoduje odtworzenie dźwięku
        if (shouldPlay) {
            switch (e.getKeyChar()) {
                case '1' -> key[0].pressKey(key[0].getIdKey(), this.baza);
                case '2' -> key[1].pressKey(key[1].getIdKey(), this.baza);
                case '3' -> key[2].pressKey(key[2].getIdKey(), this.baza);
                case '4' -> key[3].pressKey(key[3].getIdKey(), this.baza);
                case '5' -> key[4].pressKey(key[4].getIdKey(), this.baza);
                case '6' -> key[5].pressKey(key[5].getIdKey(), this.baza);
                case '7' -> key[6].pressKey(key[6].getIdKey(), this.baza);
                case '8' -> key[7].pressKey(key[7].getIdKey(), this.baza);
                case '9' -> key[8].pressKey(key[8].getIdKey(), this.baza);
                case '0' -> key[9].pressKey(key[9].getIdKey(), this.baza);
                case '-' -> key[10].pressKey(key[10].getIdKey(), this.baza);
                case '=' -> key[11].pressKey(key[11].getIdKey(), this.baza);
                case ']' -> key[12].pressKey(key[12].getIdKey(), this.baza);
                //default ->
            }
        }
    }
        @Override
        public void keyPressed (KeyEvent e){

        }

        @Override
        public void keyReleased (KeyEvent e){

        }


       /* public int getKeyIdMethod(int idKey) {
                int tabPosition = idKey-1;
                return key[tabPosition].getIdKey();
        }
        public char getKeyNameMethod(int idKey) {
            int tabPosition = idKey-1;
            return key[tabPosition].getNameKey();
        }*/

}
