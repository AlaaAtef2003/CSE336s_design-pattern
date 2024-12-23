package patternProject_2100482;

//Director
public class RTFReader {
 private TextConverter builder;

 public RTFReader(TextConverter builder) {
     this.builder = builder;
 }

 public void parseRTF(String rtfData) {
     for (char token : rtfData.toCharArray()) {
         if (token == '@') { // Simulate a font change
             builder.convertFontChange("italic");
         } else if (token == '$') { // Simulate a paragraph
             builder.convertParagraph();
         } else { // Default character conversion
             builder.convertCharacter(token);
         }
     }
 }

 
 public static void main(String[] args) {
     // Using ASCIIConverter
     ASCIIConverter asciiBuilder = new ASCIIConverter();
     RTFReader asciiReader = new RTFReader(asciiBuilder);
     asciiReader.parseRTF("@  hello$ world ! ");
     System.out.println("ASCII Text:");
     System.out.println(asciiBuilder.getASCIIText());

     // Using TeXConverter
     TeXConverter texBuilder = new TeXConverter();
     RTFReader texReader = new RTFReader(texBuilder);
     texReader.parseRTF("@  hello$ world ! ");
     System.out.println("TeX Text:");
     System.out.println(texBuilder.getTeXText());

     // Using TextWidgetConverter
     TextWidgetConverter widgetBuilder = new TextWidgetConverter();
     RTFReader widgetReader = new RTFReader(widgetBuilder);
     widgetReader.parseRTF("@  hello$ world ! ");
     System.out.println("Text Widget Data:");
     widgetBuilder.printTextWidget();
 }
}
