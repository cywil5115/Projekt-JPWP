import java.util.ArrayList;

//PRZYPISANIE TABLICY DŹWIEKÓW
public class Piano
{
    private Sound[] sounds = new Sound[13];

    public Piano() {
        this.sounds[0] = new Sound(1, "1C.wav");
        this.sounds[1] = new Sound(2, "2CIS.wav");
        this.sounds[2] = new Sound(3, "3D.wav");
        this.sounds[3] = new Sound(4, "4DIS.wav");
        this.sounds[4] = new Sound(5, "5E.wav");
        this.sounds[5] = new Sound(6, "6F.wav");
        this.sounds[6] = new Sound(7, "7FIS.wav");
        this.sounds[7] = new Sound(8, "8G.wav");
        this.sounds[8] = new Sound(9, "9GIS.wav");
        this.sounds[9] = new Sound(10, "10A.wav");
        this.sounds[10] = new Sound(11, "11AIS.wav");
        this.sounds[11] = new Sound(12, "12H.wav");
        this.sounds[12] = new Sound(13, "13C.wav");
    }
    public void playSound(int soundNumber) {
        String name;
        name=this.sounds[soundNumber-1].getName();
        this.sounds[soundNumber-1].playNote(name); //podawana liczba musi być id dźwięku
    }



}


