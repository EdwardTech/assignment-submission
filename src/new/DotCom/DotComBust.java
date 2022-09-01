import java.util.ArrayList;
import java.util.*;

class DotComBust {
    // Объявляем и инициализируем переменные
    private GameHelper helper = new GameHelper();
    // ArrayList только для объектов DotCom
    ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        // Создаем три объекта DotCom, присваиваем имена и добавляем в массив dotComList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        // краткая инструкция для пользователя
        System.out.println("Ваша цель - потопить три сайта");
        System.out.println("Pets.com, eToys.com и Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for(DotCom dotComToSet : dotComList) {
            // Передаем местоположение. Адрес сайта
            ArrayList<String> newLocation = helper.placeDotCom(3);
            // Вызываем сеттер из объекта DotCom чтобы передать ему местоположение
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while(!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess) {
        // Количество попыток пользователя
        numOfGuesses++;
        String result = "Мимо";
        // Повторяем для всех объектов DotCom
        for(DotCom dotComToTest : dotComList) {
            // Ищем попадание или потопление
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("Попал")) {
                break;
            }
            if(result.equals("Потопил")) {
                //
                dotComList.remove(dotComToTest);
                break;
            }
        }
        // Результаты пользователя
        System.out.println(result);
    }
    private void finishGame() {
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят.");
        if(numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего" + numOfGuesses + "попыток");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули");
        } else {
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + " попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений");
        }
    }

    public static void main(String[] args) {
        //Создаем игровой объект
        DotComBust game = new DotComBust();
        //Подготовить игру
        game.setUpGame();
        //Главный игровой цикл
        game.setUpGame();
    }
}