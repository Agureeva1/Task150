package filosofia.java.p269.my_interface.interface_realize;

import filosofia.java.p269.my_interface.only_interface.SomePerson;

import java.time.LocalDate;

public class Person implements SomePerson {
    String name;
    LocalDate birthday;
    int age;

    public Person(String name, LocalDate birthday, int age) {
        this.name=name;
        this.birthday=birthday;
        this.age=age;
    }

    @Override
    public void setAge() {
        if (LocalDate.now().getDayOfYear() - this.birthday.getDayOfYear() < 0) {
            this.age = LocalDate.now().getYear() - this.birthday.getYear() - 1;
        } else {
            this.age = LocalDate.now().getYear() - this.birthday.getYear();
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                '}';
    }

    @Override
    public void isSoonBirthDay() {
        int dayToday = LocalDate.now().getDayOfYear();
        int dayBirthday = this.birthday.getDayOfYear();
        int sub = dayBirthday - dayToday;

        if (sub > 0) {
            System.out.println("До вашего дня рождения осталось " + sub + " д.");
        } else if (sub < 0) {
            System.out.println("В этом году вы уже праздновали день рождения.");
        } else if (sub == 0) {
            System.out.println("Поздравляем с днем рождения! ");
        }

    }
}
