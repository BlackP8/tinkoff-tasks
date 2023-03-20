package parser;

import records.StackOverFlowQuestion;
import java.net.URI;
import java.util.regex.Matcher;

public final class StackOverFlowParser extends LinkParser {
    public StackOverFlowParser(String domain) {
        super(domain);
    }

    @Override
    public Object resolve(URI link) {
        StackOverFlowQuestion question;
        if (link.getHost().equals(domain)) {
            Matcher matcher = createMatcher("questions/(.*)/", link.getPath());
            if (matcher.find()) {
                question = new StackOverFlowQuestion(matcher.group(1));
                return question.questionId();
            }
        }
        if (next != null) {
            return next.resolve(link);
        }
        return null;
    }
}
