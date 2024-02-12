package org.example;

import com.codingerror.service.CodingErrorPdfInvoiceCreator;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.events.Event;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.draw.SolidLine;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;

import com.itextpdf.layout.element.LineSeparator;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;


import java.io.FileNotFoundException;


import java.util.Scanner;


public class generatePDF {

    public static void main(String[] args) throws FileNotFoundException {

        String pdfName= "invoice.pdf";
        CodingErrorPdfInvoiceCreator cepdf=new CodingErrorPdfInvoiceCreator(pdfName);
        cepdf.createDocument();

        PdfWriter pdfWriter = new PdfWriter(pdfName);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);

        MyEventHandler eventHandler = new MyEventHandler(document);
        pdfDocument.addEventHandler(PdfDocumentEvent.END_PAGE, eventHandler);


        order o = new order();
        int orderNo = o.getOrderNo();
        String orderTitle = o.getOrderTitle();
        String orderDescription = o.getOrderDescription();
        int orderQuantity = o.getOrderQuantity();
        int totalPrice = o.getTotalPrice();


        order[] orders = {
                new order(1, "Order 1", "Description 1", 5, 100),
                new order(2, "Order 2", "Description 2", 3, 475),
                new order(3, "Order 3", "Description 3", 8, 200),
                new order(1, "Order 4", "Description 4", 5, 300),
                new order(2, "Order 5", "Description 5", 3, 275),
                new order(3, "Order 6", "Description 6", 8, 210),
                new order(1, "Order 7", "Description 7", 5, 120),
                new order(2, "Order 8", "Description 8", 3, 750),
                new order(3, "Order 9", "Description 9", 8, 280),
                new order(1, "Order 10", "Description 10", 5, 190),
                new order(2, "Order 11", "Description 11", 3, 705),
                new order(3, "Order 12", "Description 12", 8, 300),
                new order(1, "Order 13", "Description 13", 5, 600),
                new order(2, "Order 14", "Description 14", 3, 575),
                new order(3, "Order 15", "Description 15", 8, 400),
                new order(1, "Order 16", "Description 16", 5, 100),
                new order(2, "Order 17", "Description 17", 3, 75),
                new order(3, "Order 18", "Description 18", 8, 200),
                new order(1, "Order 19", "Description 19", 5, 100),
                new order(2, "Order 20", "Description 20", 3, 75),
                new order(3, "Order 21", "Description 21", 8, 200)
        };


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter customer phone: ");
        String customerPhone = scanner.nextLine();

        System.out.print("Enter customer email: ");
        String customerEmail = scanner.nextLine();

        System.out.print("Enter check-in date: ");
        String checkinDate = scanner.nextLine();

        System.out.print("Enter check-out date: ");
        String checkoutDate = scanner.nextLine();

        User u = new User(customerName, customerPhone, customerEmail, checkinDate, checkoutDate);


        float twocol = 285f;
        float col3 = 520f;
        float twocol150 = twocol + 150f;
        float twoColumnWidth[] = {twocol, twocol150};
        Color slateblue = new DeviceRgb(11, 80, 79);


        Table table = new Table(twoColumnWidth);
        table.addCell(new Cell().add("Ghuddy").setBorder(Border.NO_BORDER).setBold().setFontSize(20f).setFontColor(slateblue));
        table.addCell(new Cell().add("Reservation" + " " + "Confirmation").setBorder(Border.NO_BORDER).setFontSize(20f).setPaddingLeft(100f));

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
        Paragraph p1 = new Paragraph("Customer Name : "+ customerName).setPaddingBottom(20f).setFontSize(10f);
        Paragraph p2 = new Paragraph("Phone : "+ customerPhone).setPaddingBottom(20f).setFontSize(10f);
        Paragraph p3 = new Paragraph("Email : "+ customerEmail).setPaddingBottom(20f).setFontSize(10f);
        Paragraph p4 = new Paragraph("Checkin Date : "+ checkinDate).setPaddingBottom(20f).setFontSize(10f);
        Paragraph p5 = new Paragraph("Checkout Date : "+ checkoutDate).setPaddingBottom(20f).setFontSize(10f);

        Paragraph order = new Paragraph("ORDER DETAILS :").setFontSize(15f);
        Table orderDetails = new Table(new float[]{
                col3 / 5, col3 / 4, col3 / 3, col3 / 3, col3 / 3
        });
        orderDetails.addCell(new Cell().add("No.").setBold());
        orderDetails.addCell(new Cell().add("Title ").setBold());
        orderDetails.addCell(new Cell().add("Description ").setBold());
        orderDetails.addCell(new Cell().add("Quantity ").setBold());
        orderDetails.addCell(new Cell().add("Total Price ").setBold());

        for (order o1 : orders) {
            orderDetails.addCell(new Cell().add(String.valueOf(o1.getOrderNo())));
            orderDetails.addCell(new Cell().add(o1.getOrderTitle()));
            orderDetails.addCell(new Cell().add(o1.getOrderDescription()));
            orderDetails.addCell(new Cell().add(String.valueOf(o1.getOrderQuantity())));
            orderDetails.addCell(new Cell().add(String.valueOf(o1.getTotalPrice())));
        }





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

        /**/


        document.close();


    }
    private static class MyEventHandler implements IEventHandler {
        private Document document;

        public MyEventHandler(Document document) {
            this.document = document;
        }

        @Override
        public void handleEvent(Event event) {
            PdfDocumentEvent docEvent = (PdfDocumentEvent) event;
            PdfPage page = docEvent.getPage();
            float x = page.getPageSize().getLeft() + 20;
            float y = page.getPageSize().getBottom() + 20;


            Table footerTable = new Table(1);
            footerTable.setWidth(page.getPageSize().getWidth() - 40);

            LineSeparator line = new LineSeparator(new SolidLine(1f));
            // Add footer content
            footerTable.addCell(new Cell().add("Ghuddy").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setFontSize(15f));
            footerTable.addCell(new Cell().add(line).setBorder(Border.NO_BORDER));
            footerTable.addCell(new Cell().add("RAHMAN VILLA - KA-18, BARIDHARA, NORTH ROAD - DHAKA - 1212, BANGLADESH").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER));
            footerTable.addCell(new Cell().add("© All Rights Reserved. Ghuddy, 2024").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER));

            // Position the footer at the bottom of the page
            footerTable.setFixedPosition(x, y, page.getPageSize().getWidth() - 40);


            // Draw the footer on the page
            document.add(footerTable);
        }
    }
}

