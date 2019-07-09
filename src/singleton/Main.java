package singleton;

import util.SerializationUtils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("--- Simple run ---");
        guessGameSimpleRun();
        System.out.println("--- Read resolve serialization implemented run ---");
        guessGameWithSerializationRunReadResolveImplemented();
        System.out.println("--- Read resolve serialization not implemented run ---");
        guessGameWithSerializationRunReadResolveNotImplemented();
    }

    private static void guessGameSimpleRun() {
        GuessGameSerializationSafe game = GuessGameSerializationSafe.getInstance();

        game.play();
        int score = game.getScore();

        GuessGameSerializationSafe anotherGameReference = GuessGameSerializationSafe.getInstance();

        if (game == anotherGameReference) {
            System.out.println("Singleton OK");
            if (score == anotherGameReference.getScore()) {
                System.out.println("Score OK");
            }
        }
    }

    private static void guessGameWithSerializationRunReadResolveImplemented() throws IOException, ClassNotFoundException {
        GuessGameSerializationSafe game = GuessGameSerializationSafe.getInstance();

        game.play();

        byte[] gameByteArray = SerializationUtils.serialize(game);
        GuessGameSerializationSafe gameAfterSerialization = (GuessGameSerializationSafe) SerializationUtils.deserialize(gameByteArray);

        if (game == gameAfterSerialization) {
            System.out.println("Same reference");
        }

        gameAfterSerialization.play();

        if (game.getScore() == gameAfterSerialization.getScore()) {
            System.out.println("Same score");
        }
    }

    private static void guessGameWithSerializationRunReadResolveNotImplemented() throws IOException, ClassNotFoundException {
        GuessGameSerializationUnsafe game = GuessGameSerializationUnsafe.getInstance();

        game.play();

        byte[] gameByteArray = SerializationUtils.serialize(game);
        GuessGameSerializationUnsafe gameAfterSerialization = (GuessGameSerializationUnsafe) SerializationUtils.deserialize(gameByteArray);

        if (game == gameAfterSerialization) {
            System.out.println("Same reference");
        }

        gameAfterSerialization.play();

        if (game.getScore() == gameAfterSerialization.getScore()) {
            System.out.println("Same score");
        }
    }
}
