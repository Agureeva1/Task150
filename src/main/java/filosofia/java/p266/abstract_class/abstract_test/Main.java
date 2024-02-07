package filosofia.java.p266.abstract_class.abstract_test;

import static filosofia.java.p266.abstract_class.abstract_test.NotAbstractClass.staticMethod;
/* Создайте абстрактный класс без методов.
* Произведите от него класс и добавьте метод.
* Создайте статический метод, получающий ссылку на базовый класс,
* проведите нисходящее преобразование к производному типу и вызовите его метод.
* Продемонстрируйте, что такой способ работает.
 */
public class Main {
    public static void main(String[] args) {
         NotAbstractClass not = new NotAbstractClass();
       AbstractClass not1 = new NotAbstractClass();
       ((NotAbstractClass) not1).print ();
        staticMethod(not);
    }
}
