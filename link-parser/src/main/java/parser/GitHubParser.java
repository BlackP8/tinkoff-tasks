package parser;

import records.GitHubInfo;
import java.net.URI;
import java.util.regex.Matcher;

public final class GitHubParser extends LinkParser {
    public GitHubParser(String domain) {
        super(domain);
    }

    @Override
    public Object resolve(URI link) {
        GitHubInfo userRepo;
        if (link.getHost().equals(domain)) {
            Matcher matcher = createMatcher("/(.*/.*)/", link.getPath());
            if (matcher.find()) {
                userRepo = new GitHubInfo(matcher.group(1));
                return userRepo.info();
            }
        }
        if (next != null) {
            return next.resolve(link);
        }
        return null;
    }
}
