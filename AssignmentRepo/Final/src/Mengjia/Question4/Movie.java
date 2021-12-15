package Mengjia.Question4;

import java.util.*;

public class Movie {
    String Title;
    Date releaseDate;
    List<String> actors;
    String director;

    public Movie(String title, Date releaseDate) {
        Title = title;
        this.releaseDate = releaseDate;
        actors = new ArrayList<>();
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
