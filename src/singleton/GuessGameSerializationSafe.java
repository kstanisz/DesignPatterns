package singleton;

import java.io.Serializable;
import java.util.Random;

class GuessGameSerializationSafe implements Serializable {
    private static GuessGameSerializationSafe instance;
    private int score;

    private GuessGameSerializationSafe() {
    }

    void play() {
        Random random = new Random();
        this.score = random.nextInt();
    }

    int getScore() {
        return this.score;
    }

    public static GuessGameSerializationSafe getInstance() {
        if (instance == null) {
            synchronized (GuessGameSerializationSafe.class) {
                if (instance == null) {
                    instance = new GuessGameSerializationSafe();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

}
