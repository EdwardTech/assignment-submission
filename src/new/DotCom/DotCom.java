import java.util.ArrayList;
import java.util.*;

public class DotCom {
    // Переменные экземпляра класса
    //ArrayList с ячейками описывающими местоположение
    private ArrayList<String> locationCells;
    // Имя сайта
    private String name;
    // Сеттер устанавливает местоположение сайта. Случайный адрес предоставляемый методом placeDotCom()
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
    public void setName(String n) {
        name = n;
    }
    public String checkYourself(String userInput) {
        String result = "Мимо";
        // Если ход совпал с одним из элементов то вернем его местоположение
        int index = locationCells.indexOf(userInput);

        if(index >= 0) {
            locationCells.remove(index);

            if(locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Потоплен " + name);
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}


