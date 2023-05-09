package SOLID._5_dependency_inversion.with_dip;

public class DataSaver {
    private Database database;
    
    public DataSaver(Database database) {
        this.database = database;
    }

    public void saveData(String data) {
        database.saveData(data);
    }
}