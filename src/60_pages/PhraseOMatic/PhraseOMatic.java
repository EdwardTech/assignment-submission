

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "взаимный", "динамичный", "фронтэнд", "метод критического пути", "шесть сигм", "умный"};
        String[] wordListTwo = {"уполномоченный", "чистый продукт", "ориентированный", "трудный", "центральный", "кластеризированный", "фирменный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход"};

        int oneLenght = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLenght = wordListThree.length;

        int random1 = (int) (Math.random() * oneLenght);
        int random2 = (int) (Math.random() * twoLength);
        int random3 = (int) (Math.random() * threeLenght);

        String phrase = wordListOne[random1] + " " + wordListTwo[random2] + " " + wordListThree[random3];

        System.out.println("Все, что нам нужно, - это " + phrase);

    }
}
