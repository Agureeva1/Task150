package filosofia.java.p97.type_object;
/* Напишите программу,
 * определяющую тип объекта(переменной)
 */

public class Main {
    int a = 1, b = 10, c = 200;
    char ch = 'w';

    public static void main(String[] args) {
        Main obj = new Main();
        Car car = new Car();
        Cat cat = new Cat();
        People people = new People();

        String objA = obj.typeObject(obj.a);
        System.out.println("Переменная a имеет тип " + objA);
        String objCh = obj.typeObject(obj.ch);
        System.out.println("Переменная ch имеет тип " + objCh);
        String objCar = obj.typeObject(car);
        System.out.println("Объект car имеет тип " + objCar);
        String objCat = obj.typeObject(cat);
        System.out.println("Объект cat имеет тип " + objCat);
        String objPeople = obj.typeObject(people);
        System.out.println("Объект people имеет тип " + objPeople);

    }

    /**
     * Метод возвращает тип объекта (переменной),
     * переданного как аргумент
     *
     * @param o - передаваемый параметр, тип которого требуется установить
     * @return - тип параметра или null, если тип не установлен
     */
    public String typeObject(Object o) {
        if (o instanceof String) {
            return "String";
        }
        if (o instanceof Character) {
            return "char";
        }
        if (o instanceof Long) {
            return "long";
        }
        if (o instanceof Integer) {
            return "int";
        }
        if (o instanceof Boolean) {
            return "boolen";
        }
        if (o instanceof Byte) {
            return "byte";
        }
        if (o instanceof Short) {
            return "short";
        }
        if (o instanceof Float) {
            return "float";
        }
        if (o instanceof Double) {
            return "double";
        }
        if (o instanceof People) {
            return "people";
        }
        if (o instanceof Car) {
            return "car";
        }
        return null;
    }
}
