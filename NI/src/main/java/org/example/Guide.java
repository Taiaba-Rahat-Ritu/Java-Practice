package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class Guide {
    public Paragraph initiateGuideHeading(Color textColor1) {
        Paragraph guideHeading = new Paragraph("GUIDE").setBold().setFontColor(textColor1).setFontSize(12f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);

        return guideHeading;
    }

    public Table initiateGuideTable(GuideVariable guideVariable){

        Table guideTable = new Table(1);

        Paragraph g1 = new Paragraph("Included : "+ guideVariable.getIncluded()).setFontSize(10f);
        guideTable.addCell(new Cell().add(g1).setBorder(Border.NO_BORDER).setFontSize(10f));
        return guideTable;
    }
}
