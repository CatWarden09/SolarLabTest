package ru.catwarden.sltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private Config config;
    private String dburl;
    private String dbuser;
    private String dbpassword;

    public Database(Config config){
        this.config = config;
        this.dburl = config.getDatabaseUrl();
        this.dbuser = config.getDatabaseUser();
        this.dbpassword = config.getDatabasePassword();

    }

    public Connection connectToDatabase() throws SQLException {
        return DriverManager.getConnection(this.dburl, this.dbuser, this.dbpassword);

    }
// testtest
}
