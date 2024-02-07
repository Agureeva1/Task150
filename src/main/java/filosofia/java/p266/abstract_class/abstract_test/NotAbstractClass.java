package filosofia.java.p266.abstract_class.abstract_test;

public class NotAbstractClass extends AbstractClass{

    public void print () {
        System.out.println("Я печатаю в NotAbstractClass");
    }

    public static void staticMethod(AbstractClass a) {
        System.out.println("Я получил ссылку на " + a.getClass() + " класс");
    }
}
