public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if(size > 60) {
            System.out.println("гав");
        } else if(size > 30) {
            System.out.println("вуф");
        } else {
            System.out.println("тяф");
        }
    }

}

class GoodDogTestDrive{
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(5);

        System.out.println("Первая собака " + one.getSize());
        System.out.println("Вторая собака " + two.getSize());

        one.bark();
        two.bark();
    }
}
