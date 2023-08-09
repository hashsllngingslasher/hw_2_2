public class Main {
    public static void main(String[] args) {
        Printable[] elements = {createObject("Artist"), createObject("Song"), createObject("Genre")};
        System.out.println("------MY PLAYLIST------");
        for (Printable element : elements) {
            element.print();
        }
    }

    public static MusicPlayer createObject(String className) {
        return switch (className) {
            case "Artist" -> new Artist("Oasis", 23);
            case "Song" -> new Song("Wonderwall", 3.21);
            case "Genre" -> new Genre("Rock");
            default -> throw new IllegalArgumentException("Недопустимый класс: " + className);
        };
    }
}