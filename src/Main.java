public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        MusicPlayer element1 = main.createObject("Artist");
        MusicPlayer element2 = main.createObject("Song");
        MusicPlayer element3 = main.createObject("Genre");

        Printable[] elements = {element1, element2, element3};
        System.out.println("------MY PLAYLIST------");
        for (Printable element : elements) {
            element.print();
        }
    }

    public MusicPlayer createObject(String className) {
        switch (className) {
            case "Artist":
                return new Artist("Oasis", 23);
            case "Song":
                return new Song("Wonderwall", 3.21);
            case "Genre":
                return new Genre("Rock");
            default:
                throw new IllegalArgumentException("Недопустимый класс: " + className);
        }
    }
}