package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;


public class Footer {

    public Paragraph createFooterParagraph(Color textColor1, FooterVariable footerVariable, float width, float x, float y) {

        Paragraph footerParagraph = new Paragraph();
        Paragraph p1 = new Paragraph(footerVariable.footerParagraph1).setFontColor(textColor1).setFontSize(13f).setBold()
                .setTextAlignment(TextAlignment.CENTER);
        Paragraph p2 = new Paragraph(footerVariable.footerParagraph2).setBold().setFontColor(textColor1)
                .setTextAlignment(TextAlignment.CENTER);
        Paragraph p3 = new Paragraph(footerVariable.footerParagraph3)
                .setTextAlignment(TextAlignment.CENTER);
        Paragraph p4 = new Paragraph(footerVariable.footerParagraph4)
                .setTextAlignment(TextAlignment.CENTER);


        //footerTable.setWidth(width);
        footerParagraph.setFixedPosition(x, y, width);


        footerParagraph.add(p1).setTextAlignment(TextAlignment.CENTER);
        footerParagraph.add(p2).setTextAlignment(TextAlignment.CENTER);
        footerParagraph.add(p3).setTextAlignment(TextAlignment.CENTER);
        footerParagraph.add(p4).setTextAlignment(TextAlignment.CENTER);


        return footerParagraph;
    }

}