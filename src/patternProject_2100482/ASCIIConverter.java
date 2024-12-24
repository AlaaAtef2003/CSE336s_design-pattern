package patternProject_2100482;

public class ASCIIConverter implements TextConverter  {
	 private StringBuilder asciiText = new StringBuilder();

	    @Override
	    public void convertCharacter(char c) {
	        asciiText.append(c);
	    }

	    @Override
	    public void convertFontChange(String font) {
	    	// ASCII doesn't support font changes
	    }

	    @Override
	    public void convertParagraph() {
	        asciiText.append("{ASCIIParagraph}");
	    }

	    public String getASCIIText() {
	        return asciiText.toString();
	    }
}



