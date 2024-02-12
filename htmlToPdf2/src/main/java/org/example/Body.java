package org.example;

import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import org.example.order;

public class Body {
    static Table createOrderDetailsTable(order[] orders, float col3) {
        Table orderDetails = new Table(new float[]{col3 / 5, col3 / 4, col3 / 3, col3 / 3, col3 / 3});
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

        return orderDetails;
    }

      /*  static Paragraph createFooterParagraph() {
            return new Paragraph("Thank you for your interest in Ghuddy Limited. We are pleased to confirm the following reservation details for your kind reference.")
                    .setFontSize(9f).setPaddingBottom(20f);
        }*/

    // Add other methods for body content creation as needed
}