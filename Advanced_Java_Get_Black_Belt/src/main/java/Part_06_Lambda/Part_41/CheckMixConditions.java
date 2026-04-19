package Part_06_Lambda.Part_41;

public class CheckMixConditions implements StudentChecks {
    @Override
    public boolean check(Student student) {
        return student.age > 20 && student.averageGrade < 9.5 && student.maleFemale == 'f';
    }
}
