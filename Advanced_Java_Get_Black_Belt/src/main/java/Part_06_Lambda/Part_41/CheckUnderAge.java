package Part_06_Lambda.Part_41;

public class CheckUnderAge implements StudentChecks{
    @Override
    public boolean check(Student student) {
        return student.age < 30;
    }
}
