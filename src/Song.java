public class Song extends MusicPlayer {
    private double length;

    public Song(String name, double length) {
        super(name);
        this.length = length;
    }

    @Override
    public void print() {
        System.out.println("Song: " + getName() + " | Length: " + length);
    }
}
