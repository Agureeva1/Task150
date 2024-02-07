package filosofia.java.p290.inner_class.new_this;
/* Добавьте в класс Sequence.SequenceSelector метод для получения
* ссылки на внешний класс Sequence.
 */
interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) {
        System.out.println("Sequence объект");
        items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Sequence getSequenceThis(int i) {
            System.out.println("Sequence объект в классе SequenceSelector");
            return new Sequence(i);}
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
        System.out.println("SequenceSelector объект в методе selector");
        return new SequenceSelector();
    }
    public static void main(String[] args) {
//        Sequence sequence = new Sequence(10);
//        for(int i = 0; i < 10; i++)
//            sequence.add(Integer.toString(i));
//        Selector selector = sequence.selector();
//        while(!selector.end()) {
//            System.out.print(selector.current() + " ");
//            selector.next();
        Sequence sequence =  new Sequence(10);
        SequenceSelector sequenceSelector = (SequenceSelector) sequence.selector();
        Sequence s = sequenceSelector.getSequenceThis(4);
        }
    }
 /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~