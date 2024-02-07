package filosofia.java.p290.inner_class.p295.derivative_class;
import filosofia.java.p290.inner_class.p295.general_class.GeneralClass;

public class DerivativeClass extends GeneralClass {

    public ProtectedClass getProtectedClass() {
        GeneralClass g = new GeneralClass();
        // в этой строке код не компилируется
        GeneralClass.ProtectedClass p = g.new ProtectedClass();
        return p;
    }
}
