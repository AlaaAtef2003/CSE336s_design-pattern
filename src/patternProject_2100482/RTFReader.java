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
}
