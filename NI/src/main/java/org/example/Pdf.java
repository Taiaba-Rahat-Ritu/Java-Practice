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

//main classs
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
                "/Users/Ritu/Downloads/Java-Practice-main/images/ghuddy-icon.png"));

        Header initiateCompanyContact = new Header();
        document.add( initiateCompanyContact.initiateCompanyContact(col2, 10f, 10f, "/Users/Ritu/Downloads/Java-Practice-main/images/phone_icon.png",
                "/Users/Ritu/Downloads/Java-Practice-main/images/mail_icon.png", "/Users/Ritu/Downloads/Java-Practice-main/images/globe_icon.png"
        ).setMarginLeft(60f));//
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
        document.add(initiateProductDescriptionTable.InitiateProductDescriptionTable(new TourVariable("Saint Martin Tour", "A paradise waiting to be explored", "2nd March, 2024", "2 Days 3 Nights")).setMarginLeft(27f));
        //Product Description Completed

        //Package Information
        document.add(createHr.createHr(textColor1));

        PackageInformation initiatePackageInfoHeading = new PackageInformation();
        document.add(initiatePackageInfoHeading.initiatePackageInfoHeading(textColor1));

        document.add(createHr.createHr(textColor1));

        PackageInformation initiatePackageInformationTable = new PackageInformation();
        document.add(initiatePackageInformationTable.initiatePackageInformationTable(new PackageVariable("Cox's Bazar", 2, 2, 5, "Dhaka", "10:00AM")).setMarginLeft(27f));
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


        //Ghuddy Terms and Conditions
        GhuddyTnC  initiateGhuddyTnCHeading = new GhuddyTnC();
        document.add(initiateGhuddyTnCHeading.initiateGhuddyTnCHeading(textColor1));

        GhuddyTnC initiateGhuddyTnCTable = new GhuddyTnC();
        document.add(initiateGhuddyTnCTable.initiateGhuddyTnCTable(new GhuddyTnCVariable("General Disclaimer :"," Ghuddy does not own any travel service providers or possess any travel-related merchandise. We are a link between consumers & suppliers. Ghuddy is not accountable if anything goes wrong during booking or in trip period or in purchased product. Please go through the terms & conditions provided by the travel providers or suppliers.", "User Account :", "To access our services , you need to create an account. Please use accurate & up-to-date information and update if changed. You are solely liable for the actions taken from your account. Pleasecontact our customer care team for any unauthorised use. Ghuddy holds the right to suspend or terminate your account if any wrong is found.","Age Requirements & policies :", " Ghuddy has specific age requirements for travelers, classifying individuals under 15 as minors who must always be accompanied by an adult. Each adult can accompany up to two minors, subject to tour descriptions or Ghuddy's communication. If legal consent is required for a minor to travel, it's the adult's responsibility to obtain necessary consents and comply with travel laws. Ghuddy is not responsible for any related fees, damages, or losses. Adults in a booking with minors are jointly responsible for their well-being and behavior, accepting these terms on behalf of the minors. Ghuddy does not offer childcare services and disclaims responsibility for supervising minors.", "Intellectual Property :","Whether registered or unregistered, all trademarks, logos, images, and servicemarks, as well as these terms as they appear on the Platforms or in our marketing materials, are the exclusive property of Ghuddy and/or other parties who have permitted us to use their works (collectively the \"Trademarks\"). Without our prior express written approval, you are not permitted to use, copy,reproduce, republish, upload, post, transmit, distribute, or alter our Trademarks in any way.", "Booking Terms :", "When you book a travel using ghuddy's website, you are booking with the travel provider listed on the booking page, and our website solely serves as a user interface. However, Ghuddy is not liable if the providers defers from their commitment and sudden changes to their service without prior notice. You can resolve any issue regarding your booking or travel product with the provider through Ghuddy's customer support. ** All prices and special offers are subject to availability. All taxes and fees are included in the price.", "Promotion Terms :", "From time to time, Ghuddy generates promotion codes/discounts that can be used on the site. Ghuddy retains the right, without prior notice, to add, alter, modify, or withdraw all or any of the Terms and Conditions, or to replace, fully or in part, the program with any other program, whether similar to or not, or to withdraw it entirely. When you register with Ghuddy.com, you agree that we or any of our partners may contact you from time to time with promotional offers/information that may be of your interest", "Payment Terms :", "When making a payment using our website, you agree to use your personal information for transaction verification & ensuring no one uses your credentials without your permission. You agree that information you provided may be shared with payment gateway companies solely for the purpose of verifying & confirming your identification. Ghuddy may temporarily limit or stop the use of its payment service while upgrading, enhancing, modifying, improving or when under maintenance. Links to thirdparty services may be found in Ghuddy payments. Please go through their terms & conditions as Ghuddy payment is not liable for any Third-party services.", "Bill Calculation :", "Ghuddy calculates the bill based on various factors such as discounts, time frame, special promotions, promotional offers, day, month, year, season-wise offers, etc., from time to time. If you use Ghuddy services, you are hereby agreeing to these bill calculation changes, and in order to confirm and avail of Ghuddy services, you agree to pay the amount that will be calculated based on these factors. Discounts are subject to change. Discounts appear on the website may differ from time to time depending on time, days, locations, properties, availability etc. & can be based on Ghuddy's promotional campaigns or offers.","Cancellation & Refund :", "Ghuddy's cancellation policy follows a 72-hour rule, where the customer can initiate a cancellation request on their booking if the booking allows cancellation. However, some bookings may not be subject to cancellation as per promotional or campaign requirements, and users are advised to check thoroughly before making the booking for cancellation availability on the selected booking property. Ghuddy's refund policy states that if a successful refund request is initiated, Ghuddy will carry out the refund process, which, in general, will take about 72 hours from the refund request initiation and may take up to 7 days or more based on the refund (amount, bank request initialization, technical distributions, etc.). Before submitting a request for a refund, the guest must notify Ghuddy customer Support. We may reduce the amount of any refund based on the conditions that were given to consumers at the time of booking. Submitting a fraudulent report violates our Terms of Service and may result in account termination with all account rewards programs or points, and this can be subject to zero refund as well. Any changes to this Policy will be made following our Terms of Service. In case of a national emergency, lockdown, political unrest, natural disaster, etc., a standard refund policy may not be applicable. Rest assured, Ghuddy will always ensure its consumers' satisfaction." )).setMarginLeft(27f));

        //Ghuddy Terms and Conditions Complete


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


                Paragraph footerParagraph = footer.createFooterParagraph(textColor1, new FooterVariable("Ghuddy", "--------------------------------------------------------------------------------------------------------------------------", "RAHMAN VILLA - KA-18, BARIDHARA, NORTH ROAD - DHAKA - 1212, BANGLADESH", "© All Rights Reserved. Ghuddy, 2024" ), footerWidth, footerX, footerY);
                document.add(footerParagraph);


            }

    }

}
