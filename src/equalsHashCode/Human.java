package equalsHashCode;

import java.util.Objects;

public class Human {
    private int ID;
    private String name;

    public Human(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Human() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Human human)) {
            return false;
        }
        return ID == human.ID && Objects.equals(this.name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name);
    }
}
