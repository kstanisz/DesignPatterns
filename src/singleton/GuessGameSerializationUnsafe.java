package singleton;

import java.io.Serializable;
import java.util.Random;

/**
 * No readResolve method
 */
class GuessGameSerializationUnsafe implements Serializable {
    private static GuessGameSerializationUnsafe instance;
    private int score;

    private GuessGameSerializationUnsafe() {
    }

    void play() {
        Random random = new Random();
        this.score = random.nextInt();
    }

    int getScore() {
        return this.score;
    }

    static GuessGameSerializationUnsafe getInstance() {
        if (instance == null) {
            synchronized (GuessGameSerializationUnsafe.class) {
                if (instance == null) {
                    instance = new GuessGameSerializationUnsafe();
                }
            }
        }
        return instance;
    }

}
