package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;

public class GhuddyTnC {

    public Paragraph initiateGhuddyTnCHeading(Color textColor1) {
        Paragraph ghuddyTnCHeading = new Paragraph("Ghuddy Terms and Condition").setFontColor(textColor1).setBold().setFontSize(13f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER);

        return ghuddyTnCHeading;
    }


    public Table initiateGhuddyTnCTable(GhuddyTnCVariable ghuddyTnCVariable){

        Table ghuddyTnCTable = new Table(1);


        Text boldText1 = new Text(ghuddyTnCVariable.getH1()).setBold();
        Text normalText1 = new Text(ghuddyTnCVariable.getP1());
        Text boldText2 = new Text(ghuddyTnCVariable.getH2()).setBold();
        Text normalText2 = new Text(ghuddyTnCVariable.getP2());
        Text boldText3 = new Text(ghuddyTnCVariable.getH3()).setBold();
        Text normalText3 = new Text(ghuddyTnCVariable.getP3());
        Text boldText4 = new Text(ghuddyTnCVariable.getH4()).setBold();
        Text normalText4 = new Text(ghuddyTnCVariable.getP4());
        Text boldText5 = new Text(ghuddyTnCVariable.getH5()).setBold();
        Text normalText5 = new Text(ghuddyTnCVariable.getP5());
        Text boldText6 = new Text(ghuddyTnCVariable.getH6()).setBold();
        Text normalText6 = new Text(ghuddyTnCVariable.getP6());
        Text boldText7 = new Text(ghuddyTnCVariable.getH7()).setBold();
        Text normalText7 = new Text(ghuddyTnCVariable.getP7());
        Text boldText8 = new Text(ghuddyTnCVariable.getH8()).setBold();
        Text normalText8 = new Text(ghuddyTnCVariable.getP8());
        Text boldText9 = new Text(ghuddyTnCVariable.getH9()).setBold();
        Text normalText9 = new Text(ghuddyTnCVariable.getP9());


        Paragraph para1 = new Paragraph().add(boldText1).add(normalText1);
        Paragraph para2 = new Paragraph().add(boldText2).add(normalText2);
        Paragraph para3 = new Paragraph().add(boldText3).add(normalText3);
        Paragraph para4 = new Paragraph().add(boldText4).add(normalText4);
        Paragraph para5 = new Paragraph().add(boldText5).add(normalText5);
        Paragraph para6 = new Paragraph().add(boldText6).add(normalText6);
        Paragraph para7= new Paragraph().add(boldText7).add(normalText7);
        Paragraph para8 = new Paragraph().add(boldText8).add(normalText8);
        Paragraph para9 = new Paragraph().add(boldText9).add(normalText9);




        Cell cell1 = new Cell().add(para1).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell2 = new Cell().add(para2).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell3 = new Cell().add(para3).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell4 = new Cell().add(para4).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell5 = new Cell().add(para5).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell6 = new Cell().add(para6).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell7 = new Cell().add(para7).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell8 = new Cell().add(para8).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);
        Cell cell9 = new Cell().add(para9).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT).setTextAlignment(TextAlignment.JUSTIFIED);

        ghuddyTnCTable.addCell(cell1);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell2);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell3);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell4);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell5);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell6);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell7);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell8);
        ghuddyTnCTable.addCell(new Cell().add(new Paragraph("\n")).setBorder(Border.NO_BORDER));
        ghuddyTnCTable.addCell(cell9);


        return ghuddyTnCTable;

    }
}
