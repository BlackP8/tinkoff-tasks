package app;

import parser.domains.DomainName;
import parser.GitHubParser;
import parser.LinkParser;
import parser.StackOverFlowParser;

import java.net.URI;
import java.net.URISyntaxException;

public class ParserApp {
    public static void main(String[] args) throws URISyntaxException {
        URI gitUri = new URI("https://github.com/sanyarnd/tinkoff-java-course-2022/");
        URI stackUri = new URI("https://stackoverflow.com/search?q=unsupported%20link");
        LinkParser githubURLParser = new GitHubParser(DomainName.GITHUB_DOMAIN.getValue());
        LinkParser stackOverFlowParser = new StackOverFlowParser(DomainName.STACKOVERFLOW_DOMAIN.getValue());
        githubURLParser.setNext(stackOverFlowParser);
        githubURLParser.resolve(stackUri);
    }
}
