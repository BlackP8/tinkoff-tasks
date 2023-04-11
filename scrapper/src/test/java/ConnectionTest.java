import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseConnection;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

@Slf4j
public class ConnectionTest extends IntegrationEnvironment{
    @Test
    void testConnection() {
        String url = IntegrationEnvironment.getInstance().getJdbcUrl();
        String userName = IntegrationEnvironment.getInstance().getUsername();
        String password = IntegrationEnvironment.getInstance().getPassword();

        try(DatabaseConnection conn = new JdbcConnection(DriverManager.getConnection(url, userName, password));
                Database database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(conn))
        {
            Liquibase liquibase = new liquibase.Liquibase(new java.io.File(".").getAbsolutePath(),
                    new ClassLoaderResourceAccessor(), database);
            liquibase.update();
            Assert.assertNotNull(IntegrationEnvironment.getInstance().getContainerId());
        }
        catch (LiquibaseException | SQLException ex) {
            log.error(ex.getMessage());
        }
    }
}
