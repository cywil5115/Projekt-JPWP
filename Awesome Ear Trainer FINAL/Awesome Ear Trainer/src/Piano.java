//PRZYPISANIE TABLICY DŹWIEKÓW
public class Piano
{
    private final Sound[] sounds = new Sound[13];

    public Piano() {
        this.sounds[0] = new Sound(1, "play/1C.wav");
        this.sounds[1] = new Sound(2, "play/2CIS.wav");
        this.sounds[2] = new Sound(3, "play/3D.wav");
        this.sounds[3] = new Sound(4, "play/4DIS.wav");
        this.sounds[4] = new Sound(5, "play/5E.wav");
        this.sounds[5] = new Sound(6, "play/6F.wav");
        this.sounds[6] = new Sound(7, "play/7FIS.wav");
        this.sounds[7] = new Sound(8, "play/8G.wav");
        this.sounds[8] = new Sound(9, "play/9GIS.wav");
        this.sounds[9] = new Sound(10, "play/10A.wav");
        this.sounds[10] = new Sound(11, "play/11AIS.wav");
        this.sounds[11] = new Sound(12, "play/12H.wav");
        this.sounds[12] = new Sound(13, "play/13C.wav");
    }
    protected void playSound(int soundNumber) {
        String name;
        name=this.sounds[soundNumber-1].getName();
        this.sounds[soundNumber-1].playNote(name); //podawana liczba musi być id dźwięku
    }

}


