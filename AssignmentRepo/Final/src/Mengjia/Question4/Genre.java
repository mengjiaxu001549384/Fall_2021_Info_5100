package Mengjia.Question4;

import java.util.*;
import java.util.stream.Collectors;

public class Genre {
    List<Movie> movieList;

    public Genre() {
        movieList = new ArrayList<>();
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void addReleaseYearToTitle() {
        List<Movie> list= movieList.stream()
                .map(movie -> {
                    Date date = movie.getReleaseDate();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date);
                    movie.setTitle(movie.getTitle() + ": " + calendar.get(Calendar.YEAR));
                    return movie;
                })
                .collect(Collectors.toList());

        setMovieList(list);
    }
}
