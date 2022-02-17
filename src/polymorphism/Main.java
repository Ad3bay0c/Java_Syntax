package src.polymorphism;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.printf("Movie #%d : %s\n Plot: %s \n", i, movie.getName(), movie.plot());
        }
    }

    public static Movie randomMovie() {
        int randNo = (int) ((Math.random()) * 5) + 1;
        System.out.println("Random No generated was " + randNo);
        return switch (randNo) {
            case 1 -> new Jaws();
            case 2 -> new IndependenceDay();
            case 3 -> new MazeRunner();
            case 4 -> new StarWars();
            case 5 -> new ForgettableMovie();
            default -> null;
        };
    }
}
