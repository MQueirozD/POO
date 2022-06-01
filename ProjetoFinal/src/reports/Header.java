/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reports;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.events.Event;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Canvas;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.property.TextAlignment;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author rafae
 */
public class Header implements IEventHandler {

    private String titulo;

    public Header(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void handleEvent(Event event) {
        try {
            PdfDocumentEvent docEvent = (PdfDocumentEvent) event;
            PdfDocument pdf = docEvent.getDocument();
            PdfPage page = docEvent.getPage();
            Rectangle pageSize = page.getPageSize();
            Canvas canvas = new Canvas(new PdfCanvas(page), pageSize);
            canvas.setFontSize(18);
            URL urlToImage = this.getClass().getResource("/img/logo.jpg");
            ImageData data = ImageDataFactory.create(urlToImage.getPath());
            Image img = new Image(data);
            img.setWidth(90);
            canvas.add(img);
            canvas.showTextAligned(titulo,
                    pageSize.getWidth() / 2,
                    pageSize.getTop() - 60, TextAlignment.CENTER);
            canvas.setUnderline();
            canvas.close();
        } catch (MalformedURLException ex) {
            
        }

    }

}
