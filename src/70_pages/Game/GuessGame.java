class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guesp1 = 0;
        int guesp2 = 0;
        int guesp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int)(Math.random() * 10);
        System.out.println("Загадываю число от 0 до 9...");

        while (true) {
            System.out.println("Число, которое нужно угадать " +  targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guesp1 = p1.number;
            System.out.println("Число первого игрока " + guesp1);
            guesp2 = p2.number;
            System.out.println("Число второго игрока " + guesp2);
            guesp3 = p3.number;
            System.out.println("Число третьего игрока " + guesp3);

            if(guesp1 == targetNumber) {
                p1isRight = true;
            }
            if(guesp2 == targetNumber) {
                p2isRight = true;
            }
            if(guesp3 == targetNumber) {
                p3isRight = true;
            }

            if(p1isRight || p2isRight || p3isRight) {
                System.out.println("Первый игрок - " + guesp1);
                System.out.println("Второй игрок - " + guesp2);
                System.out.println("Третий игрок - " + guesp3);
            } else {
                System.out.println("Никто не угадал");
            }
        }

    }
}

class Player {
    int number = 0;
    public void guess() {
        number = (int)(Math.random() * 10);
        System.out.println("Это число " + number);
    }
}

class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}