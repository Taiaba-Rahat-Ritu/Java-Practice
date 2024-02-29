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
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
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
        float col2 = 520f;



        //Header
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
        //Header complete

        //Product Description

        document.add(createHr.createHr(textColor1));

        ProductDescription initiateProductDescription = new ProductDescription();
        document.add(initiateProductDescription.initiateProductDescription(textColor1));

        document.add(createHr.createHr(textColor1));

        ProductDescription initiateProductDescriptionTable = new ProductDescription();
        TourVariable tourVariable = new TourVariable();
        document.add(initiateProductDescriptionTable.InitiateProductDescriptionTable(tourVariable).setMarginLeft(27f));
        //Product Description Complete

        //Package Information
        document.add(createHr.createHr(textColor1));

        PackageInformation initiatePackageInfoHeading = new PackageInformation();
        document.add(initiatePackageInfoHeading.initiatePackageInfoHeading(textColor1));

        document.add(createHr.createHr(textColor1));

        PackageInformation initiatePackageInformationTable = new PackageInformation();
        PackageVariable packageVariable = new PackageVariable();
        document.add(initiatePackageInformationTable.initiatePackageInformationTable(packageVariable).setMarginLeft(27f));
        //Package Information Complete


        //Purchased Amenities
        document.add(createHr.createHr(textColor1));

        PurchasedAmenities initiatePurchasedAmenitiesHeading = new PurchasedAmenities();
        document.add(initiatePurchasedAmenitiesHeading.initiatePurchasedAmenitiesHeading(textColor1));

        document.add(createHr.createHr(textColor1));
        //Purchased Amenities Complete


        //Accommodation
        Accommodation accommodationHeading = new Accommodation();
        document.add(accommodationHeading.accommodation(textColor1).setMarginLeft(27f));


        Accommodation ac = new Accommodation();
        List<Hotel> hotels = new LinkedList<>();

        hotels.add(new Hotel(1, "Hotel 1", "6001", "abc"));
        hotels.add(new Hotel(2, "Hotel 2", "1021", "abc"));
        hotels.add(new Hotel(3, "Hotel 3", "2021", "abc"));
        hotels.add(new Hotel(4, "Hotel 4", "2021", "abc"));

        Table initiateAccommodationTable = ac.initiateAccommodationTable(col2,hotels).setMarginLeft(27f);
        document.add(initiateAccommodationTable);
        //Accommodation complete



        //Food
                // Create food heading
        Food createFoodHeading = new Food();
        document.add(createFoodHeading.createFoodHeading("FOOD", textColor1).setMarginTop(20f).setMarginLeft(27f));


        // Create food data
        List<String[]> foodData = new LinkedList<>();
        foodData.add(new String[]{"Included", "Included", "Included"});
        foodData.add(new String[]{"Included", "Included", "Included"});
        /*foodData.add(new String[]{"Included", "Included", "Included"});*/

        // Define column widths
        float[] columnWidths = {col2/3, col2/3, col2/3}; // Adjust column widths as needed

        // Create food table
        Table foodTable = createFoodHeading.createFoodTable(foodData, columnWidths).setMarginLeft(27f);
        document.add(foodTable);
        //Food Complete

        //Transfer
        Transfer initiateTransferHeading = new Transfer();
        document.add(initiateTransferHeading.initiateTransferHeading(textColor1).setMarginLeft(27f));


        Transfer transfer1 = new Transfer();
        LinkedList<transferVariable> transfers = new LinkedList<>();

        transfers.add(new transferVariable(1, "route 1", "abc"));
        transfers.add(new transferVariable(2, "route 2", "abc"));
        /*transfers.add(new transferVariable(3, "route 3", "abc"));*/

        Table initiateTransferTable = transfer1.initiateTransferTable(col2, transfers).setMarginLeft(27f).setMarginTop(15f);
        document.add(initiateTransferTable);
        //Transfer Complete


        //Transportation
        Transportation initiateTransportationHeading = new Transportation();
        document.add(initiateTransportationHeading.initiateTransportationHeading(textColor1).setMarginLeft(27f));


        Transportation transportation1 = new Transportation();
        LinkedList<Transport> transports = new LinkedList<>();

        transports.add(new Transport(1, "route 1", "abc"));
        transports.add(new Transport(2, "route 2", "abc"));
        transports.add(new Transport(3, "route 3", "abc"));

        Table initiateTransportationTable = transportation1.initiateTransportationTable(col2, transports).setMarginLeft(27f).setMarginTop(15f);
        document.add(initiateTransportationTable);
        //Transportation Complete

        //Paid Spots
        PaidSpots initiatePaidSpotsHeading = new PaidSpots();
        document.add(initiatePaidSpotsHeading.initiatePaidSpotsHeading(textColor1).setMarginLeft(27f));


        PaidSpots paidSpots1 = new PaidSpots();
        LinkedList<PaidSpotVariable> paidSpots = new LinkedList<>();

        paidSpots.add(new PaidSpotVariable(1, "Spot 1", "Yes"));
        paidSpots.add(new PaidSpotVariable(2, "Spot 2", "Yes"));
        paidSpots.add(new PaidSpotVariable(3, "Spot 3", "No"));

        Table initiatePaidSpotTable = paidSpots1.initiatePaidSpotTable(col2, paidSpots).setMarginLeft(27f).setMarginTop(15f);
        document.add(initiatePaidSpotTable);
        //Paid Spots Complete

        //Guide
        Guide initiateGuideHeading = new Guide();
        document.add(initiateGuideHeading.initiateGuideHeading(textColor1).setMarginLeft(27f));

        Guide initiateGuideTable = new Guide();
        GuideVariable guideVariable = new GuideVariable("Yes");
        document.add(initiateGuideTable.initiateGuideTable(guideVariable).setMarginLeft(27f));
        //Guide Complete


        document.add(GhuddyTnC.createTableTnCHeading().setMarginTop(20f).setMarginLeft(27f));
        document.add(GhuddyTnC.createGhuddyTnCTable().setMarginLeft(27f).setMarginRight(10f).setFontSize(10f));
        document.add(new Paragraph(" "));
        document.add(new Paragraph(" "));
        document.add(new Paragraph(" "));
        document.add(new Paragraph(" "));
        MyEventHandler eventHandler = new MyEventHandler(document);
        pdfDocument.addEventHandler(PdfDocumentEvent.END_PAGE, eventHandler);

        document.close();
    }



        private static class MyEventHandler implements IEventHandler {

            Color textColor1 = new DeviceRgb(54, 101, 117);
            private Document document;

            public MyEventHandler(Document document) {
                this.document = document;
            }

            @Override
            public void handleEvent(Event event) {
                PdfDocumentEvent docEvent = (PdfDocumentEvent) event;
                PdfPage page = docEvent.getPage();

                Footer footer = new Footer();
                float footerWidth = page.getPageSize().getWidth() - 40;
                float footerX = page.getPageSize().getLeft() + 20;
                float footerY = page.getPageSize().getBottom() + 20;


                Table footerTable = footer.createFooterTable(textColor1, new FooterVariable("Ghuddy", "--------------------------------------------------------------------------------------------------------------------------", "RAHMAN VILLA - KA-18, BARIDHARA, NORTH ROAD - DHAKA - 1212, BANGLADESH", "© All Rights Reserved. Ghuddy, 2024" ), footerWidth, footerX, footerY);
                document.add(footerTable);





            }

    }

}
