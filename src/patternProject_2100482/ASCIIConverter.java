package patternProject_2100482;

public class ASCIIConverter extends TextConverter  {
	 private StringBuilder asciiText = new StringBuilder();

	    @Override
	    public void convertCharacter(char c) {
	        asciiText.append(c);
	    }

	    @Override
	    public void convertFontChange(String font) {
	        asciiText.append("[ ACSII Font: ").append(font).append("]");
	    }

	    @Override
	    public void convertParagraph() {
	        asciiText.append("{ASCIIParagraph}");
	    }

	    public String getASCIIText() {
	        return asciiText.toString();
	    }
}
