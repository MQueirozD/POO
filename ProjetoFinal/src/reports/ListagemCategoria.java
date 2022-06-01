/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reports;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import entity.CategoriaProduto;
import java.util.List;

/**
 *
 * @author rafae
 */
public class ListagemCategoria {
    public static Document gerarCabecalhoTemporario(Document doc){
        Paragraph titulo = new Paragraph("Listagem de Categorias");
        titulo.setBold();
        titulo.setFontSize(15);
        titulo.setTextAlignment(TextAlignment.CENTER);
        doc.add(titulo);
        return doc;
    }

    public static Document gerarTabela(Document doc, List<CategoriaProduto> categs) {
        Table tbl = new Table(2).useAllAvailableWidth();
        tbl.addCell("Código");
        tbl.addCell("Nome");
        for(CategoriaProduto c : categs){
            tbl.addCell(c.getId() + "");
            tbl.addCell(c.getNome());
        }
        doc.add(tbl);
        return doc;
    }
}
