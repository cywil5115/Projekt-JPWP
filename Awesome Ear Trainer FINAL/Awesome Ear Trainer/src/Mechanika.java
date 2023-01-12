public class Mechanika extends Thread {
    LevelGUI level;
    BazaDanych qPocket;
    public Mechanika(LevelGUI level){
        this.level=level;
        this.qPocket=this.level.baza;
    }

    @Override
    public void run(){
        int zdobytePunkty=0;
        for(int i=0 ;i<10; i++)
        {
            this.level.licznikPytan=Integer.toString(i+1);
            this.level.display.setText("Interwał: "+this.level.licznikPytan+"/10"+" Odtwarzanie...");
            try {
                Thread.sleep(2000);
                if(!this.level.play){
                    return;
                }
            }
            catch ( InterruptedException e) {
                System.out.println("Zostałem obudzony przedwcześnie");
            }
            int idIntervalQ = this.level.pytajnik.losowanieID();
            this.level.pytajnik.playSound(idIntervalQ);
            qPocket.saveIdOfAQuestion(idIntervalQ);
            try {
                Thread.sleep(12000);
                if(!this.level.play){
                    return;
                }
            }
            catch ( InterruptedException e) {
                System.out.println("Zostałem obudzony przedwcześnie");
            }
            if(qPocket.AnswerChecker()){
                zdobytePunkty++;
                this.level.licznikPunktow=Integer.toString(zdobytePunkty);
                this.level.display.setText(this.level.licznikPytan+"/10"+" Poprawne: "+this.level.licznikPunktow+"/10pkt");
                try {
                    Thread.sleep(3000);
                    if(!this.level.play){
                        return;
                    }
                }
                catch ( InterruptedException e) {
                    System.out.println("Zostałem obudzony przedwcześnie");
                }
            }
            else{
                this.level.licznikPunktow=Integer.toString(zdobytePunkty);
                this.level.display.setText(this.level.licznikPytan+"/10"+" Poprawne: "+this.level.licznikPunktow+"/10pkt");
                try {
                    Thread.sleep(3000);
                    if(!this.level.play){
                        return;
                    }
                }
                catch ( InterruptedException e) {
                    System.out.println("Zostałem obudzony przedwcześnie");
                }
            }
            qPocket.resetQuestion();
        }
        this.level.display.setText("Suma punktów: "+this.level.licznikPunktow+"/10pkt");
    }
}
