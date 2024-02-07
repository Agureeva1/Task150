package filosofia.java.p212.inheritance.arguments;

/* Создайте два класса Animal и Plant,
 * имеющие конструкторы с аргументами и выводящие сообщения о вызове.
 * Создайте класс Cat, произвольный от класса Animal,
 * создайте в классе Cat поле типа Plant.
 * Создавайте конструктор Cat и проведите всю необходимую инициализацию внутри него.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog d = new Dog();
        Dog q = new Dog(12);
    }
}
