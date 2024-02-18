package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.util.LinkedList;


public class Transportation  {
    static Paragraph Transportation() {
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Paragraph transportationHeading = new Paragraph("TRANSPORTATION").setBold().setFontColor(darkCyan).setFontSize(12f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);

        return transportationHeading;
    }

    static Table transportationTable(){
        float column4 = 520f;
        float columns[] = {column4/4, column4/3, column4/3};
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Table transportationTableN = new Table(columns);

        LinkedList<Transport> transports = new LinkedList<>();

        transports.add(new Transport(1, "route 1", "abc"));
        transports.add(new Transport(2, "route 2", "abc"));
        transports.add(new Transport(3, "route 3", "abc"));

        for (Transport transport : transports) {
            System.out.println("Slot No: " + transport.slotNumber +
                    ", Route : " + transport.route +
                    ", Description: " + transport.description);
        }


        Table transportationTable = new Table(new float[]{column4/4, column4/3, column4/3});
        transportationTableN.addCell(new Cell().add("Slot Number").setBold());
        transportationTableN.addCell(new Cell().add("Route ").setBold());
        transportationTableN.addCell(new Cell().add("Description ").setBold());

        for (Transport t1 : transports) {
            transportationTableN.addCell(new Cell().add(String.valueOf(t1.getSlotNumber())));
            transportationTableN.addCell(new Cell().add(t1.getRoute()));
            transportationTableN.addCell(new Cell().add(t1.getDescription()));

        }

        return transportationTableN;
    }
}
