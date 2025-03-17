package br.com.board;

import br.com.board.persistence.config.ConnectionConfig;
import br.com.board.persistence.migration.MigrationStrategy;
import br.com.board.ui.MainMenu;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = ConnectionConfig.getConnection()) {
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
