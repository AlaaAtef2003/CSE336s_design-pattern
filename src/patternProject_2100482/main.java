package patternProject_2100482;
public class main {
public static void main(String[] args) {
     // Using ASCIIConverter
		     ASCIIConverter asciiText = new ASCIIConverter();
		     RTFReader asciiReader = new RTFReader(asciiText);
		     asciiReader.parseRTF("@ $ hello world ! ");
		     System.out.println("ASCII Text:");
		     System.out.println(asciiText.getASCIIText());
              System.out.println("***********************************************");
		
		     // Using TeXConverter
		     TeXConverter texText = new TeXConverter();
		     RTFReader texReader = new RTFReader(texText);
		     texReader.parseRTF("@ $ hello world ! ");
		     System.out.println("TeX Text:");
		     System.out.println(texText.getTeXText());
		     System.out.println("***********************************************");

		     // Using TextWidgetConverter
		     TextWidgetConverter TextWidget = new TextWidgetConverter();
		     RTFReader widgetReader = new RTFReader(TextWidget);
		     widgetReader.parseRTF("@ $ hello world ! ");
		     System.out.println("Text Widget Data:");
		     System.out.println(TextWidget.getTextWidget());
		    
		 }
}

