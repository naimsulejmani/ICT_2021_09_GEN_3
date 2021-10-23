package ict.kosovo.growth.oop.interfaces.sql_db_example;

public class TestConnectionString {
    public static void main(String[] args) {
        ConnectionString mssqlConStr = new ConnectionString(
                "192.168.1.100","ICKKosovo","ictuser",
                "123456",DatabaseType.MSSQL
        );

        System.out.println(mssqlConStr);
    }
}
