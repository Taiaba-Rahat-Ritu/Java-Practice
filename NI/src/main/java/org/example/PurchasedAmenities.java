package org.example;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;

public class PurchasedAmenities {

    public Paragraph createHr(Color textColor1){
        Paragraph hr = new Paragraph();
        hr.add("------------------------------------------------------------------------------------------------------------------------").setBold().setFontColor(textColor1).setMarginLeft(26f);
        return hr;
    }
    public Paragraph initiatePurchasedAmenitiesHeading(Color textColor1) {
        Paragraph amenitiesHeading = new Paragraph("Purchased Amenities").setBold().setFontColor(textColor1).setFontSize(12f).setBorder(Border.NO_BORDER).setMarginTop(-10f).setMarginBottom(-10f)
                .setTextAlignment(TextAlignment.CENTER);

        return amenitiesHeading;
    }

}
