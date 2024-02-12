package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

public class Header {
    static Table createHeaderTable() {
        float twocol = 285f;
        float twocol150 = twocol + 150f;
        float twoColumnWidth[] = {twocol, twocol150};
        Color slateblue = new DeviceRgb(11, 80, 79);

        Table headerTable = new Table(twoColumnWidth);
        headerTable.addCell(new Cell().add("Ghuddy").setBorder(Border.NO_BORDER).setBold().setFontSize(20f).setFontColor(slateblue));
        headerTable.addCell(new Cell().add("Reservation Confirmation").setBorder(Border.NO_BORDER).setFontSize(20f).setPaddingLeft(100f));


        headerTable.addCell(new Cell().add("Date :").setBorder(Border.NO_BORDER).setPaddingTop(20f).setFontSize(15f));
        headerTable.addCell(new Cell().add("INVOICE DATE :").setBorder(Border.NO_BORDER).setPaddingTop(20f).setFontSize(15f));
        headerTable.addCell(new Cell().add("Company : Ghuddy Limited").setBorder(Border.NO_BORDER).setFontSize(10f));
        headerTable.addCell(new Cell().add("Order :").setBold().setBorder(Border.NO_BORDER).setFontSize(10f));
        headerTable.addCell(new Cell().add("Phone : +88001797078379").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
        headerTable.addCell(new Cell().add("Email : support@ghuddy.com").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));

           /* Paragraph paragraph = new Paragraph("Thank you for your interest in Ghuddy Limited. We are pleased to confirm the following reservation details for your kind reference.").setFontSize(9f).setPaddingBottom(20f);
            Paragraph p1 = new Paragraph("Customer Name : "*//*+ customerName*//*).setPaddingBottom(20f).setFontSize(10f);
            Paragraph p2 = new Paragraph("Phone :"*//*+ customerPhone*//*).setPaddingBottom(20f).setFontSize(10f);
            Paragraph p3 = new Paragraph("Email :"*//*+ customerEmail*//*).setPaddingBottom(20f).setFontSize(10f);
            Paragraph p4 = new Paragraph("Checkin Date :"*//*+ checkinDate*//*).setPaddingBottom(20f).setFontSize(10f);
            Paragraph p5 = new Paragraph("Checkout Date :"*//*+ checkoutDate*//*).setPaddingBottom(20f).setFontSize(10f);
            headerTable.addCell(new Cell().add("\n").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(paragraph).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p1).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p2).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p3).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p4).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add(p5).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));*/


        return headerTable;
    }
    static Table createHeader2(User user) {
        float twocol = 285f;
        float twocol150 = twocol + 150f;
        float twoColumnWidth[] = {twocol, twocol150};
        Color slateblue = new DeviceRgb(11, 80, 79);

        Table headerTable = new Table(1);
         /*   headerTable.addCell(new Cell().add("Ghuddy").setBorder(Border.NO_BORDER).setBold().setFontSize(20f).setFontColor(slateblue));
            headerTable.addCell(new Cell().add("Reservation Confirmation").setBorder(Border.NO_BORDER).setFontSize(20f).setPaddingLeft(100f));
*/

           /* headerTable.addCell(new Cell().add("Date :").setBorder(Border.NO_BORDER).setPaddingTop(20f).setFontSize(15f));
            headerTable.addCell(new Cell().add("INVOICE DATE :").setBorder(Border.NO_BORDER).setPaddingTop(20f).setFontSize(15f));
            headerTable.addCell(new Cell().add("Company : Ghuddy Limited").setBorder(Border.NO_BORDER).setFontSize(10f));
            headerTable.addCell(new Cell().add("Order :").setBold().setBorder(Border.NO_BORDER).setFontSize(10f));
            headerTable.addCell(new Cell().add("Phone : +88001797078379").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
            headerTable.addCell(new Cell().add("Email : support@ghuddy.com").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
*/
        Paragraph paragraph = new Paragraph("Thank you for your interest in Ghuddy Limited. We are pleased to confirm the following reservation details for your kind reference.").setFontSize(9f).setPaddingBottom(20f);
        Paragraph p1 = new Paragraph("Customer Name : "+ user.getCustomerName()).setPaddingBottom(20f).setFontSize(10f);
        Paragraph p2 = new Paragraph("Phone :"+ user.getCustomerPhone()).setPaddingBottom(20f).setFontSize(10f);
        Paragraph p3 = new Paragraph("Email :"+user.getCustomerEmail()).setPaddingBottom(20f).setFontSize(10f);
        Paragraph p4 = new Paragraph("Checkin Date :"+user.getCheckinDate()).setPaddingBottom(20f).setFontSize(10f);
        Paragraph p5 = new Paragraph("Checkout Date :"+user.getCheckoutDate()).setPaddingBottom(20f).setFontSize(10f);
        headerTable.addCell(new Cell().add("\n").setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
        headerTable.addCell(new Cell().add(paragraph).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
        headerTable.addCell(new Cell().add(p1).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
        headerTable.addCell(new Cell().add(p2).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
        headerTable.addCell(new Cell().add(p3).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
        headerTable.addCell(new Cell().add(p4).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
        headerTable.addCell(new Cell().add(p5).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));


        return headerTable;
    }
}