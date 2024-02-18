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
    static Paragraph Transfer() {
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Paragraph transferHeading = new Paragraph("TRANSFER").setBold().setFontColor(darkCyan).setFontSize(12f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);

        return transferHeading;
    }

    static Table transferTable(){
        float column4 = 520f;
        float columns[] = {column4/4, column4/3, column4/3};
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Table transferTableN = new Table(columns);

        LinkedList<transferVariable> transfers = new LinkedList<>();

        transfers.add(new transferVariable(1, "route 1", "abc"));
        transfers.add(new transferVariable(2, "route 2", "abc"));
        transfers.add(new transferVariable(3, "route 3", "abc"));

        for (transferVariable transfer : transfers) {
            System.out.println("Slot Number : " + transfer.slotNumber +
                    ", Route : " + transfer.route +
                    ", Description: " + transfer.description);
        }


        Table transferTable = new Table(new float[]{column4/4, column4/3, column4/3});
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
