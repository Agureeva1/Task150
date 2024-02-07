package filosofia.java.p266.abstract_class.abstract_print;

abstract class AbstractNumbers {

    AbstractNumbers() {
        System.out.println("Я абстрактный конструктор - " + print ());
    }

    abstract int print ();
}
