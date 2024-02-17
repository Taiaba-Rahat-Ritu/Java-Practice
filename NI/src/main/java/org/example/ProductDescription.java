package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.sql.Time;
import java.util.Date;

public class ProductDescription {

    static Paragraph createHr(){
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Paragraph hr = new Paragraph();
        hr.add("------------------------------------------------------------------------------------------------------------------------").setBold().setFontColor(darkCyan).setMarginLeft(26f);
        return hr;
    }
    static Paragraph ProductDescription() {
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Paragraph productHeading = new Paragraph("Product Description").setBold().setFontColor(darkCyan).setFontSize(15f).setBorder(Border.NO_BORDER).setMarginTop(-10f).setMarginBottom(-10f)
                .setTextAlignment(TextAlignment.CENTER);

        return productHeading;
    }

    static Table productDescription(TourVariable tourVariable){
        float twocol = 285f;

        Table productTable = new Table(1);

        Paragraph p1 = new Paragraph("Tour Start Date : "+ tourVariable.getTourStartDate()).setFontSize(13f);
        Paragraph p2 = new Paragraph("Tour Reporting Date : "+ tourVariable.getTourReportingDate()).setFontSize(13f);
        Paragraph p3 = new Paragraph("Tour Reporting Time : "+ tourVariable.getTourReportingTime()).setFontSize(13f);
        Paragraph p4 = new Paragraph("Quantity : "+ tourVariable.getQuantity()).setFontSize(13f);
        productTable.addCell(new Cell().add(p1).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
        productTable.addCell(new Cell().add(p2).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
        productTable.addCell(new Cell().add(p3).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));
        productTable.addCell(new Cell().add(p4).setBorder(Border.NO_BORDER).setPaddingBottom(20f).setFontSize(10f));


        return productTable;
    }

}
