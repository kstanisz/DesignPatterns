package singleton;

public class Main {
    public static void main(String[] args) {
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

        if(game == anotherGameReference) {
            System.out.println("Singleton OK");
            if(score == anotherGameReference.getScore()) {
                System.out.println("Score OK");
            }
        }
    }

    private static void guessGameWithSerializationRunReadResolveImplemented() {
        GuessGameSerializationSafe game = GuessGameSerializationSafe.getInstance();

        game.play();
        int score = game.getScore();
        // TODO: implement
    }

    private static void guessGameWithSerializationRunReadResolveNotImplemented() {
        GuessGameSerializationUnsafe game = GuessGameSerializationUnsafe.getInstance();

        game.play();
        int score = game.getScore();
        // TODO: implement
    }

}
