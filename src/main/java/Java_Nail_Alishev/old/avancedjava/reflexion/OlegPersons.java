package Java_Nail_Alishev.old.avancedjava.reflexion;

@OlegAnnotationNew
public class OlegPersons {
    private int id;
    private String name;

    public OlegPersons() {
        this.id = -1;
        this.name = "No name";
    }

    public OlegPersons(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHallo() {
        System.out.println("Person with id: " + id + " and name: " + name + " says Hello!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OlegPersons{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
