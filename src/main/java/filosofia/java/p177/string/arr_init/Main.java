package filosofia.java.p177.string.arr_init;

/*Создайте массив объектов String.
 * Присвойте значение каждому элементу,
 * выведите значение на экран в цикле for.
 */
/* Создайте класс с конструктором, получающим аргумент String.
 * Выведите значение аргумента во время конструирования.
 * Создайте массив ссылок на этот класс,
 * но не создавайте объекты, которыми заполняется этот массив.
 * Запустите программу и посмотрите,
 * будут ли выводится сообщения при вызове конструкторов.
 */
/* Завершите предыдущее упражнение,
 * создайте объекты, которыми заполняется массив ссылок.
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Андрей");
        Person p2 = new Person("Жанна");
        Person p3 = new Person("Игорь");
        String[] arr = {"Один", "Два", "Три", "Четыре", "Пять",};

        for (String s : arr) {
            System.out.println(s);
        }
        Person[] person1 = new Person[3];
        Person[] person2 = {p1, p2, p3};
        Person[] person3 = {null, null, null};
        Person[] person4 = {new Person("Ольга"), new Person("Юлия"), new Person("Валентин")};
    }

}
