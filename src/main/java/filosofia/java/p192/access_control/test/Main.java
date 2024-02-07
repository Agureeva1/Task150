package filosofia.java.p192.access_control.test;

/* Создайте класс с защищенными данными.
 * Создайте в том же файле второй класс с методом,
 * работающим с защищенными данными из первого класса.
 */
public class Main {
    public static void main(String[] args) {
        AccessTestProtect atp = new AccessTestProtect();
        protectObj(atp,"Hello", 12);
        System.out.println(atp.protectedString);
        System.out.println(atp.protectedInt);
    }

    public static void protectObj(AccessTestProtect a, String s, int i) {
        a.protectedString = s;
        a.protectedInt = i;
    }
}

class AccessTestProtect {
    protected String protectedString;
    protected int protectedInt;
}