package analyzers;

import enums.Label;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private final String[] keywords;

    public NegativeTextAnalyzer(String[] keywords){
        this.keywords = keywords.clone();
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public String[] getKeywords() {
        return keywords.clone();
    }
}
