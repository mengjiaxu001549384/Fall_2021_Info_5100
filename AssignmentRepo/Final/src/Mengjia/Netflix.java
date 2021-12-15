package Mengjia;

import java.util.*;

public class Netflix {
    List<Genre> genreList;

    public Netflix() {
        genreList = new ArrayList<>();
    }

    public void setGenreList(List<Genre> genreList) {
        this.genreList = genreList;
    }

    public List<Genre> getGenreList() {
        return genreList;
    }
}
