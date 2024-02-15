package org.example;

import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

public class Food {

    float foodCol = 530f;
    Paragraph foodTable = new Paragraph("FOOD").setFontSize(15f);

   /* static Table foodDay1Table(day1[] day1Food, float foodCol){
        Table foodDay1 = new Table(new float[]{foodCol/3, foodCol/3, foodCol/3});
        foodDay1.addCell(new Cell().add("Breakfast: "));
        foodDay1.addCell(new Cell().add("Lunch: "));
        foodDay1.addCell(new Cell().add("Dinner: "));

        for(day1 food : day1Food){
            foodDay1.addCell(new Cell().add());
        }
    }*/
}
