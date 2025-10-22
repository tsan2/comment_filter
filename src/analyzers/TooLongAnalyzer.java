package analyzers;

import enums.Label;

public class TooLongAnalyzer implements TextAnalyzer {

    private final int maxLength;

    public TooLongAnalyzer(int maxLength){
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) return Label.TOO_LONG;
        else return Label.OK;
    }

    public int getMaxLength() { return this.maxLength; }
}
