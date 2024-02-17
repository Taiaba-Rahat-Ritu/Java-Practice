package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;

public class PurchasedAmenities {

    static Paragraph createHr(){
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Paragraph hr = new Paragraph();
        hr.add("------------------------------------------------------------------------------------------------------------------------").setBold().setFontColor(darkCyan).setMarginLeft(26f);
        return hr;
    }
    static Paragraph PurchasedAmenities() {
        Color darkCyan = new DeviceRgb(54, 101, 117);
        Paragraph amenitiesHeading = new Paragraph("Purchased Amenities").setBold().setFontColor(darkCyan).setFontSize(15f).setBorder(Border.NO_BORDER).setMarginTop(-10f).setMarginBottom(-10f)
                .setTextAlignment(TextAlignment.CENTER);

        return amenitiesHeading;
    }

}
