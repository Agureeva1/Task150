package filosofia.java.p290.inner_class.p295.general_class;

import filosofia.java.p290.inner_class.p295.interface_in_inner.MyInterfaceInner;

public class GeneralClass {

    protected class ProtectedClass implements MyInterfaceInner {
    public ProtectedClass(){}

        @Override
        public void print() {
            System.out.println("Как здорово, что все мы здесь сегодня собрались");
        }
    }
}
