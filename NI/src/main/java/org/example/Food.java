
package org.example;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.util.List;

public class Food {
    public Paragraph createFoodHeading(String headingText, Color textColor1) {
        return new Paragraph(headingText)
                .setBold()
                .setFontColor(textColor1)
                .setFontSize(13f)
                .setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);
    }

    public Table createFoodTable(List<String[]> foodData, float[] columnWidths) {
        Table foodTable = new Table(columnWidths);

        // Add header row
        Cell breakfastCell = new Cell().add(new Paragraph("Breakfast").setBold());
        Cell lunchCell = new Cell().add(new Paragraph("Lunch").setBold());
        Cell dinnerCell = new Cell().add(new Paragraph("Dinner").setBold());
        foodTable.addHeaderCell(breakfastCell);
        foodTable.addHeaderCell(lunchCell);
        foodTable.addHeaderCell(dinnerCell);

        // Add data rows
        for (String[] rowData : foodData) {
            for (String cellData : rowData) {
                foodTable.addCell(new Cell().add(new Paragraph(cellData)));
            }
        }

        return foodTable;
    }
}