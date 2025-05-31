//create a class name Animal with subclasses dog and cat in herarical inheritance
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }
    class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Calls the base class method

        Dog dog = animal.new Dog();
        dog.sound(); // Calls the Dog class method

        Cat cat = animal.new Cat();
        cat.sound(); // Calls the Cat class method
    }


}