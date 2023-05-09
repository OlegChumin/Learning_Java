package SOLID._5_dependency_inversion.no_dip;

public class DataSaver {
    private MySQLDatabase database;
    
    public DataSaver(MySQLDatabase database) {
        this.database = database;
    }

    public void saveData(String data) {
        database.saveData(data);
    }
}