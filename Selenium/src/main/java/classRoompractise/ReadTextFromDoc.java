package classRoompractise;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class ReadTextFromDoc {

	static int count=0;
	static int newcount=0;
		@SuppressWarnings("unlikely-arg-type")
		public static void readDocxFile(String fileName) {

			try {
				File file = new File(fileName);
				FileInputStream fis = new FileInputStream(file.getAbsolutePath());

				XWPFDocument document = new XWPFDocument(fis);

				List<XWPFParagraph> paragraphs = document.getParagraphs();
				
				System.out.println("Total no of paragraph "+paragraphs.size());
				for (XWPFParagraph para : paragraphs) {
					//System.out.println(para.getText());
					String s=para.getText();
					
					String[] split = s.split("\\s");
					for(String word:split)
					{
						if(word.equalsIgnoreCase("madhavan"))
						{
							count++;
						}
						
						else if(word.equalsIgnoreCase("ragu"))
						{
							newcount++;
						}
					}
					
					
				}
				System.out.println("madhavan occuring"+ count);
				System.out.println("madhavan occuring"+ newcount);
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void main(String[] args) {

			readDocxFile("C:\\Users\\rmadhavan\\Desktop\\filen.docx");

	}

}
