import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.scene.control.Cell;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreatePdf {

    public static void main(String... args) throws FileNotFoundException, DocumentException {
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        PdfWriter.getInstance(document, new FileOutputStream("result.pdf"));
        document.open();
        Font font = new Font(Font.FontFamily.UNDEFINED, 20.0f);
        Paragraph paragraph = new Paragraph("Resume\n\n", font);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(paragraph);
        PdfPTable table = new PdfPTable(2);
        PdfPCell cell = new PdfPCell(Phrase.getInstance("First Name"));
        cell.setFixedHeight(50);
        cell.setPadding(10);
        table.addCell(cell);
        cell.setPhrase(Phrase.getInstance("Mieszko"));
        table.addCell(cell);
        cell.setPhrase(Phrase.getInstance("Last Name"));
        table.addCell(cell);
        cell.setPhrase(Phrase.getInstance("Maciura"));
        table.addCell(cell);
        cell.setPhrase(Phrase.getInstance("Proffesion"));
        table.addCell(cell);
        cell.setPhrase(Phrase.getInstance("Poor quality code creator"));
        table.addCell(cell);
        cell.setPhrase(Phrase.getInstance("Education"));
        table.addCell(cell);
        cell.setPhrase(Phrase.getInstance("Current pending..."));
        table.addCell(cell);
        cell.setPhrase(Phrase.getInstance("Summary"));
        table.addCell(cell);
        cell.setPhrase(Phrase.getInstance("I'm a noobcoder"));
        table.addCell(cell);
        document.add(table);
        document.close();
    }
}