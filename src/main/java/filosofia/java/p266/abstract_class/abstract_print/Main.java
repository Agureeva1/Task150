package filosofia.java.p266.abstract_class.abstract_print;

/* Создайте базовый класс с определением метода abstract print (),
* переопределяемого производным классом.
* Переопределенная версия метода должна выводить значение переменной int,
* определенной в производном классе.
* В точке определения этой переменной присвойте ей не нулевое значение.
* Вызовите этот метод в конструкторе базового класса. В main создайте объект производного типа,
* а затем вызовите метод print (). Посмотрите, что произойдет.
 */
public class Main {
    public static void main(String[] args) {
        Numbers n=new Numbers();
        System.out.println(n.print());

    }
}
