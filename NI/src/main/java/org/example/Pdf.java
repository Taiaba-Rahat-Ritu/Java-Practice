package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
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
import java.util.LinkedList;
import java.util.List;

public class Pdf {


    public static void main(String [] args) throws FileNotFoundException, MalformedURLException {
        String path = "invoice.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);
        Color textColor1 = new DeviceRgb(54, 101, 117);
        Paragraph hr = new Paragraph();
        float col2 = 520f;


        Header initiateLogoAndTitle = new Header();
        document.add(initiateLogoAndTitle.initiateLogoAndTitle(285f, 480f, 25f, 25f, textColor1,
                "D:\\Office work\\images\\ghuddy-icon.png"));

        Header initiateCompanyContact = new Header();
        document.add( initiateCompanyContact.initiateCompanyContact(col2, 10f, 10f, "D:\\work practice\\images\\phone_icon.png",
                "D:\\work practice\\images\\mail_icon.png", "D:\\work practice\\images\\web_icon.png"
        ).setMarginLeft(60f));
        Header createHr = new Header();
        document.add(createHr.createHr(textColor1));
        Header createHeaderTable2 = new Header();
        document.add(createHeaderTable2.createHeaderTable2(col2, textColor1).setMarginLeft(27f));
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
        Accommodation accommodationHeading = new Accommodation();
        document.add(accommodationHeading.accommodation(textColor1).setMarginLeft(27f));


        Accommodation ac = new Accommodation();
        LinkedList<Hotel> hotels = new LinkedList<>();

        hotels.add(new Hotel(1, "Hotel 1", "6001", "abc"));
        hotels.add(new Hotel(2, "Hotel 2", "1021", "abc"));
        hotels.add(new Hotel(3, "Hotel 3", "2021", "abc"));
        hotels.add(new Hotel(4, "Hotel 4", "2021", "abc"));

        Table accommodationTable = ac.accommodationTable(col2,hotels).setMarginLeft(27f);
        document.add(accommodationTable);


                // Create food heading
        Food createFoodHeading = new Food();
        document.add(createFoodHeading.createFoodHeading("FOOD", textColor1).setMarginTop(20f).setMarginLeft(27f));


        // Create food data
        List<String[]> foodData = new LinkedList<>();
        foodData.add(new String[]{"Included", "Included", "Included"});
        foodData.add(new String[]{"Included", "Included", "Included"});
        foodData.add(new String[]{"Included", "Included", "Included"});
        foodData.add(new String[]{"Included", "Included", "Included"});
        foodData.add(new String[]{"Included", "Included", "Included"});
        foodData.add(new String[]{"Included", "Included", "Included"});
        foodData.add(new String[]{"Included", "Included", "Included"});
        foodData.add(new String[]{"Included", "Included", "Included"});
        foodData.add(new String[]{"Included", "Included", "Included"});
        foodData.add(new String[]{"Included", "Included", "Included"});

        // Define column widths
        float[] columnWidths = {col2/3, col2/3, col2/3}; // Adjust column widths as needed

        // Create food table
        Table foodTable = createFoodHeading.createFoodTable(foodData, columnWidths).setMarginLeft(27f);
        document.add(foodTable);



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
