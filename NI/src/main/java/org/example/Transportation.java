package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.util.LinkedList;


public class Transportation  {
    public Paragraph initiateTransportationHeading(Color textColor1) {

        Paragraph transportationHeading = new Paragraph("TRANSPORTATION").setBold().setFontColor(textColor1).setFontSize(12f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);

        return transportationHeading;
    }

    public Table initiateTransportationTable(float col2, LinkedList<Transport> transports){
        float[] columns = {col2/4, col2/3, col2/3};
        Table transportationTableN = new Table(columns);



        for (Transport transport : transports) {
            System.out.println("Slot No: " + transport.slotNumber +
                    ", Route : " + transport.route +
                    ", Description: " + transport.description);
        }


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
