package org.example;

import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;

public class GhuddyTnC {

    static Paragraph createTableTnCHeading() {
        Paragraph ghuddyTnCHeading = new Paragraph("Ghuddy Terms and Condition").setBold().setFontSize(13f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER);

        return ghuddyTnCHeading;
    }


    static Table createGhuddyTnCTable(){

        Table ghuddyTnCTable = new Table(1);

        String h1 = "General Disclaimer :";
        String p1 = " Ghuddy does not own any travel service providers or possess any travel-related merchandise. We are a link between consumers & suppliers. Ghuddy is not accountable if anything goes wrong during booking or in trip period or in purchased product. Please go through the terms & conditions provided by the travel providers or suppliers.";
        String h2 = "User Account :";
        String p2 = "To access our services , you need to create an account. Please use accurate & up-to-date information and update if changed. You are solely liable for the actions taken from your account. Pleasecontact our customer care team for any unauthorised use. Ghuddy holds the right to suspend or terminate your account if any wrong is found.";
        String h3 = "Age Requirements & policies :";
        String p3 = " Ghuddy has specific age requirements for travelers, classifying individuals under 15 as minors who must always be accompanied by an adult. Each adult can accompany up to two minors, subject to tour descriptions or Ghuddy's communication. If legal consent is required for a minor to travel, it's the adult's responsibility to obtain necessary consents and comply with travel laws. Ghuddy is not responsible for any related fees, damages, or losses. Adults in a booking with minors are jointly responsible for their well-being and behavior, accepting these terms on behalf of the minors. Ghuddy does not offer childcare services and disclaims responsibility for supervising minors.";
        String h4 = "Intellectual Property :";
        String p4 = "Whether registered or unregistered, all trademarks, logos, images, and servicemarks, as well as these terms as they appear on the Platforms or in our marketing materials, are the exclusive property of Ghuddy and/or other parties who have permitted us to use their works (collectively the \"Trademarks\"). Without our prior express written approval, you are not permitted to use, copy,reproduce, republish, upload, post, transmit, distribute, or alter our Trademarks in any way.";
        String h5 = "Booking Terms :";
        String p5 = "When you book a travel using ghuddy's website, you are booking with the travel provider listed on the booking page, and our website solely serves as a user interface. However, Ghuddy is not liable if the providers defers from their commitment and sudden changes to their service without prior notice. You can resolve any issue regarding your booking or travel product with the provider through Ghuddy's customer support. ** All prices and special offers are subject to availability. All taxes and fees are included in the price.";
        String h6 = "Promotion Terms :";
        String p6 = "From time to time, Ghuddy generates promotion codes/discounts that can be used on the site. Ghuddy retains the right, without prior notice, to add, alter, modify, or withdraw all or any of the Terms and Conditions, or to replace, fully or in part, the program with any other program, whether similar to or not, or to withdraw it entirely. When you register with Ghuddy.com, you agree that we or any of our partners may contact you from time to time with promotional offers/information that may be of your interest";
        String h7 = "Payment Terms :";
        String p7 = "When making a payment using our website, you agree to use your personal information for transaction verification & ensuring no one uses your credentials without your permission. You agree that information you provided may be shared with payment gateway companies solely for the purpose of verifying & confirming your identification. Ghuddy may temporarily limit or stop the use of its payment service while upgrading, enhancing, modifying, improving or when under maintenance. Links to thirdparty services may be found in Ghuddy payments. Please go through their terms & conditions as Ghuddy payment is not liable for any Third-party services.";
        String h8 = "Bill Calculation :";
        String p8 = "Ghuddy calculates the bill based on various factors such as discounts, time frame, special promotions, promotional offers, day, month, year, season-wise offers, etc., from time to time. If you use Ghuddy services, you are hereby agreeing to these bill calculation changes, and in order to confirm and avail of Ghuddy services, you agree to pay the amount that will be calculated based on these factors. Discounts are subject to change. Discounts appear on the website may differ from time to time depending on time, days, locations, properties, availability etc. & can be based on Ghuddy's promotional campaigns or offers.";
        String h9 = "Cancellation & Refund :";
        String p9 = "Ghuddy's cancellation policy follows a 72-hour rule, where the customer can initiate a cancellation request on their booking if the booking allows cancellation. However, some bookings may not be subject to cancellation as per promotional or campaign requirements, and users are advised to check thoroughly before making the booking for cancellation availability on the selected booking property. Ghuddy's refund policy states that if a successful refund request is initiated, Ghuddy will carry out the refund process, which, in general, will take about 72 hours from the refund request initiation and may take up to 7 days or more based on the refund (amount, bank request initialization, technical distributions, etc.). Before submitting a request for a refund, the guest must notify Ghuddy customer Support. We may reduce the amount of any refund based on the conditions that were given to consumers at the time of booking. Submitting a fraudulent report violates our Terms of Service and may result in account termination with all account rewards programs or points, and this can be subject to zero refund as well. Any changes to this Policy will be made following our Terms of Service. In case of a national emergency, lockdown, political unrest, natural disaster, etc., a standard refund policy may not be applicable. Rest assured, Ghuddy will always ensure its consumers' satisfaction.";


        Text boldText1 = new Text(h1).setBold();
        Text normalText1 = new Text(p1);
        Text boldText2 = new Text(h2).setBold();
        Text normalText2 = new Text(p2);
        Text boldText3 = new Text(h3).setBold();
        Text normalText3 = new Text(p3);
        Text boldText4 = new Text(h4).setBold();
        Text normalText4 = new Text(p4);
        Text boldText5 = new Text(h5).setBold();
        Text normalText5 = new Text(p5);
        Text boldText6 = new Text(h6).setBold();
        Text normalText6 = new Text(p6);
        Text boldText7 = new Text(h7).setBold();
        Text normalText7 = new Text(p7);
        Text boldText8 = new Text(h8).setBold();
        Text normalText8 = new Text(p8);
        Text boldText9 = new Text(h9).setBold();
        Text normalText9 = new Text(p9);


        Paragraph para1 = new Paragraph().add(boldText1).add(normalText1);
        Paragraph para2 = new Paragraph().add(boldText2).add(normalText2);
        Paragraph para3 = new Paragraph().add(boldText3).add(normalText3);
        Paragraph para4 = new Paragraph().add(boldText4).add(normalText4);
        Paragraph para5 = new Paragraph().add(boldText5).add(normalText5);
        Paragraph para6 = new Paragraph().add(boldText6).add(normalText6);
        Paragraph para7= new Paragraph().add(boldText7).add(normalText7);
        Paragraph para8 = new Paragraph().add(boldText8).add(normalText8);
        Paragraph para9 = new Paragraph().add(boldText9).add(normalText9);




        Cell cell1 = new Cell().add(para1).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell2 = new Cell().add(para2).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell3 = new Cell().add(para3).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell4 = new Cell().add(para4).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell5 = new Cell().add(para5).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell6 = new Cell().add(para6).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell7 = new Cell().add(para7).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell8 = new Cell().add(para8).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell9 = new Cell().add(para9).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);

        ghuddyTnCTable.addCell(cell1);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell2);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell3);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell4);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell5);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell6);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell7);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell8);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell9);


        return ghuddyTnCTable;

    }
}
