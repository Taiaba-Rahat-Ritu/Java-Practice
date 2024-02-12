package com.invoice.com;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.*;
import java.io.FileOutputStream;

public class generatePDF {
    public static void main(String [] args){
        try {
            String fileName = "D:\\work practice\\generatePdf\\test.pdf";
            Document document = new Document();

            PdfWriter.getInstance(document, new FileOutputStream(fileName));

            document.open();
            Paragraph paragraph = new Paragraph("Testing PDF..");

            document.add(paragraph);

            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));

            PdfPTable table = new PdfPTable(3);
            PdfPCell c1 = new PdfPCell(new Phrase("Heading 1"));
            table.addCell(c1);
            c1 = new PdfPCell(new Phrase("Heading 2"));
            table.addCell(c1);
            c1 = new PdfPCell(new Phrase("Heading 3"));
            table.addCell(c1);
            table.setHeaderRows(1);

            table.addCell("A");
            table.addCell("B");
            table.addCell("c");
            table.addCell("D");
            table.addCell("E");
            table.addCell("F");

            document.add(table);


            //add image
            // document.add(Image.getInstance("/url"));





            document.close();
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }
}
