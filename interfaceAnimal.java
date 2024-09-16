interface Animal {
    void sound();
    void sleep();
}


class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.sleep();
    }
}
