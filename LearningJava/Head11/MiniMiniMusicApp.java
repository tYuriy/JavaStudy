package LearningJava.Head11;

/**
 * Created by user on 06.04.2017.
 */
import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();

    }
    public void play(){
        try{
            //получаем синтезатор
            Sequencer player = MidiSystem.getSequencer();
            //открываем для использования
            player.open();

            //ввод аргументов для конструктора синтерзатора
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            //запрос трека у последовательности. Трек содержится в последовательности
            //а миди данные в треке
            Track track = seq.createTrack();

            //помещаем в трек миди события.
            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,44,100);//начать играть ноту 44
            MidiEvent noteOn = new MidiEvent(a,1);//сообщение "а" сработает на 1-м такте
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,44,100);
            MidiEvent noteOff = new MidiEvent(b,16);
            track.add(noteOff);

            //передаем последовательность синтезатору
            player.setSequence(seq);

            //запускаем синтезатор
            player.start();


        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
