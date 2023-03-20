package parser;

import records.GitHubUserRepo;

import java.net.URI;

public final class GitHubParser extends LinkParser {
    public GitHubParser(String domain) {
        super(domain);
    }

    @Override
    public Object resolve(URI link) {
        if (link.getHost().equals(domain)) {
            System.out.println("penis");
        }
        if (next != null) {
            next.resolve(link);
        }
        return null;
    }
}
