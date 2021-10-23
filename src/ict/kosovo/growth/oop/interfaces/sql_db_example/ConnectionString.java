package ict.kosovo.growth.oop.interfaces.sql_db_example;

public class ConnectionString {
    private String server;
    private int port;
    private String database;
    private String username;
    private String password;
    DatabaseType dbType;

    public ConnectionString(String server, String database, String username, String password, DatabaseType dbType) {
        this.server = server;
        this.port = dbType.getPort();
        this.database = database;
        this.username = username;
        this.password = password;
        this.dbType = dbType;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DatabaseType getDbType() {
        return dbType;
    }

    public void setDbType(DatabaseType dbType) {
        this.dbType = dbType;
    }

    @Override
    public String toString() {
        return String.format("jdbc:%s://%s:%d;databaseName=%s;userName=%s;password=%s",
                dbType.getDbType(), server, port, database, username, password);
    }
}
