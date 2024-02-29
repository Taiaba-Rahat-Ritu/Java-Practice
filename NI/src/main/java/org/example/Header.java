package org.example;


import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;


import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.*;


import java.net.MalformedURLException;


public class Header {


    public Table initiateLogoAndTitle(float col1, float col2, float ghuddyLogoImageWidth, float ghuddyLogoImageHeight, Color textColor1, String ghuddyLogoImagePath) throws MalformedURLException {
        float[] twoColumns = {col1, col2};


        Table headerTable = new Table(twoColumns);

        ImageData imageData = ImageDataFactory.create(ghuddyLogoImagePath);
        Image ghuddyLogo = new Image(imageData);


        ghuddyLogo.setWidth(ghuddyLogoImageWidth);
        ghuddyLogo.setHeight(ghuddyLogoImageHeight);


        headerTable.addCell(new Cell().add(ghuddyLogo).setBorder(Border.NO_BORDER).setPaddingLeft(25f));
        headerTable.addCell(new Cell().add("Ghuddy Limited").setBorder(Border.NO_BORDER).setFontSize(20f).setPaddingRight(20f).setBold().setFontColor(textColor1).setPaddingBottom(10f));


        return headerTable;
    }


    public Table initiateCompanyContact(float col2, float iconImageWidth, float iconImageHeight, String phoneIconUrl, String emailIconUrl, String websiteIconUrl) throws MalformedURLException {
        float[] threeColumn = {col2 / 3, col2 / 3, col2 / 3};


        Table companyContact = new Table(threeColumn);

        //icon for phone

        ImageData phoneImageData = ImageDataFactory.create(phoneIconUrl);
        Image phoneIconImage = new Image(phoneImageData);


        //icon for email
        ImageData emailImageData = ImageDataFactory.create(emailIconUrl);
        Image emailIconImage = new Image(emailImageData);


        //icon for website
        ImageData websiteImageData = ImageDataFactory.create(websiteIconUrl);
        Image websiteIconImage = new Image(websiteImageData);



        phoneIconImage.setWidth(iconImageWidth);
        phoneIconImage.setHeight(iconImageHeight);


        emailIconImage.setWidth(iconImageWidth);
        emailIconImage.setHeight(iconImageHeight);


        websiteIconImage.setWidth(iconImageWidth);
        websiteIconImage.setHeight(iconImageHeight);




        /*cell1.setPaddingTop(7f);*/


        Cell cell1 = new Cell();
        cell1.setBorder(Border.NO_BORDER);

        /*cell2.setPaddingTop(7f);*/


        Paragraph paragraph1 = new Paragraph();
        paragraph1.add(phoneIconImage);
        paragraph1.add(new Text("  +01234 567 89").setFontSize(12f));
        cell1.add(paragraph1);
        /*cell1.setPaddingRight(20f);*/
        /*cell2.setPaddingRight(10f);*/


        Cell cell2 = new Cell();
        cell2.setBorder(Border.NO_BORDER);
        /*cell2.setPaddingTop(7f);*/


        Paragraph paragraph2 = new Paragraph();
        paragraph2.add(emailIconImage);
        paragraph2.add(new Text("  support@ghuddy.com").setFontSize(12f));
        cell2.add(paragraph2);


        Cell cell3 = new Cell();
        cell3.setBorder(Border.NO_BORDER);



        Paragraph paragraph3 = new Paragraph();
        paragraph3.add(websiteIconImage);
        paragraph3.add(new Text("  ghuddy.com").setFontSize(12f));
        cell3.add(paragraph3);

        companyContact.addCell(cell1);
        companyContact.addCell(cell2);
        companyContact.addCell(cell3);




        return companyContact;
    }

    private Cell setPhoneIconImageAndText(String phoneIconUrl, float iconImageWidth,float iconImageHeight) throws MalformedURLException {
        //icon for phone
        ImageData phoneImageData = ImageDataFactory.create(phoneIconUrl);
        Image phoneIconImage = new Image(phoneImageData);

        phoneIconImage.setWidth(iconImageWidth);
        phoneIconImage.setHeight(iconImageHeight);

        Cell phoneNumberCell = new Cell();
        phoneNumberCell.setBorder(Border.NO_BORDER);


        Paragraph phoneNumberParagraph = new Paragraph();
        phoneNumberParagraph.add(phoneIconImage);
        phoneNumberParagraph.add(new Text("  +0123 4567 89 ").setFontSize(12f));
        phoneNumberCell.add(phoneNumberParagraph);
        phoneNumberCell.setPaddingLeft(50f);

        return phoneNumberCell;
    }


    private Cell setEmailIconImageAndText(String emailIconUrl, float iconImageWidth,float iconImageHeight) throws MalformedURLException {
        //icon for email
        ImageData emailImageData = ImageDataFactory.create(emailIconUrl);
        Image emailIconImage = new Image(emailImageData);


        emailImageData.setWidth(iconImageWidth);
        emailIconImage.setHeight(iconImageHeight);


        Cell emailCell = new Cell();
        emailCell.setBorder(Border.NO_BORDER);


        Paragraph emailParagraph = new Paragraph();
        emailParagraph.add(emailIconImage);
        emailParagraph.add(new Text("  +0123 4567 89 ").setFontSize(12f));
        emailCell.add(emailParagraph);
        emailCell.setPaddingLeft(50f);


        return emailCell;
    }

    private Cell setWebsiteIconImageAndText(String websiteIconUrl, float iconImageWidth,float iconImageHeight) throws MalformedURLException {
        //icon for phone
        ImageData websiteImageData = ImageDataFactory.create(websiteIconUrl);
        Image websiteIconImage = new Image(websiteImageData);

        websiteIconImage.setWidth(iconImageWidth);
        websiteIconImage.setHeight(iconImageHeight);

        Cell websiteCell = new Cell();
        websiteCell.setBorder(Border.NO_BORDER);


        Paragraph websiteParagraph = new Paragraph();
        websiteParagraph.add(websiteIconImage);
        websiteParagraph.add(new Text("  +0123 4567 89 ").setFontSize(12f));
        websiteCell.add(websiteParagraph);
        websiteCell.setPaddingLeft(50f);

        return websiteCell;
    }



    public Paragraph createHr(Color textColor1) {
        Paragraph hr = new Paragraph();
        hr.add("--------------------------------------------------------------------------------------------------------------------").setBold().setFontColor(textColor1).setMarginLeft(28f);
        return hr;
    }




    public Table createHeaderTable2(float col2, Color textColor1) {
        float[] twoCol = {col2 / 2, col2 / 2};

        Table nestedTable = new Table(twoCol);

        nestedTable.addCell(new Cell().add("PAID BY").setBold().setFontColor(textColor1).setBorder(Border.NO_BORDER).setPaddingTop(10f).setFontSize(10f));
        nestedTable.addCell(new Cell().add("RESERVATION CONFIRMATION").setBold().setFontColor(textColor1).setBorder(Border.NO_BORDER).setPaddingTop(10f).setFontSize(10f).setPaddingLeft(70f));
        nestedTable.addCell(new Cell().add("John Doe ").setBorder(Border.NO_BORDER).setFontSize(10f));
        nestedTable.addCell(new Cell().add("Booked Date :").setBorder(Border.NO_BORDER).setFontSize(10f).setPaddingLeft(70f));
        nestedTable.addCell(new Cell().add("john@gmail.com ").setBorder(Border.NO_BORDER).setFontSize(10f));
        nestedTable.addCell(new Cell().add("Invoice Date : ").setBorder(Border.NO_BORDER).setFontSize(10f).setPaddingLeft(70f));
        nestedTable.addCell(new Cell().add("+0123 4567 89").setBorder(Border.NO_BORDER).setFontSize(10f));
        nestedTable.addCell(new Cell().add("Sales Order Code: ").setBorder(Border.NO_BORDER).setFontSize(10f).setPaddingLeft(70f));


        return nestedTable;
    }




}

