class Dog {
    String name;
    public static void main(String[] args) {
        // Создаем объект Dog и получаем к нему доступ
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        // Создаем массив типа Dog

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Rex";
        myDogs[1].name = "Stiv";

        System.out.print("Name's last dog - ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while(x < myDogs.length) {
            myDogs[x].bark();
            x++;
        }
    }
    public void bark() {
        System.out.println(name + "Say bark");
    }
    public void eat() {}
}
