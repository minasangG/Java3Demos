package StreamsDemo;

public class Movie {
    //fields
    private String title;
    private int likes;

    //Constructors

    public Movie() {

    }
    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    //Getters and Setters
    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
