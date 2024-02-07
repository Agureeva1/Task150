package filosofia.java.p269.my_interface.change_test;

import static filosofia.java.p269.my_interface.change_test.ChangeClass.changeByStringBuilder;
import static filosofia.java.p269.my_interface.change_test.ChangeClass.changeStringByArr;
/* Создайте класс с методом, который получает в качестве аргумента String
* и переставляет местами каждую пару символов в полученной строке.
 */
public class Main {
    public static void main(String[] args) {
      String s = "Какой чудесный день";
        String i = "Дрель";

        changeStringByArr (s);
        changeByStringBuilder(s);
        changeStringByArr (i);
        changeByStringBuilder(i);

    }
}


