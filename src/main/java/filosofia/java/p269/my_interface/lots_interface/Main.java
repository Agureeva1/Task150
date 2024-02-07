package filosofia.java.p269.my_interface.lots_interface;
/* Создайте интерфейс и определите еще два новых интерфейса,
* производных от него. Выполните множественное наследование третьего интерфейса
* от первых двух.
* Создайте класс, который реализует третий интерфейс.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Теодор", 2,"Цветной бульвар, д.4, кв 34");
        System.out.println(cat);
    }
}
