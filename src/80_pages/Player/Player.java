public class Player {
    boolean canRecord = false;

    void record() {
        System.out.println("Проигрывание");
    }
}

class PlayerTestDrive {
    public static void main(String[] args) {
        Player p = new Player();
        p.canRecord = true;

        if (p.canRecord == true) {
            p.record();
        }
    }
}
