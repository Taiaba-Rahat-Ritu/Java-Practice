/*
package com.example.invoice;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.kernel.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

@Service
public class generatePdf {
    public String htmlToPdf(String processedHtml){

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            PdfWriter pdfWriter = new PdfWriter(byteArrayOutputStream);
            DefaultFontProvider defaultFont = new DefaultFontProvider(false, true, false);
            ConverterProperties converterProperties = new ConverterProperties();
            converterProperties.setFontProvider(defaultFont);
            HtmlConverter.convertToPdf(processedHtml, pdfWriter, converterProperties);

            FileOutputStream fileOutputStream = new FileOutputStream("D:\\work practice\\invoice\\documents");

            byteArrayOutputStream.writeTo(fileOutputStream);
            byteArrayOutputStream.close();
            byteArrayOutputStream.flush();
            fileOutputStream.close();

            return null;
        }
        catch (Exception exception){
            //exception occurs
        }

        return null;
    }
}
*/
package com.example.invoice;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

@Service
public class generatePdf {

    public static void main(String [] args){
        try {


            String fileName = "D:/work practice/invoice/documents/invoice.pdf";
            Document document = new Document();

            PdfWriter.getInstance(document, new fileOutputStream(fileName));
        }
        catch (Exception exception){
            System.out.println(exception);
        }
        Document.open();

    }
}
