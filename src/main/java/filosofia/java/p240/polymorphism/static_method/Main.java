package filosofia.java.p240.polymorphism.static_method;

import static filosofia.java.p240.polymorphism.static_method.Latte.buyCoffee;

public class Main {
    public static void main(String[] args) {
      //  Coffee coffee = new Latte();
        Latte latte = new Latte();

        //  buyCoffee(coffee);
        Latte.buyCoffee(latte);

    }
}
