package Alishev.BaseJava;

import java.io.*;
import java.util.Arrays;

public class Lesson45SerializationDeSerialization {

}

class Persons implements Serializable {
//    @Serial
    private static final long serialVersionUID = 5196844826488485770L;
    private int id;
    private transient String name;



    public Persons(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}


class WriteObject {
    public static void main(String[] args) {
//        Persons persons1 = new Persons(1, "Oleg");
//        Persons persons2 = new Persons(2, "Olaf");
        Persons[] people = {new Persons(1, "Oleg"), new Persons(2, "Olaf"),
                new Persons(3, "Tom")};

        try {
            FileOutputStream out = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(out);

            oos.writeObject(people);

//            oos.writeInt(people.length);
//            for (Persons element : people) {
//                oos.writeObject(element);
//            }

//            oos.writeObject(persons1);
//            oos.writeObject(persons2);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(in);
//            int personsCount = ois.readInt();
//            Persons[] people = new Persons[personsCount];
//            for (int i = 0; i < personsCount; i++) {
//                people[i] = (Persons) ois.readObject();
//            }
            Persons[] people = (Persons[]) ois.readObject();

            System.out.println(Arrays.toString(people));
//
//            Persons persons1 = (Persons) ois.readObject();
//            Persons persons2 = (Persons) ois.readObject();
//
//            System.out.println(persons1);
//            System.out.println(persons2);

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}