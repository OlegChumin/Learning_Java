package Part_03_Generics.Game;

public class TestGame {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Maria", 15);

        Schoolar schoolar3 = new Schoolar("Serg", 12);
        Schoolar schoolar4 = new Schoolar("Oliya", 14);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Ksenia", 18);

        Employee employee1 = new Employee("Maxim", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
//        schoolarTeam.addNewParticipant(student1);
//        schoolarTeam.addNewParticipant(employee1);

        Team<Student> studentTeam = new Team<>("Vector");
        Team<Employee> employeeTeam = new Team<>("Machine");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

//        employeeTeam.addNewParticipant(student2);

//        Team<String> anotherTeam = new Team<>("things");
//        anotherTeam.addNewParticipant("Hallo"); // так не должно быть

        Team<Schoolar> schoolarTeam2 = new Team<>("Super");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);

//        schoolarTeam.playWith(employeeTeam);
    }
}
