package analyzers;

import enums.Label;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private final String[] keywords;

    public NegativeTextAnalyzer(){
        this.keywords = new String[] {":(", "=(", ":|"};
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
