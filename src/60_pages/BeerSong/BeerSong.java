

public class BeerSong {
    public static void main(String[] args) {
        String word = "бутылок (бутылки)";
        int beerNum = 99;

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "бутылка";
            }
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            beerNum--;
            if (beerNum == 0) {
                System.out.println("нет бутылок пива на стене");
            }
        }
    }
}
