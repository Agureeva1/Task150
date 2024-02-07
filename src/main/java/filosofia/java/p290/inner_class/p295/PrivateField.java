package filosofia.java.p290.inner_class.p295;

public class PrivateField {
    private int number = 1;

    private void getNumber(){
        System.out.println("number = " + this.number);}

    public void workingInnerClass() {
        InnerPrivateClass inner = new InnerPrivateClass();
        inner.increaseNumber();
    }

    public void changeInnerPrivateField(String s) {
        InnerPrivateClass inner = new InnerPrivateClass();
        inner.str.append(s);
        System.out.println(inner.str);
    }
    public class InnerPrivateClass {
        private StringBuilder str = new StringBuilder("Я закрытое поле inner класса");
        public void increaseNumber(){
            ++number;
            getNumber();}
    }
}
