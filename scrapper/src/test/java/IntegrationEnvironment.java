import org.testcontainers.containers.PostgreSQLContainer;

abstract class IntegrationEnvironment {
    private static final String IMAGE_NAME = "postgres:14.1";
    private static PostgreSQLContainer POSTGRES_CONTAINER;

    protected static void startContainer() {
        POSTGRES_CONTAINER = new PostgreSQLContainer();
        POSTGRES_CONTAINER.start();
    }

    protected static PostgreSQLContainer getInstance() {
        if (POSTGRES_CONTAINER == null) {
            startContainer();
        }
        return POSTGRES_CONTAINER;
    }
}
