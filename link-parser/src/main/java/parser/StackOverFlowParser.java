package parser;

import records.StackOverFlowQuestion;

import java.net.URI;
import java.util.regex.Pattern;

public final class StackOverFlowParser extends LinkParser {
    public StackOverFlowParser(String domain) {
        super(domain);
    }

    @Override
    public Object resolve(URI link) {
        if (link.getHost().equals(domain)) {
            String questionId = link.toString().split(Pattern.quote("questions/"))[1].split(Pattern.quote("/"))[0];
            StackOverFlowQuestion question1 = new StackOverFlowQuestion(questionId);
            return question1.toString();
        }
        if (next != null) {
            next.resolve(link);
        }
        return null;
    }
}
