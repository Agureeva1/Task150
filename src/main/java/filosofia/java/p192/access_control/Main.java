package filosofia.java.p192.access_control;

import filosofia.java.p184.enum_test.*;
import filosofia.java.p192.access_control.test.AccessControlTest;

import static filosofia.java.p192.access_control.ConnectionManager.getConnectionManager;
/* Создайте экземпляр класса за пределами пакета.*/

/* Покажите, что метод со спецификатором protected
 * обладает доступом в пределах пакета,
 * но не является открытым.
 */
public class Main {
    public static void main(String[] args) {
        Tour tour = new Tour(Country.USA,18);
        AccessControlTest accessControlTest = new AccessControlTest();
        System.out.println(accessControlTest.getAccess());
       // accessControlTest.setAccess("public");
        getConnectionManager();
        getConnectionManager();
        getConnectionManager();
        getConnectionManager();
        getConnectionManager();
        getConnectionManager();
    }
}
