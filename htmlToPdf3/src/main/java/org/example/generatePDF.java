package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;

import java.io.FileNotFoundException;
import java.lang.annotation.Documented;

import static com.itextpdf.kernel.pdf.PdfName.Document;
import static java.awt.Color.blue;
import static java.awt.SystemColor.text;

public class generatePDF {

    public static void main(String [] args) throws FileNotFoundException {
        String path = "invoice.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);

        float col3 = 520f;
        float twocol=285f;
        float twocol150= twocol+150f;
        float twoColumnWidth[] = {twocol, twocol150};
        Color slateblue = new DeviceRgb(11, 80, 79);
        float devider[] = {col3};

        Table table = new Table(twoColumnWidth);
        table.addCell(new Cell().add("Ghuddy").setBorder(Border.NO_BORDER).setBold().setFontSize(20f).setFontColor(slateblue));
        table.addCell(new Cell().add("Reservation"+" "+"Confirmation").setBorder(Border.NO_BORDER).setFontSize(20f).setPaddingLeft(100f));

        Table nestedTable = new Table(new float[]{
                twocol, twocol
        });

        nestedTable.addCell(new Cell().add("Date :").setBorder(Border.NO_BORDER).setPaddingTop(20f).setFontSize(15f));
        nestedTable.addCell(new Cell().add("INVOICE DATE :").setBorder(Border.NO_BORDER).setPaddingTop(20f).setFontSize(15f));
        nestedTable.addCell(new Cell().add("Company : Ghuddy Limited").setBorder(Border.NO_BORDER).setFontSize(10f));
        nestedTable.addCell(new Cell().add("Order :").setBold().setBorder(Border.NO_BORDER).setFontSize(10f));
        nestedTable.addCell(new Cell().add("Phone : +88001797078379").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
        nestedTable.addCell(new Cell().add("Email : support@ghuddy.com").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));

        Paragraph paragraph = new Paragraph("Thank you for your interest in Ghuddy Limited. We are pleased to confirm the following reservation details for your kind reference.").setFontSize(9f).setPaddingBottom(20f);
        Paragraph p1 = new Paragraph("Customer Name :").setPaddingBottom(20f).setFontSize(10f);
        Paragraph p2 = new Paragraph("Phone :").setPaddingBottom(20f).setFontSize(10f);
        Paragraph p3 = new Paragraph("Email :").setPaddingBottom(20f).setFontSize(10f);
        Paragraph p4 = new Paragraph("Checkin Time :").setPaddingBottom(20f).setFontSize(10f);
        Paragraph p5 = new Paragraph("Checkout Time :").setPaddingBottom(20f).setFontSize(10f);

        Paragraph order = new Paragraph("ORDER DETAILS :").setFontSize(15f);
        Table orderDetails = new Table(new float[]{
                col3/5, col3/4, col3/3, col3/3, col3/3
        });
        orderDetails.addCell(new Cell().add("No.").setBold());
        orderDetails.addCell(new Cell().add("Title ").setBold());
        orderDetails.addCell(new Cell().add("Description ").setBold());
        orderDetails.addCell(new Cell().add("Quantity ").setBold());
        orderDetails.addCell(new Cell().add("Total Price ").setBold());

        Table title = new Table((int) col3);
        title.addCell(new Cell().add("Ghuddy").setBorder(Border.NO_BORDER).setFontSize(15f).setPaddingTop(220f).setPaddingLeft(230f));


        Border hr = new SolidBorder(Color.BLACK,1f/2f);
        Table HR = new Table(devider);
        HR.setBorder(hr);

        Paragraph footer1 = new Paragraph("RAHMAN VILLA - KA-18, BARIDHARA, NORTH ROAD - DHAKA - 1212, BANGLADESH").setTextAlignment(TextAlignment.CENTER);
        Paragraph footer2 = new Paragraph("© All Rights Reserved. Ghuddy, 2024").setTextAlignment(TextAlignment.CENTER);

        document.add(table);
        document.add(nestedTable);
        document.add(paragraph);
        document.add(p1);
        document.add(p2);
        document.add(p3);
        document.add(p4);
        document.add(p5);
        document.add(order);
        document.add(orderDetails);
        document.add(title);
        document.add(HR);
        document.add(footer1);
        document.add(footer2);
        document.close();
    }
}

