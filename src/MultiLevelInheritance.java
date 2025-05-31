public class MultiLevelInheritance {
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    class Puppy extends Dog {
        @Override
        void sound() {
            System.out.println("Puppy whines");
        }
    }

    public static void main(String[] args) {
        MultiLevelInheritance mli = new MultiLevelInheritance();

        Animal animal = mli.new Animal();
        animal.sound(); // Calls the base class method

        Dog dog = mli.new Dog();
        dog.sound(); // Calls the derived class method

        Puppy puppy = mli.new Puppy();
        puppy.sound(); // Calls the most derived class method
    }
}
