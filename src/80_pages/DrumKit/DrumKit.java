public class DrumKit {

    boolean topHat = false;
    boolean snare = false;

    void playSnare() {
        System.out.println("что-то вывести");
    }

    void playTopHat() {
        System.out.println("что-то вывести 2");
    }

}

class DrumKitTestDrive{
    public static void main(String[] args) {
        DrumKit a = new DrumKit();
        a.topHat = true;
        a.snare = true;
        if(a.topHat == true && a.snare == true) {
            a.playSnare();
            a.playTopHat();
        }
    }
}