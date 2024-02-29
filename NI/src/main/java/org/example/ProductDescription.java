package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;


public class ProductDescription {

    public Paragraph createHr(Color textColor1){
        Paragraph hr = new Paragraph();
        hr.add("------------------------------------------------------------------------------------------------------------------------").setBold().setFontColor(textColor1).setMarginLeft(26f);
        return hr;
    }
    public Paragraph initiateProductDescription(Color textColor1) {
        Paragraph initiateProductHeading = new Paragraph("Product Description").setBold().setFontColor(textColor1).setFontSize(12f).setBorder(Border.NO_BORDER).setMarginTop(-10f).setMarginBottom(-10f)
                .setTextAlignment(TextAlignment.CENTER);

        return initiateProductHeading;
    }

    public Table InitiateProductDescriptionTable(TourVariable tourVariable){

        Table productTable = new Table(1);

        Paragraph p1 = new Paragraph("Title : "+ tourVariable.getTitle()).setFontSize(10f);
        Paragraph p2 = new Paragraph("Description : "+ tourVariable.getDescription()).setFontSize(10f);
        Paragraph p3 = new Paragraph("Start Date : "+ tourVariable.getTourStartDate()).setFontSize(10f);
        Paragraph p4 = new Paragraph("Duration : "+ tourVariable.getDuration()).setFontSize(10f);
        productTable.addCell(new Cell().add(p1).setBorder(Border.NO_BORDER).setFontSize(10f));
        productTable.addCell(new Cell().add(p2).setBorder(Border.NO_BORDER).setFontSize(10f));
        productTable.addCell(new Cell().add(p3).setBorder(Border.NO_BORDER).setFontSize(10f));
        productTable.addCell(new Cell().add(p4).setBorder(Border.NO_BORDER).setFontSize(10f));


        return productTable;
    }

}
