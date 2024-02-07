package filosofia.java.p290.inner_class.inner_in_method;

public class MyClass {

    public MyInterface myInterface () {

        class MyInterfaceClass implements MyInterface{

            @Override
            public void start() throws InterruptedException {
                for (int j = 10; j >0 ; j--) {
                    System.out.println(j);
                    Thread.sleep(1000);
                }
                System.out.println("START");
            }
        } return new MyInterfaceClass();
    }
}
