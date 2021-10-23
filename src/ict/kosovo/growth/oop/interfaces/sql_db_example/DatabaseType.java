package ict.kosovo.growth.oop.interfaces.sql_db_example;

public enum DatabaseType {
    MySQL("mysql", 1433),
    MSSQL("mssql", 3306),
    OracleSQL("oracle", 9999),
    PostgresSQL("postgress", 2000),
    MariaDB("maria", 1234);

    private final String dbType;
    private final int dbPort;

    private DatabaseType(String dbType, int dbPort) {
        this.dbType = dbType;
        this.dbPort = dbPort;
    }

    public String getDbType() {
        return dbType;
    }


    public int getPort() {
        return this.dbPort;
    }
    @Override
    public String toString() {
        return getDbType();
    }
}
