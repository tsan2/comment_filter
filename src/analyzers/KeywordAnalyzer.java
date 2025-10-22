package analyzers;

import enums.Label;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    public abstract Label getLabel();
    public abstract String[] getKeywords();

    @Override
    public Label processText(String text) {
        for (String keyword : getKeywords()){
            if (text.toLowerCase().contains(keyword.toLowerCase())){
                return getLabel();
            }
        }
        return Label.OK;
    }
}
