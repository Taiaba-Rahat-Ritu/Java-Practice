package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.util.LinkedList;
import java.util.List;

public class PaidSpots {
    public Paragraph initiatePaidSpotsHeading(Color textColor1) {
        Paragraph paidSpotsHeading = new Paragraph("PAID SPOTS : ").setBold().setFontColor(textColor1).setFontSize(12f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);

        return paidSpotsHeading;
    }
    public Table initiatePaidSpotTable(float col2, List<PaidSpotVariable> paidSpots){
        float columns[] = {col2/4, col2/3, col2/3};
        Table paidSpotTableN = new Table(columns);




        for (PaidSpotVariable paidSpot : paidSpots) {
            System.out.println("Serial No : " + paidSpot.serialNo +
                    ", Spot Name : " + paidSpot.spotName +
                    ", Included: " + paidSpot.included);
        }

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
