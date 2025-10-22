import analyzers.NegativeTextAnalyzer;
import analyzers.SpamAnalyzer;
import analyzers.TextAnalyzer;
import analyzers.TooLongAnalyzer;
import enums.Label;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        TooLongAnalyzer longAnalyzer = new TooLongAnalyzer(40);
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[] {"покупайте", "подписывайтесь", "купи", "подписка"});
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer(new String[] {"плохой", "отписка", "скатился", "фу"});
        //добавить чтобы слова спама и негативных сообщений откуда то выкачивались
        //можно потом или докрутить или переиспользовать чтобы было ближе к фильтру комментариев

        TextAnalyzer[] textAnalyzers = new TextAnalyzer[] {longAnalyzer, spamAnalyzer, negativeTextAnalyzer};

        Scanner sc = new Scanner(System.in);

        System.out.println(checkLabels(textAnalyzers, sc.nextLine()));

    }

    static Label checkLabels(TextAnalyzer[] analyzers, String text){
        for (TextAnalyzer analyzer : analyzers){
            Label label = analyzer.processText(text);
            if (label != Label.OK) { return label; }
        }
        return Label.OK;
    }
}