import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
public abstract class MusicPlayer {
    protected void playNote(String name)
    {
        // Path to the audio file
        String filePath = name;

        try {
            // Create a new File object using the file path
            File audioFile = new File(filePath);

            // Create an AudioInputStream object from the file
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            // Get a Clip object from the AudioSystem
            Clip clip = AudioSystem.getClip();

            // Open the clip and load the audio from the audio stream
            clip.open(audioStream);

            // Start playing the audio
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    protected void playInterval(String name)
    {
        // Path to the audio file
        String filePath = name;

        try {
            // Create a new File object using the file path
            File audioFile2 = new File(filePath);

            // Create an AudioInputStream object from the file
            AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(audioFile2);

            // Get a Clip object from the AudioSystem
            Clip clip = AudioSystem.getClip();

            // Open the clip and load the audio from the audio stream
            clip.open(audioStream2);

            // Start playing the audio
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

}