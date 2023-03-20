package parser;

import java.net.URI;

public abstract non-sealed class LinkParser implements Parser {
    protected String domain;
    protected LinkParser next;

    public LinkParser(String domain) {
        this.domain = domain;
    }

    public void setNext(LinkParser next) {
        this.next = next;
    }

    @Override
    public abstract Object resolve(URI link);
}
