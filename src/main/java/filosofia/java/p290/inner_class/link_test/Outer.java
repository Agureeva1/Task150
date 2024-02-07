package filosofia.java.p290.inner_class.link_test;

public class Outer {
    private String str;

    public Outer() {}
    public Outer(String str) {
        this.str=str;
        System.out.println("Получили объект Outer из конструктора");
    }

    public static Outer getOuter() {
        System.out.println("Получили объект Outer из метода");
        return new Outer();
    }

    public Inner getInner() {
        return new Inner();
    }

    private class Inner{
       private Inner(){  System.out.println("Получили объект Inner");}

        @Override
        public String toString() {
            return "Outer.str: " + str;
        }
    }
}
