
package org.example;

import com.itextpdf.kernel.color.Color;

import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;


import java.util.List;

public class Accommodation {
    public Paragraph accommodation(Color textColor1) {
        Paragraph accommodationHeading = new Paragraph("ACCOMMODATION").setBold().setFontColor(textColor1).setFontSize(12f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);

        return accommodationHeading;
    }

    public Table initiateAccommodationTable(float col2, List<Hotel> hotels){

        float[] columns = {col2/4, col2/3, col2/3, col2/2};

        Table accommodationTableN = new Table(columns);

        accommodationTableN.addCell(new Cell().add("Night").setBold());
        accommodationTableN.addCell(new Cell().add("Accommodation Name ").setBold());
        accommodationTableN.addCell(new Cell().add("Room ").setBold());
        accommodationTableN.addCell(new Cell().add("Remarks ").setBold());



        for (Hotel h1 : hotels) {
            accommodationTableN.addCell(new Cell().add(String.valueOf(h1.getNight())));
            accommodationTableN.addCell(new Cell().add(h1.getHotelName()));
            accommodationTableN.addCell(new Cell().add(h1.getRoom()));
            accommodationTableN.addCell(new Cell().add(h1.getRemarks()));
        }

        return accommodationTableN;
    }
}
