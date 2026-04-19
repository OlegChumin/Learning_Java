package Part_06_Lambda.Part_41;

public class CheckOverGrade implements StudentChecks{

    @Override
    public boolean check(Student student) {
        return student.averageGrade > 8;
    }
}
