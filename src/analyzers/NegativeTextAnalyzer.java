package analyzers;

import enums.Label;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private final String[] keywords;

    public NegativeTextAnalyzer(){
        this.keywords = new String[] {":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    protected String[] getKeywords() {
        return keywords.clone();
    }
}
