package filosofia.java.p152.constructor_string;

public class Dog {

    public void bark(char x) {
        System.out.println("bark (char)" + x);
    }

    public void bark(byte x) {
        System.out.println("bark (byte)" + x);
    }

    public void bark(short x) {
        System.out.println("bark (short)" + x);
    }

    public void bark(int x) {
        System.out.println("bark (int)" + x);
    }

    public void bark(long x) {
        System.out.println("bark (long)" + x);
    }

    public void bark(float x) {
        System.out.println("bark (float)" + x);
    }

    public void barkAllStyle(double x) {
       bark((char) x);
        bark((byte) x);
        bark((short) x);
        bark((int) x);
        bark((long) x);
        bark((float) x);
    }
}
