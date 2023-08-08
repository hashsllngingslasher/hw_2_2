public abstract class MusicPlayer implements Printable {
    private String name;

    public MusicPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
