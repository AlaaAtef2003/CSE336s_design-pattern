package patternProject_2100482;

//Director
public class RTFReader {
 private TextConverter builder;

 public RTFReader(TextConverter builder) {
     this.builder = builder;
 }

 public void parseRTF(String rtfData) {
     for (char token : rtfData.toCharArray()) {
		         if (token == '@') { 
		             builder.convertFontChange("italic");
		         } else if (token == '$') { 
		             builder.convertParagraph();
		         } else { 
		             builder.convertCharacter(token);
		         }
     }
 }

 
 public static void main(String[] args) {
     // Using ASCIIConverter
		     ASCIIConverter asciiBuilder = new ASCIIConverter();
		     RTFReader asciiReader = new RTFReader(asciiBuilder);
		     asciiReader.parseRTF("@ $ hello world ! ");
		     System.out.println("ASCII Text:");
		     System.out.println(asciiBuilder.getASCIIText());
		     System.out.println("***********************************************");

		     // Using TeXConverter
		     TeXConverter texBuilder = new TeXConverter();
		     RTFReader texReader = new RTFReader(texBuilder);
		     texReader.parseRTF("@ $ hello world !");
		     System.out.println("TeX Text:");
		     System.out.println(texBuilder.getTeXText());
		     System.out.println("***********************************************");

		     // Using TextWidgetConverter
		     TextWidgetConverter widgetBuilder = new TextWidgetConverter();
		     RTFReader widgetReader = new RTFReader(widgetBuilder);
		     widgetReader.parseRTF("@ $ hello world ! ");
		     System.out.println("Text Widget Data:");
		     widgetBuilder.printTextWidget();
		 }
}
