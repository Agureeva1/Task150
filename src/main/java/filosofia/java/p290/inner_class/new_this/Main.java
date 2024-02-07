package filosofia.java.p290.inner_class.new_this;
/* Создайте класс с внутренним классом. В отдельном классе создайте
* экземпляр внутреннего класса.
 */
public class Main {
    public static void main(String[] args) {
        House house = new House();
        House.Roof roof = house.new Roof(TypeRoof.DOUBLE_PITCH);
        House.Wall wall = house.new Wall(MaterialWall.BRICK);
        House myHouse = new House(house.new Roof(TypeRoof.TENT),house.new Wall(MaterialWall.STONE));

        System.out.println(house);
        System.out.println(roof);
        System.out.println(wall);
        System.out.println(myHouse);
    }
}
