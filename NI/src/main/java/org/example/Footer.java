package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;


public class Footer {

    public Table createFooterTable(Color textColor1, FooterVariable footerVariable, float width, float x, float y) {

        Table footerTable = new Table(1);
        Paragraph p1 = new Paragraph(footerVariable.footerParagraph1).setFontColor(textColor1).setFontSize(13f).setBold()
                .setTextAlignment(TextAlignment.CENTER);
        Paragraph p2 = new Paragraph(footerVariable.footerParagraph2).setBold().setFontColor(textColor1)
                .setTextAlignment(TextAlignment.CENTER);
        Paragraph p3 = new Paragraph(footerVariable.footerParagraph3)
                .setTextAlignment(TextAlignment.CENTER);
        Paragraph p4 = new Paragraph(footerVariable.footerParagraph4)
                .setTextAlignment(TextAlignment.CENTER);


        //footerTable.setWidth(width);
        footerTable.setFixedPosition(x, y, width);


        footerTable.addCell(p1);
        footerTable.addCell(p2);
        footerTable.addCell(p3);
        footerTable.addCell(p4);


        return footerTable;
    }

}