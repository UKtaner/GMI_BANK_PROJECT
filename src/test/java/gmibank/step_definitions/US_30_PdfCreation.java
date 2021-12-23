package gmibank.step_definitions;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import gmibank.utilities.DatabaseUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class US_30_PdfCreation {
    List<Object> fnameList;
    List<Object> lnameList;
    String first_name;
    String last_name;
    @Given("user sends the query to db and reads related country data {string}")
    public void user_sends_the_query_to_db_and_reads_related_country_data(String query) {
      first_name ="first_name";
      last_name = "last_name";
        fnameList= DatabaseUtility.getColumnData(query,first_name);
        lnameList = DatabaseUtility.getColumnData(query,last_name);
    }
    @Then("user creates pdf with information")
    public void user_creates_pdf_with_information() {
        Document document = new Document();
        String path ="src/test/resources/testdata/info.pdf";
        String title ="CUSTOMER INFORMATION";
        List<String > headers = new ArrayList<>();
        headers.add(first_name);
        headers.add(last_name);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();
            document.add( new Paragraph("          "+title));
            PdfPTable table = new PdfPTable(headers.size());
            table.setWidthPercentage(110);
            table.setSpacingBefore(30);
            table.setSpacingAfter(30);
            float [] colWidth={3,3};
            table.setWidths(colWidth);


//            PdfPCell cell1 = new PdfPCell( new Phrase(headers.get(0)));
//            table.addCell(cell1);
//            PdfPCell cell2 = new PdfPCell(new Phrase(headers.get(1)));
//            table.addCell(cell2);
//
            for(int i = 0;i<headers.size();i++){
                PdfPCell cell1 = new PdfPCell(new Phrase(headers.get(i)));
                table.addCell(cell1);
            }

            table.setHeaderRows(fnameList.size());
//
//            for (int i =0;i<fnameList.size();i++){
//                table.addCell(fnameList.get(i).toString());
//                table.addCell(lnameList.get(i).toString());
//
//            }
            for (int i =1;i<fnameList.size();i++) {
                document.add(new Paragraph("         "+fnameList.get(i).toString()+ "  " +lnameList.get(i).toString()));
            }

            document.add(table);
            document.close();
            writer.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
