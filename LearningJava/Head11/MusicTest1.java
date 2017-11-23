package LearningJava.Head11;

/**
 * Created by user on 06.04.2017.
 */
import javax.sound.midi.*;

public class MusicTest1 {
    public void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We've got sintesator");
        } catch (MidiUnavailableException ex){
            System.out.println("fail");
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
