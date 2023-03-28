package app;

import parser.domains.DomainName;
import parser.GitHubParser;
import parser.LinkParser;
import parser.StackOverFlowParser;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class ParserApp {
    public static void main(String[] args) throws URISyntaxException {
        System.out.println("Enter url:\n");
        URI inputURI = new URI(new Scanner(System.in).nextLine());
        LinkParser githubURLParser = new GitHubParser(DomainName.GITHUB_DOMAIN.getValue());
        LinkParser stackOverFlowParser = new StackOverFlowParser(DomainName.STACKOVERFLOW_DOMAIN.getValue());
        githubURLParser.setNext(stackOverFlowParser);
        System.out.println(githubURLParser.resolve(inputURI));
    }
}
