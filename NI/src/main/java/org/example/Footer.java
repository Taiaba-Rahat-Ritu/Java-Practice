package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class Footer {

    static Table createFooterTable() {
        Color darkCyan = new DeviceRgb(54, 101, 117);

        Table footerTable = new Table(1);
        footerTable.addCell(new Cell().add("Ghuddy").setBorder(Border.NO_BORDER).setFontSize(15f).setFontColor(darkCyan)
                .setTextAlignment(TextAlignment.CENTER));
        footerTable.addCell(new Cell().add("--------------------------------------------------------------------------------------------------------------------------").setBold().setBorder(Border.NO_BORDER).setFontColor(darkCyan)
                .setTextAlignment(TextAlignment.CENTER));
        footerTable.addCell(new Cell().add("RAHMAN VILLA - KA-18, BARIDHARA, NORTH ROAD - DHAKA - 1212, BANGLADESH").setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER));
        footerTable.addCell(new Cell().add("© All Rights Reserved. Ghuddy, 2024").setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER));

        return footerTable;
    }

}