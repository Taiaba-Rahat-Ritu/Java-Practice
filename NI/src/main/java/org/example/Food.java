/*
package org.example;
import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.layout.Document;
import org.example.*;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.awt.print.PageFormat;
import java.util.LinkedList;


public class Food {

    static Paragraph foodParagraph() {
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Paragraph foodHeading = new Paragraph("FOOD").setBold().setFontColor(darkCyan).setFontSize(13f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);

        return foodHeading;
    }

    static Table foodTable(Document document) {
        float column4 = 520f;
        float columns[] = {column4 / 4, column4 / 3, column4 / 3};
        Color darkCyan = new DeviceRgb(54, 101, 117);


        LinkedList<FoodVariable> foods = new LinkedList<>();

        foods.add(new FoodVariable("Included", "Included", "Included"));
        foods.add(new FoodVariable("Included", "Included", "Included"));
        foods.add(new FoodVariable("Included", "Included", "Included"));
        foods.add(new FoodVariable("Included", "Included", "Included"));
        foods.add(new FoodVariable("Included", "Included", "Included"));
        foods.add(new FoodVariable("Included", "Included", "Included"));
        foods.add(new FoodVariable("Included", "Included", "Included"));
        foods.add(new FoodVariable("Included", "Included", "Included"));

        for (FoodVariable food : foods) {
            System.out.println("Breakfast: " + food.breakfast +
                    ", Lunch : " + food.lunch +
                    ", Dinner: " + food.dinner );
        }

        Table foodTableN = new Table(new float[]{column4/4, column4/3, column4/3});
        foodTableN.addCell(new Cell().add("Breakfast").setBold());
        foodTableN.addCell(new Cell().add("Lunch ").setBold());
        foodTableN.addCell(new Cell().add("Dinner ").setBold());


        for (FoodVariable f1 : foods) {
            // Check if adding this row would cause a page break
            */
/*if (document.getPdfDocument().getRenderer().getCurrentArea().getBBox().getHeight() < 60) {*//*

                // If it does, add the table header again
                foodTableN = new Table(new float[]{column4 / 4, column4 / 3, column4 / 3});
                foodTableN.addCell(new Cell().add("Breakfast").setBold());
                foodTableN.addCell(new Cell().add("Lunch ").setBold());
                foodTableN.addCell(new Cell().add("Dinner ").setBold());


            foodTableN.addCell(new Cell().add(String.valueOf(f1.getBreakfast())));
            foodTableN.addCell(new Cell().add(f1.getLunch()));
            foodTableN.addCell(new Cell().add(f1.getDinner()));
        }

        return foodTableN;
    }

}





 */
/*int rowsPerPage = 3; // Adjust as needed
        int rowCount = 0;

        for (FoodVariable f1 : foods) {
            if (rowCount % rowsPerPage == 0) {
                // Add table header to the new page
                foodTableN.addCell(new Cell().add("Breakfast ").setBold());
                foodTableN.addCell(new Cell().add("Lunch ").setBold());
                foodTableN.addCell(new Cell().add("Dinner ").setBold());
            }

            foodTableN.addCell(new Cell().add(f1.getBreakfast()));
            foodTableN.addCell(new Cell().add(f1.getLunch()));
            foodTableN.addCell(new Cell().add(f1.getDinner()));

            rowCount++;
        }

        return foodTableN;*/

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