interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football: Kicking the ball!");
    }
}

class Cricket implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Cricket: Hitting the ball with a bat!");
    }
}

public class Main {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable cricket = new Cricket();
        
        football.play();
        cricket.play();
    }
}
