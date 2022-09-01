public class Dog {
    int size;
    String name;
    void bark() {
        if(size > 60) {
            System.out.println("Гав");
        } else if(size > 14) {
            System.out.println("Вуф");
        } else {
            System.out.println("Тяф");
        }
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 40;
        Dog three = new Dog();

        one.bark();
        two.bark();
        three.bark();
    }
}
