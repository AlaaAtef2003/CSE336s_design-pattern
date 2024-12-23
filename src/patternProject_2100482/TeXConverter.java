package patternProject_2100482;

public class TeXConverter implements  TextConverter {
	private StringBuilder texText = new StringBuilder();

    @Override
    public void convertCharacter(char c) {
        texText.append(c);
    }

    @Override
    public void convertFontChange(String font) {
        texText.append("[TeXfont :").append(font).append("]");
    }

    @Override
    public void convertParagraph() {
        texText.append("{TeXParagraph}");
    }

    public String getTeXText() {
        return texText.toString();
    }
}

