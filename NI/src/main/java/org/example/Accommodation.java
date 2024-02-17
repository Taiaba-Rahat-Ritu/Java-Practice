package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class Accommodation  {
    static Paragraph accommodation() {
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Paragraph accommodationHeding = new Paragraph("ACCOMMODATION").setBold().setFontColor(darkCyan).setFontSize(13f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);

        return accommodationHeding;
    }

    static Table accommodationTable(){
        float column4 = 520f;
        float columns[] = {column4/4, column4/3, column4/3, column4/2};
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Table accomodationTableN = new Table(columns);

        Hotel[] hotels = {
                new Hotel(1, "Hotel 1", " G001", "abc"),
                new Hotel(2, "Hotel 2", " 1021", "abc"),
                new Hotel(3, "Hotel 3", " 2021", "abc"),




        };

        Table accommodationTable = new Table(new float[]{column4/4, column4/3, column4/3, column4/2});
        accomodationTableN.addCell(new Cell().add("Night").setBold());
        accomodationTableN.addCell(new Cell().add("Accommodation Name ").setBold());
        accomodationTableN.addCell(new Cell().add("Room ").setBold());
        accomodationTableN.addCell(new Cell().add("Remarks ").setBold());

        for (Hotel h1 : hotels) {
            accomodationTableN.addCell(new Cell().add(String.valueOf(h1.getNight())));
            accomodationTableN.addCell(new Cell().add(h1.getHotelName()));
            accomodationTableN.addCell(new Cell().add(h1.getRoom()));
            accomodationTableN.addCell(new Cell().add(h1.getRemarks()));

        }

        return accomodationTableN;
    }
}