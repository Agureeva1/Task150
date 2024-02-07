package filosofia.java.p290.inner_class.link_test;

import filosofia.java.p177.string.arr_init.Person;

import java.time.LocalDate;

/* Напишите класс с именем Outer,
 * содержащий внутренний класс с именем Inner.
 * Добавьте в Outer метод, возвращаемый объект типа Inner.
 * В main создайте и инициализируйте ссылку на Inner.
 *
 * Создайте класс, который содержит String и метод toString
 * для вывода хранимой строки. Добавьте несколько экземпляров нового класса
 * в объект Sequence и выведите их.
 *
 *Измените упражнение 1 так, чтобы класс Outer содержал private String поле,
 * а в классе Inner переопределите метод toString так, чтобы он выводил
 * private String поле класса Outer.
 */
public class Main {
    public static void main(String[] args) {
        Outer outer = Outer.getOuter();
        var inner = outer.getInner();
        Sequence s = new Sequence(5,
                new NewString("яблоко", "груша", "банан"),
                new NewString("стул", "стол", "диван"));
        s.add(new NewString("зебра", "лев", "жираф"));
        s.add(new Person("Кристина"));
        s.add(new filosofia.java.p269.my_interface.interface_realize.Person("Irma", LocalDate.of(1983,9,12),40));
        System.out.println(s);
        Outer outerStr = new Outer("Я поле str в классе Outer");
        var innerStr = outerStr.getInner();
        System.out.println(innerStr);
    }
}
