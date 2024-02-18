package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.util.LinkedList;

public class PaidSpots {
    static Paragraph PaidSpots() {
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Paragraph paidSpotsHeading = new Paragraph("PAID SPOTS : ").setBold().setFontColor(darkCyan).setFontSize(12f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);

        return paidSpotsHeading;
    }
    static Table paidSpotTable(){
        float column4 = 520f;
        float columns[] = {column4/4, column4/3, column4/3};
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Table paidSpotTableN = new Table(columns);

        LinkedList<PaidSpotVariable> paidSpots = new LinkedList<>();

        paidSpots.add(new PaidSpotVariable(1, "Spot 1", "Yes"));
        paidSpots.add(new PaidSpotVariable(2, "Spot 2", "Yes"));
        paidSpots.add(new PaidSpotVariable(3, "Spot 3", "No"));


        for (PaidSpotVariable paidSpot : paidSpots) {
            System.out.println("Serial No : " + paidSpot.serialNo +
                    ", Spot Name : " + paidSpot.spotName +
                    ", Included: " + paidSpot.included);
        }


        Table paidSpotTable = new Table(new float[]{column4/4, column4/3, column4/3});
        paidSpotTableN.addCell(new Cell().add("Serial No").setBold());
        paidSpotTableN.addCell(new Cell().add("Spot Name ").setBold());
        paidSpotTableN.addCell(new Cell().add("Included ").setBold());

        for (PaidSpotVariable p1 : paidSpots) {
            paidSpotTableN.addCell(new Cell().add(String.valueOf(p1.getSerialNo())));
            paidSpotTableN.addCell(new Cell().add(p1.getSpotName()));
            paidSpotTableN.addCell(new Cell().add(p1.getIncluded()));


        }

        return paidSpotTableN;
    }
}
