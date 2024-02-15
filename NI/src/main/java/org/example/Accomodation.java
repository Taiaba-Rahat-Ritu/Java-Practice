package org.example;

import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;

public class Accomodation {
    static Paragraph productDescription() {
        Paragraph accomodationHeding = new Paragraph("Product Description").setBold().setFontSize(13f).setBorder(Border.NO_BORDER)
                .setTextAlignment(TextAlignment.CENTER);

        return accomodationHeding;
    }
}
