package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class Footer {
    private static final Border BORDER = new SolidBorder(Color.BLACK, 1f / 2f);

    static Table createFooterTable() {
        Table footerTable = new Table(1);
        footerTable.addCell(new Cell().add("Ghuddy").setBorder(Border.NO_BORDER).setFontSize(15f)
                .setTextAlignment(TextAlignment.CENTER));
        footerTable.addCell(new Cell().add("RAHMAN VILLA - KA-18, BARIDHARA, NORTH ROAD - DHAKA - 1212, BANGLADESH").setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER));
        footerTable.addCell(new Cell().add("© All Rights Reserved. Ghuddy, 2024").setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER));

        return footerTable;
    }

    static Table createHRTable(float[] devider) {
        Table HR = new Table(devider);
        HR.setBorder(BORDER);
        return HR;
    }
}