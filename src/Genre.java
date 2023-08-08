public class Genre extends MusicPlayer {
    public Genre(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Genre: " + getName());

    }
}
