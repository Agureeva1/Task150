package filosofia.java.p266.abstract_class.new_object;
import java.time.LocalDate;

/* Создайте абстрактный класс,
* которые НЕ имеет ни одного абстрактного метода. 
* Попробуйте создать экземпляр этого класса.
 */
abstract class AbstractPerson {
    String name="Jon";
    LocalDate birthDay = LocalDate.of(1980, 7, 12);
    int age = getAge();

    public int getAge() {
       if (LocalDate.now().getDayOfYear()-birthDay.getDayOfYear()<0) {
           return LocalDate.now().getYear()-birthDay.getYear()-1;
       } else {
           return LocalDate.now().getYear()-birthDay.getYear();
       }
    }


    public static void main(String[] args) {
        //    AbstractPerson person = new AbstractPerson();
        AbstractPerson person = null;
        System.out.println(person.getAge());
    }
}
