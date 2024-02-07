package filosofia.java.p269.my_interface.interface_realize;

import java.time.LocalDate;
/* Создайте в отдельном пакете интерфейс,
*  содержащий три метода. В отдельном пакете реализуйте этот интерфейс.
* Докажите, что все методы интерфейса автоматически являются public.
 */
public class Main {

    public static void main(String[] args) {
        Person Jon = new Person("Jack",LocalDate.of(1942,12,2),32);
        System.out.println(Jon);
        Jon.name = "Jon";
        Jon.birthday = LocalDate.of(1988,7,22);
        System.out.println( Jon.birthday);
        Jon.setAge();
        System.out.println( Jon.age);
        Jon.isSoonBirthDay();
        System.out.println(Jon);
        Staff employee= new Staff(Jon,Position.ENGINEER,230000);
        System.out.println(employee);
    }
}
