package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.events.Event;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class Pdf {

    public static void main(String [] args) throws FileNotFoundException, MalformedURLException {
        String path = "invoice.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);




        document.add(Header.createHeaderTable());
        document.add(Header.createCompanyContact().setMarginLeft(20f));
        document.add(Header.createHr());
        document.add(Header.createHeaderTable2().setMarginLeft(27f));
        document.add(ProductDescription.createHr());
        document.add(ProductDescription.ProductDescription());
        document.add(ProductDescription.createHr());
        document.add(ProductDescription.productDescription(new TourVariable()).setMarginLeft(27f));
        document.add(PackageInformation.createHr());
        document.add(PackageInformation.PackageInfo());
        document.add(PackageInformation.createHr());
        document.add(PackageInformation.packageInformation(new PackageVariable()).setMarginLeft(27f));
        document.add(PurchasedAmenities.createHr());
        document.add(PurchasedAmenities.PurchasedAmenities());
        document.add(PurchasedAmenities.createHr());
        document.add(Accommodation.accommodation().setMarginTop(10f).setMarginLeft(27f));
        document.add(Accommodation.accommodationTable().setMarginLeft(27f).setMarginRight(20f).setFontSize(10f));
        document.add(Food.Food().setMarginLeft(27f).setMarginTop(20f));
        document.add(Food.foodTable().setMarginLeft(27f).setFontSize(10f));
        document.add(Transfer.Transfer().setMarginTop(25f).setMarginLeft(27f));
        document.add(Transfer.transferTable().setMarginLeft(27f).setMarginBottom(10f).setFontSize(10f));
        document.add(Transportation.Transportation().setMarginTop(10f).setMarginLeft(27f));
        document.add(Transportation.transportationTable().setMarginLeft(27f).setMarginBottom(20f).setFontSize(10f));
        document.add(PaidSpots.PaidSpots().setMarginLeft(27f));
        document.add(PaidSpots.paidSpotTable().setMarginLeft(27f).setFontSize(10f));
        document.add(Guide.Guide().setMarginLeft(27f).setMarginTop(20f));
        document.add(Guide.guideTable(new GuideVariable()).setMarginLeft(27f));
        document.add(GhuddyTnC.createTableTnCHeading().setMarginTop(20f).setMarginLeft(27f));
        document.add(GhuddyTnC.createGhuddyTnCTable().setMarginLeft(27f).setMarginRight(10f).setFontSize(10f));
        document.add(new Paragraph(" "));
        document.add(new Paragraph(" "));
        MyEventHandler eventHandler = new MyEventHandler(document);
        pdfDocument.addEventHandler(PdfDocumentEvent.END_PAGE, eventHandler);

        document.close();
    };



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


                document.add(footerTable).setTopMargin(20f);


            }

    }

}
