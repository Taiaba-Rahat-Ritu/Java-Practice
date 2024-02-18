package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class Guide {
    static Paragraph Guide() {
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Paragraph guideHeading = new Paragraph("GUIDE").setBold().setFontColor(darkCyan).setFontSize(12f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);

        return guideHeading;
    }

    static Table guideTable(GuideVariable guideVariable){
        float column4 = 520f;
        Color darkCyan = new DeviceRgb(54, 101, 117);


        Table guideTable = new Table(1);

        Paragraph g1 = new Paragraph("Included : "+ guideVariable.getIncluded()).setFontSize(10f);
        guideTable.addCell(new Cell().add(g1).setBorder(Border.NO_BORDER).setFontSize(10f));
        return guideTable;
    }
}
