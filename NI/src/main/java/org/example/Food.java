package org.example;
import org.example.*;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.util.LinkedList;


public class Food  {
    static Paragraph Food() {
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Paragraph foodHeading = new Paragraph("FOOD").setBold().setFontColor(darkCyan).setFontSize(13f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.LEFT);

        return foodHeading;
    }

    static Table foodTable(){
        float column4 = 520f;
        float columns[] = {column4/4, column4/3, column4/3};
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Table foodTableN = new Table(columns);

        LinkedList<FoodVariable> foods = new LinkedList<>();

        foods.add(new FoodVariable("Included", "Included", "Included"));
        foods.add(new FoodVariable("Included", "Included", "Included"));
        foods.add(new FoodVariable("Included", "Included", "Included"));

        for (FoodVariable food : foods) {
            System.out.println("Night: " + food.breakfast +
                    ", Hotel Name: " + food.lunch +
                    ", Room: " + food.dinner);
        }


        Table foodTable = new Table(new float[]{column4/4, column4/3, column4/3});
        foodTableN.addCell(new Cell().add("Breakfast ").setBold());
        foodTableN.addCell(new Cell().add("Lunch ").setBold());
        foodTableN.addCell(new Cell().add("Dinner ").setBold());

        for (FoodVariable f1 : foods) {
            foodTableN.addCell(new Cell().add(f1.getBreakfast()));
            foodTableN.addCell(new Cell().add(f1.getLunch()));
            foodTableN.addCell(new Cell().add(f1.getDinner()));

        }

        return foodTableN;
    }
}
