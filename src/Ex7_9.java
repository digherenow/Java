abstract class Player {
    abstract void play(int pos);
    abstract void stop();

}

class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos+"위치부터 play합니다.");
    }
    void stop() {
        System.out.println("stop합니다.");
    }
}

public class Ex7_9 {
    public static void main(String[] args) {
        Player ap = new AudioPlayer();
        ap.play(100);
        ap.stop();
    }
}
