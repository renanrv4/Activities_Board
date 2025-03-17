package br.com.board.persistence.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        var url = System.getenv("URL");
        var user = System.getenv("USER");
        var password = System.getenv("PASSWORD");
        var connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);
        return connection;
    }

}
