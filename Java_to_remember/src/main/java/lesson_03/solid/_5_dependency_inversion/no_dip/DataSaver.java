package lesson_03.solid._5_dependency_inversion.no_dip;

public class DataSaver {
    private MySQLDatabase database;

    public DataSaver(MySQLDatabase database) {
        this.database = database;
    }

    public void saveDate(String data) {
        database.saveData(data);
    }
}
