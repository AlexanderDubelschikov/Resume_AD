package Lesson;

public class Lesson_2_part_2 {

    public static void main(String[] args) throws Exception {
        Instrument[] instruments = {
                new Guitar(),
                new Piano(),
                new Flute(),
                new Guitar()
        };

        boolean[][] shouldPlay = {
                {false, true, true, true, false},
                {true, true, true, true, false},
                {false, true, false, true, false},
                {false, false, false, false, true}
        };

        Song song = new Song(instruments,shouldPlay);
        song.play();
    }
}
