public class Artist extends MusicPlayer{
    private int popularity;
    public Artist(String name, int popularity) {
        super(name);
        this.popularity = popularity;
    }

    @Override
    public void print() {
        System.out.println("Artist: " + getName() + " | TopChart: " + popularity);

    }
}
