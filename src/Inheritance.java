class Inheritance {
    void display() {
        System.out.println("This is the base class method.");
    }
    class Derived extends Inheritance {
        @Override
        void display() {
            System.out.println("This is the derived class method.");
        }
    }

    class Main {
        public static void main(String[] args) {
            Inheritance base = new Inheritance();
            base.display(); // Calls the base class method

            Derived derived = new Inheritance().new Derived();
            derived.display(); // Calls the derived class method
        }
    }

}
