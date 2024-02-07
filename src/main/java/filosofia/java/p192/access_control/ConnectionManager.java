package filosofia.java.p192.access_control;
/* Создайте класс ConnectionManager,
* который управляет фиксированным массивом объектов.
* Программист клиент не должен напрямую создавать объекты класса ConnectionManager,
* а может получать их только при помощи статического метода.
* Когда запас объектов у массива будет исчерпан он должен вернуть ссылку null.
 */
public class ConnectionManager {
    private int num;
    private static int number=1;
    private static int count=0;
private static ConnectionManager [] cmArr = new ConnectionManager []{
        new ConnectionManager(),
        new ConnectionManager(),
        new ConnectionManager(),
        new ConnectionManager(),
        new ConnectionManager(),};

    private ConnectionManager() {
     this.num+=number;
        System.out.println("создан новый объект #" + num);
        ++number;
    }

    public static ConnectionManager getConnectionManager() {
if (cmArr.length>count) {
    System.out.println("Ты вызвал объект " + cmArr[count].num);
    return cmArr[count++];
}
   else {
    System.out.println("Объекты закончились");
    return null;
}
    }

}
