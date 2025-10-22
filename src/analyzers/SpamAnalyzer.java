package analyzers;

import enums.Label;

public class SpamAnalyzer extends KeywordAnalyzer {

    private final String[] keywords;

    public SpamAnalyzer(String[] keywords){
        this.keywords = keywords.clone();
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    @Override
    protected String[] getKeywords() {
        return keywords.clone();
    }
}
