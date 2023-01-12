//MECHANIKI ZWIĄZANE Z DŹWIĘKIEM
public class Sound extends MusicPlayer
{
    private int id;
    private String name;

    public Sound(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected String getName() {
        return name;
    }

}