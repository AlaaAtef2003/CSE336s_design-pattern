package patternProject_2100482;
import java.util.ArrayList;
import java.util.List;
class TextWidgetConverter implements TextConverter {
    private List<String> widgetData = new ArrayList<>();

    @Override
    public void convertCharacter(char c) {
        widgetData.add(String.valueOf(c));
    }

    @Override
    public void convertFontChange(String font) {
        widgetData.add("[TextWidgetfont: " + font+"]");
    }

    @Override
    public void convertParagraph() {
        widgetData.add("{TextWidgetParagraph}");
    }

    public void printTextWidget() {
        widgetData.forEach(data -> System.out.print(data + " "));
        System.out.println();
    }
}


