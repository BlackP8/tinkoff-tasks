package parser;

import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract non-sealed class LinkParser implements Parser {
    protected String domain;
    protected LinkParser next;

    public LinkParser(String domain) {
        this.domain = domain;
    }

    public void setNext(LinkParser next) {
        this.next = next;
    }

    public final Matcher createMatcher(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher;
    }

    @Override
    public abstract Object resolve(URI link);
}
