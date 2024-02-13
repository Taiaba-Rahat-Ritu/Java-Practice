
package org.example;

import com.itextpdf.kernel.events.Event;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class generatePDF2 {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {


        String path = "invoice2.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);

        MyEventHandler eventHandler = new MyEventHandler(document);
        pdfDocument.addEventHandler(PdfDocumentEvent.END_PAGE, eventHandler);



        // Body content
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
        float col3 = 520f;

        // Adding content to the document

        document.add(Header.createHeaderTable());

        document.add(Header.createHeader2(u));

        /*document.add(Body.createFooterParagraph());*/
        document.add(Body.createOrderDetailsTable(orders, col3));
        document.add(Footer.createHRTable(new float[]{col3}));
        /*document.add(Footer.createFooterTable());*/

        document.close();
    }

    // Custom event handler class for the footer
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

            Table footerTable = Footer.createFooterTable();
            footerTable.setWidth(page.getPageSize().getWidth() - 40);
            footerTable.setFixedPosition(x, y, page.getPageSize().getWidth() - 40);

            document.add(footerTable);
        }
    }
}