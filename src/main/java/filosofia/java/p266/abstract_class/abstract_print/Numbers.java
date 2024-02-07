package filosofia.java.p266.abstract_class.abstract_print;

public class Numbers extends AbstractNumbers{
    int i=9;

    public  Numbers() {
        System.out.println("Я производный конструктор - " + print ());
    }

    @Override
    int print() {
        return i;
    }
}
