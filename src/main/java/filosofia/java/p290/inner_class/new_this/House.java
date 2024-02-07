package filosofia.java.p290.inner_class.new_this;

public class House {
    Roof roof;
    Wall wall;
    public House() {}
    public House(Roof roof, Wall wall) {
        this.roof = roof;
        this.wall = wall;
    }

    @Override
    public String toString() {
        return "House{" +
                "roof=" + roof +
                ", wall=" + wall +
                '}';
    }

    public class Roof {
        TypeRoof type;

        public Roof(TypeRoof type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Roof{" +
                    "type=" + type +
                    '}';
        }
    }

    public class Wall {
        MaterialWall material;

        public Wall(MaterialWall material) {
            this.material = material;

        }

        @Override
        public String toString() {
            return "Wall{" +
                    "material=" + material +
                    '}';
        }
    }

}
