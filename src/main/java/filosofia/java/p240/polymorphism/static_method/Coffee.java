package filosofia.java.p240.polymorphism.static_method;

public class Coffee {
    String name="Кофе";

    public static void buyCoffee(Coffee coffee) {
        System.out.println("Вы купили " + coffee.name);
    }
}

