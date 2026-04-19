package lesson_03.solid._5_dependency_inversion.with_dip;

public class DataSaver implements Database{
    private MySQLDatabase database;

    public DataSaver(MySQLDatabase database) {
        this.database = database;
    }

    @Override
    public void saveData(String data) {
    }
}
