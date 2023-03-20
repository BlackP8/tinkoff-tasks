package parser.domains;

public enum DomainName {
    GITHUB_DOMAIN("github.com"),
    STACKOVERFLOW_DOMAIN("stackoverflow.com");

    private final String value;

    DomainName(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
