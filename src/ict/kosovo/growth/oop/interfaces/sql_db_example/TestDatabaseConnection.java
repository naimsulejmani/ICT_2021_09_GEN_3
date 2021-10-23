package ict.kosovo.growth.oop.interfaces.sql_db_example;

import ict.kosovo.growth.oop.interfaces.sql_db_example.exceptions.SQLConnectionStringException;
import ict.kosovo.growth.oop.interfaces.sql_db_example.exceptions.SQLException;

import java.util.Locale;

public class TestDatabaseConnection {
    public static void main(String[] args) throws Exception {
        args = new String[]{"mysql", "192.168.1.100;databaseName=ICKKosovo;userName=ictuser;password=123456"};
        if (args != null && args.length == 2) {
            DatabaseConnection connection = null;

            try{
                switch (args[0].toLowerCase()){
                    case "mysql":
                        connection=new MySQLDatabaseConnection();
                        break;
                    case "mssql":
                        connection=new MSSQLDatabaseConnection();
                        break;
                    default:
                        connection=new MSSQLDatabaseConnection();
                        break;
                }
                String[] strings = args[1].split(";");
                connection.connect(new ConnectionString(strings[0],strings[1],strings[2],strings[3],DatabaseType.MSSQL));
                connection.open();
                int returnValue = connection.execute("INSERT INTO tbl(Id,Name) VALUES (1,'Naim')");
                if(returnValue>=0) System.out.println("U Insertua me sukses!!!");
                else System.out.println("Insertimi deshtoi provoni perseri");
            }
            catch (SQLConnectionStringException ex) {

            }
            catch (SQLException ex) {

            }
            finally {
                connection.close();
            }

        } else {
            System.out.println("Nuk keni dhene argumentet apo parametrat e sistemit ne rregull");
        }


    }
}
