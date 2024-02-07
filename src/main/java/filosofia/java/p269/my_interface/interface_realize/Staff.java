package filosofia.java.p269.my_interface.interface_realize;

import filosofia.java.p269.my_interface.only_interface.SomePerson;

public class Staff {
    SomePerson person;
    Position post;
    int salary;

    public Staff (SomePerson person, Position post, int salary){
       this.person = person;
        this.post = post;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "person=" + person +
                ", post=" + post +
                ", salary=" + salary + " руб." +
                '}';
    }
}
