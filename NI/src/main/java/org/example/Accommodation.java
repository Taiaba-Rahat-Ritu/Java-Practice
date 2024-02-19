package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.util.LinkedList;

public class Accommodation  {
    public Paragraph accommodation(Color textColor1) {
        Paragraph accommodationHeading = new Paragraph("ACCOMMODATION").setBold().setFontColor(textColor1).setFontSize(12f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);

        return accommodationHeading;
    }

    public Table accommodationTable(float col2,LinkedList<Hotel> hotels){

        float columns[] = {col2/4, col2/3, col2/3, col2/2};

        Table accomodationTableN = new Table(columns);


        for (Hotel hotel : hotels) {
            System.out.println("Night: " + hotel.night +
                    ", Hotel Name: " + hotel.hotelName +
                    ", Room: " + hotel.room +
                    ", Remarks: " + hotel.remarks);
        }

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


/*package org.example;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.util.List;

public class Accommodation {
    public Paragraph createAccommodationHeading(String headingText, Color textColor1) {
        return new Paragraph(headingText)
                .setBold()
                .setFontColor(textColor1)
                .setFontSize(13f)
                .setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);
    }

    public Table createAccommodationTable(List<String[]> accommodationData, float[] columnWidths) {
        Table foodTable = new Table(columnWidths);

        // Add header row
        Cell nightCell = new Cell().add(new Paragraph("Night").setBold());
        Cell accommodationNameCell = new Cell().add(new Paragraph("Accommodation Name").setBold());
        Cell roomCell = new Cell().add(new Paragraph("Room").setBold());
        Cell remarkCell = new Cell().add(new Paragraph("Remark").setBold());
        foodTable.addHeaderCell(nightCell);
        foodTable.addHeaderCell(accommodationNameCell);
        foodTable.addHeaderCell(roomCell);
        foodTable.addHeaderCell(remarkCell);

        // Add data rows
        for (String[] rowData : accommodationData) {
            for (String cellData : rowData) {
                accommodationTable.addCell(new Cell().add(new Paragraph(cellData)));
            }
        }

        return accommodationTable;
    }
}*/
