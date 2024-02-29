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

public class PackageInformation {

    public Paragraph createHr(Color textColor1){
        Paragraph hr = new Paragraph();
        hr.add("------------------------------------------------------------------------------------------------------------------------").setBold().setFontColor(textColor1).setMarginLeft(26f);
        return hr;
    }
    public Paragraph initiatePackageInfoHeading(Color textColor1) {
        Paragraph packageHeading = new Paragraph("Package Information").setBold().setFontColor(textColor1).setFontSize(12f).setBorder(Border.NO_BORDER).setMarginTop(-10f).setMarginBottom(-10f)
                .setTextAlignment(TextAlignment.CENTER);

        return packageHeading;
    }

    public Table initiatePackageInformationTable(PackageVariable packageVariable){
        float twocol = 285f;

        Table packageTable = new Table(1);

        Paragraph p1 = new Paragraph("Package Name : "+ packageVariable.getPackageName()).setFontSize(10f);
        Paragraph p2 = new Paragraph("No of Guest : "+ packageVariable.getNoOfGuest()).setFontSize(10f);
        Paragraph p3 = new Paragraph("Free NO of Children : "+ packageVariable.getFreeNoOfChild()).setFontSize(10f);
        Paragraph p4 = new Paragraph("Max Child Ages : "+ packageVariable.getMaxChildAge()).setFontSize(10f);
        Paragraph p5 = new Paragraph("Reporting Place : "+ packageVariable.getReportingPlace()).setFontSize(10f);
        Paragraph p6 = new Paragraph("Reporting Time : "+ packageVariable.getReportingTime()).setFontSize(10f);
        packageTable.addCell(new Cell().add(p1).setBorder(Border.NO_BORDER).setFontSize(10f));
        packageTable.addCell(new Cell().add(p2).setBorder(Border.NO_BORDER).setFontSize(10f));
        packageTable.addCell(new Cell().add(p3).setBorder(Border.NO_BORDER).setFontSize(10f));
        packageTable.addCell(new Cell().add(p4).setBorder(Border.NO_BORDER).setFontSize(10f));
        packageTable.addCell(new Cell().add(p5).setBorder(Border.NO_BORDER).setFontSize(10f));
        packageTable.addCell(new Cell().add(p6).setBorder(Border.NO_BORDER).setFontSize(10f));


        return packageTable;
    }

}
