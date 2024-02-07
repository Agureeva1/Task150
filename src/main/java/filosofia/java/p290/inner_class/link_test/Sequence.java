package filosofia.java.p290.inner_class.link_test;

import java.util.Arrays;

class Sequence {
    private Object [] items;
    private int next = 0;
    NewString str1;
    NewString str2;
    Sequence (int size,NewString str1,NewString str2) {
        this.str1= str1;
        this.str2= str2;
        this.items = new Object[size];
    }
    public void add (Object x) {
        if (next< items.length) items[next++] = x;
    }

    @Override
    public String toString() {
        return "Sequence{" +
                "items=" + Arrays.toString(items) +
                ", free cell=" + next +
                ", str1=" + str1 +
                ", str2=" + str2 +
                '}';
    }
}
