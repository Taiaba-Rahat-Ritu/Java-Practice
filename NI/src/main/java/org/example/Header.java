package org.example;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;

import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.*;

import java.net.MalformedURLException;

public class Header {

    static Table createHeaderTable() throws MalformedURLException {
        float col1 = 285f;
        float col2 = 465f;
        float twoColumn[] = {col1, col2};
        Color darkCyan = new DeviceRgb(54, 101, 117);

        Table headerTable = new Table(twoColumn);
        String imagePath = "D:\\Office work\\images\\ghuddy-icon.png";
        ImageData imageData = ImageDataFactory.create(imagePath);
        Image logo = new Image(imageData);

        float desiredWidth = 25f; // Set your desired width
        float desiredHeight = 25f; // Set your desired height
        logo.setWidth(desiredWidth);
        logo.setHeight(desiredHeight);

        headerTable.addCell(new Cell().add(logo).setBorder(Border.NO_BORDER).setPaddingLeft(25f));
        headerTable.addCell(new Cell().add("Ghuddy Limited").setBorder(Border.NO_BORDER).setFontSize(20f).setPaddingRight(20f).setBold().setFontColor(darkCyan).setPaddingBottom(10f));

        return headerTable;

    }
    static Table createCompanyContact() throws MalformedURLException {
        float col3 = 520f;
        float threeColumn[] = {col3/3, col3/3, col3/3};


        Table companyContact = new Table(threeColumn);
        //icon 1
        String imagePath1 = "D:\\Office work\\images\\phone_icon.png";
        ImageData imageData1 = ImageDataFactory.create(imagePath1);
        Image icon1 = new Image(imageData1);

        //icon2
        String imagePath2 = "D:\\Office work\\images\\mail_icon.png";
        ImageData imageData2 = ImageDataFactory.create(imagePath2);
        Image icon2 = new Image(imageData2);

        //icon3
        String imagePath3 = "D:\\Office work\\images\\globe_icon.png";
        ImageData imageData3 = ImageDataFactory.create(imagePath3);
        Image icon3 = new Image(imageData3);


        float desiredWidth = 11f; // Set your desired width
        float desiredHeight = 11f; // Set your desired height
        icon1.setWidth(desiredWidth);
        icon1.setHeight(desiredHeight);
        icon2.setWidth(desiredWidth);
        icon2.setHeight(desiredHeight);
        icon3.setWidth(desiredWidth);
        icon3.setHeight(desiredHeight);


        Cell cell1 = new Cell();
        cell1.setBorder(Border.NO_BORDER);
        /*cell1.setPaddingTop(7f);*/

        Paragraph paragraph1 = new Paragraph();
        paragraph1.add(icon1);
        paragraph1.add(new Text("  +0123 4567 89 ").setFontSize(12f));
        cell1.add(paragraph1);
        cell1.setPaddingLeft(50f);
        /*cell1.setPaddingRight(10f);*/

        Cell cell2 = new Cell();
        cell2.setBorder(Border.NO_BORDER);
        /*cell2.setPaddingTop(7f);*/

        Paragraph paragraph2 = new Paragraph();
        paragraph2.add(icon2);
        paragraph2.add(new Text("  support@ghuddy.com").setFontSize(12f));
        cell2.add(paragraph2);
        cell2.setPaddingLeft(20f);
        /*cell2.setPaddingRight(10f);*/

        Cell cell3 = new Cell();
        cell3.setBorder(Border.NO_BORDER);
        /*cell3.setPaddingTop(7f);*/

        Paragraph paragraph3 = new Paragraph();
        paragraph3.add(icon3);
        paragraph3.add(new Text("  ghuddy.com").setFontSize(12f));
        cell3.add(paragraph3);
        /*cell3.setPaddingLeft(10f);*/
        /*cell3.setPaddingRight(10f);*/

        companyContact.addCell(cell1);
        companyContact.addCell(cell2);
        companyContact.addCell(cell3);


        return companyContact;
    }

    static Paragraph createHr(){
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Paragraph hr = new Paragraph();
        hr.add("--------------------------------------------------------------------------------------------------------------------").setBold().setFontColor(darkCyan).setMarginLeft(28f);
        return hr;
    }


    static Table createHeaderTable2(){
        float col4 = 520f;
        float twoCol[] = {col4/2, col4/2};
        Color darkCyan = new DeviceRgb(54, 101, 117);

        Table nestedTable = new Table(twoCol);

        nestedTable.addCell(new Cell().add("PAID BY").setBold().setFontColor(darkCyan).setBorder(Border.NO_BORDER).setPaddingTop(10f).setFontSize(10f));
        nestedTable.addCell(new Cell().add("RESERVATION CONFIRMATION").setBold().setFontColor(darkCyan).setBorder(Border.NO_BORDER).setPaddingTop(10f).setFontSize(10f).setPaddingLeft(70f));
        nestedTable.addCell(new Cell().add("John Doe ").setBorder(Border.NO_BORDER).setFontSize(10f));
        nestedTable.addCell(new Cell().add("Booked Date :").setBorder(Border.NO_BORDER).setFontSize(10f).setPaddingLeft(70f));
        nestedTable.addCell(new Cell().add("john@gmail.com ").setBorder(Border.NO_BORDER).setFontSize(10f));
        nestedTable.addCell(new Cell().add("Invoice Date : ").setBorder(Border.NO_BORDER).setFontSize(10f).setPaddingLeft(70f));
        nestedTable.addCell(new Cell().add("+0123 4567 89").setBorder(Border.NO_BORDER).setFontSize(10f));
        nestedTable.addCell(new Cell().add("Sales Order Code: ").setBorder(Border.NO_BORDER).setFontSize(10f).setPaddingLeft(70f));

        return nestedTable;
    }



}
