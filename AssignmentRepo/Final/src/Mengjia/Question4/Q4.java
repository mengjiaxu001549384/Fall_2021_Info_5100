package Mengjia.Question4;

import Mengjia.Question4.Genre;
import Mengjia.Question4.Movie;
import Mengjia.Question4.Netflix;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Q4 {

    Netflix netflix;

    public Q4(){
        netflix = createNetflix();
    }

    //1. add "Classic", and then print out
    public void addClassic(){
        netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .forEach(movie -> {
                    Date date = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
                    if (movie.getReleaseDate().before(date)) {
                        System.out.println(movie.getTitle() + "(Classic)");
                    }
                });
    }

    //2. get Latest 3 movies
    public void getLatestThreeMovies(){

        List<Movie> latestThreeMovies = netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .sorted((movie1, movie2) -> movie2.getReleaseDate().compareTo(movie1.getReleaseDate()))
                .limit(3)
                .collect(Collectors.toList());

        for(Movie movie: latestThreeMovies){
            Date date = movie.getReleaseDate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println(movie.getTitle() + ": " + calendar.get(Calendar.YEAR));
        }

    }

    //3. predicate
    public void setPredicate(){


        Date twoThousand = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date ninteenNinty = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Predicate<Movie> befor2000 = movie -> movie.getReleaseDate().before(twoThousand);
        Predicate<Movie> after1990 = movie -> movie.getReleaseDate().after(ninteenNinty);

        netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .forEach(movie -> {
                    if(befor2000.and(after1990).test(movie)){
                        System.out.println(movie.getTitle() + ": "
                                + movie.getReleaseDate().toGMTString()
                        );
                    }
                });
    }

    //4. add release year to title
    public void addReleaseYearToTitle(){

        List<Genre> list= netflix.genreList.stream()
                .map(genre -> {
                    genre.addReleaseYearToTitle();
                    return genre;
                })
                .collect(Collectors.toList());

        netflix.setGenreList(list);

        for(Genre genre: netflix.getGenreList()){
            for(Movie movie: genre.getMovieList()){
                System.out.println(movie.getTitle());
            }
        }
    }

    //5. sort use comparator
    public void sortUseComparator(){
        Comparator<Movie> movieTitleComparator = new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };


        List<Movie> list = netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .sorted(movieTitleComparator)
                .collect(Collectors.toList());

        for(Movie movie: list){
            System.out.println(movie.getTitle());
        }
    }

    public Netflix createNetflix(){
        Netflix netflix = new Netflix();
        netflix.setGenreList(generateGenres());
        generateMoviesForFiction(netflix.getGenreList().get(0));
        generateMoviesForNonFiction(netflix.getGenreList().get(1));

        return netflix;
    }

    public ArrayList<Genre> generateGenres(){
        Genre fiction = new Genre();
        Genre nonFiction = new Genre();

        ArrayList<Genre> list = new ArrayList<>();
        list.add(fiction);
        list.add(nonFiction);

        return list;
    }

    public void generateMoviesForFiction(Genre fiction){

        Date date1 = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        Movie harryPotter = new Movie("Harry Potter", date1);
        Date date2 = new GregorianCalendar(1989, Calendar.JUNE, 4).getTime();
        Movie red = new Movie("Red", date2);
        Date date3 = new GregorianCalendar(1994, Calendar.JULY, 9).getTime();
        Movie green = new Movie("Green", date3);
        Date date4 = new GregorianCalendar(2003, Calendar.DECEMBER, 1).getTime();
        Movie yellow = new Movie("Yellow", date4);
        Date date5 = new GregorianCalendar(2014, Calendar.NOVEMBER, 21).getTime();
        Movie blue = new Movie("Blue", date5);

        ArrayList<Movie> list = new ArrayList<>();
        list.add(harryPotter);
        list.add(red);
        list.add(green);
        list.add(yellow);
        list.add(blue);

        fiction.setMovieList(list);
    }

    public void generateMoviesForNonFiction(Genre nonFiction){

        Date date1 = new GregorianCalendar(2006, Calendar.FEBRUARY, 11).getTime();
        Movie mercury = new Movie("Mercury", date1);
        Date date2 = new GregorianCalendar(1991, Calendar.JANUARY, 3).getTime();
        Movie venus = new Movie("Venus", date2);
        Date date3 = new GregorianCalendar(1962, Calendar.APRIL, 9).getTime();
        Movie earth = new Movie("Earth", date3);
        Date date4 = new GregorianCalendar(1963, Calendar.JUNE, 3).getTime();
        Movie mars = new Movie("Mars", date4);
        Date date5 = new GregorianCalendar(2021, Calendar.NOVEMBER, 21).getTime();
        Movie jupiter = new Movie("Jupiter", date5);

        ArrayList<Movie> list = new ArrayList<>();
        list.add(mercury);
        list.add(venus);
        list.add(earth);
        list.add(mars);
        list.add(jupiter);

        nonFiction.setMovieList(list);
    }

}
