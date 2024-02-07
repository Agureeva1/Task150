package filosofia.java.p240.polymorphism.static_method;

public class Latte extends Coffee{

    String name = "Латте";

    public static void buyCoffee(Coffee coffee) {
        System.out.println("Вы купили вкусный " + coffee.name);
    }

//   public static void buyCoffee(Latte latte) {
//        System.out.println("Вы купили " + latte.name);
//    }
}
