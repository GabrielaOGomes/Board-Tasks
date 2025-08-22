import java.sql.SQLException;

import static com.dio.persistence.config.ConnectionConfig.getConnection;
import com.dio.persistence.migration.MigrationStrategy;

import com.dio.ui.MainMenu;

public class BoardApplication {
         public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }
    }
