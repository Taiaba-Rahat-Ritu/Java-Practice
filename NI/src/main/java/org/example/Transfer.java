package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.util.LinkedList;


public class Transfer  {
    public Paragraph initiateTransferHeading(Color textColor1) {
        Paragraph transferHeading = new Paragraph("TRANSFER").setBold().setFontColor(textColor1).setFontSize(12f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);

        return transferHeading;
    }

    public Table initiateTransferTable(float col2, LinkedList<transferVariable> transfers){
        float columns[] = {col2/4, col2/3, col2/3};
        Table transferTableN = new Table(columns);


        for (transferVariable transfer : transfers) {
            System.out.println("Slot Number : " + transfer.slotNumber +
                    ", Route : " + transfer.route +
                    ", Description: " + transfer.description);
        }


        transferTableN.addCell(new Cell().add("Slot Number").setBold());
        transferTableN.addCell(new Cell().add("Route ").setBold());
        transferTableN.addCell(new Cell().add("Description ").setBold());

        for (transferVariable t1 : transfers) {
            transferTableN.addCell(new Cell().add(String.valueOf(t1.getSlotNumber())));
            transferTableN.addCell(new Cell().add(t1.getRoute()));
            transferTableN.addCell(new Cell().add(t1.getDescription()));

        }

        return transferTableN;
    }
}
