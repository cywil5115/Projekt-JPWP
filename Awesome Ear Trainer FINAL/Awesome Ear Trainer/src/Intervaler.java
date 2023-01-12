import java.util.Random;

public class Intervaler {

    private final Interval[] intervals = new Interval[13];

     public Intervaler() {
         this.intervals[0] = new Interval(1,"intervals/pryma.wav");
         this.intervals[1] = new Interval(2,"intervals/sekundamala.wav");
         this.intervals[2] = new Interval(3,"intervals/sekundawielka.wav");
         this.intervals[3] = new Interval(4,"intervals/tercjamala.wav");
         this.intervals[4] = new Interval(5,"intervals/tercjawielka.wav");
         this.intervals[5] = new Interval(6,"intervals/kwartaczysta.wav");
         this.intervals[6] = new Interval(7,"intervals/tryton.wav");
         this.intervals[7] = new Interval(8,"intervals/kwintaczysta.wav");
         this.intervals[8] = new Interval(9,"intervals/sekstamala.wav");
         this.intervals[9] = new Interval(10,"intervals/sekstawielka.wav");
         this.intervals[10] = new Interval(11,"intervals/septymamala.wav");
         this.intervals[11] = new Interval(12,"intervals/septymawielka.wav");
         this.intervals[12] = new Interval(13,"intervals/oktawa.wav");
     }
     protected void playSound(int soundNumber) {
         String name;
         name = this.intervals[soundNumber - 1].getName();
         this.intervals[soundNumber - 1].playInterval(name); //podawana liczba musi być id intervału
     }
     Random random = new Random();
     protected int losowanieID(){
         int ans = random.nextInt(13) + 1;
         return ans;
     }
}
