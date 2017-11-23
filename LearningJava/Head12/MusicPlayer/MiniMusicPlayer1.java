package LearningJava.Head12.MusicPlayer;

import javax.sound.midi.*;

/**
 * Created by user on 07.04.2017.
 */
public class MiniMusicPlayer1 {
    public static void main(String[] args) {
        try{
            //создаем и открываем синтезатор
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            //создаем последовательность и дорожку
            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();
            //создаем группу событий, чтоб ноты продолжали подниматься
            for (int i = 5; i<61; i+=4){
                //вызываем метод makeEvent, чтоб создать сообщение и событие,
                //а затем добавляем результат в дорожку
                track.add(makeEvent(144,1,i,100,i));
                track.add(makeEvent(128,1,i,100,i+2));
            }
            //запускаем событие
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception ex){ex.printStackTrace();}
    }
    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
        MidiEvent event = null;
        try{
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan,one,two);
            event = new MidiEvent(a,tick);
        } catch (Exception ex){}
        return event;
    }
}
