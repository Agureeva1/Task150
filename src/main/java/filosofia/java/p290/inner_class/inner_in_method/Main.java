package filosofia.java.p290.inner_class.inner_in_method;
/* Создайте интерфейс, содержащий минимум один метод.
* Реализуйте его, определив внутренний класс в методе,
* который возвращает ссылку на наш интерфейс.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyClass m = new MyClass();
        m.myInterface().start();
    }
}
