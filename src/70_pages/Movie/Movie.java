class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Проигрывание фильма");
    }
}

class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "film1";
        one.genre = "horror";
        one.rating = -2;
        one.playIt();

        Movie two = new Movie();
        two.title = "film2";
        two.genre = "action";
        two.rating = 4;

        Movie three = new Movie();
        three.title = "film3";
        three.genre = "comedy";
        three.rating = 6;
    }
}