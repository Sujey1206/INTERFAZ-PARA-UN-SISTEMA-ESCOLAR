package VistaAlumno;
import Modelo.Alumno;
import Modelo.ConsultasAlumno;
import Modelo.ConsultasNotas;
import Modelo.Notas;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class Diseño_Pdf {

    String nombre, fecha, rutaImagen, nomAlum, apelAlum,nivel,grado,Seccion;
    static String dni;
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    static ConsultasNotas modeloN;
    static ConsultasAlumno modeloA;

    public Diseño_Pdf(String nombre, String fecha, String rutaImagen, String nomAlum, String apelAlum,
                      String nivel, String grado, String Seccion) {
        this.nombre = nombre;
        this.nomAlum = nomAlum;
        this.nivel=nivel;
        this.grado=grado;
        this.Seccion=Seccion;
        this.apelAlum = apelAlum;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
        documento = new Document();
        titulo = new Paragraph("BOLETA DE NOTAS");
    }

    public Diseño_Pdf(ConsultasNotas modeloN, ConsultasAlumno modeloA, String dni) {
        this.modeloN = modeloN;
        this.modeloA = modeloA;
        this.dni = dni;
    }

    public void crearPlantilla() {
        try {
            archivo = new FileOutputStream(nombre + ".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(Element.TITLE);
            Image image = null;
            try {
                image = Image.getInstance(rutaImagen);
                image.scaleAbsolute(100, 100);
                image.setAbsolutePosition(30, 740);
            } catch (Exception e) {
            }
            documento.add(image);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(titulo);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("****************************************************************************************************************"));
            documento.add(new Paragraph("    Nombres: " + nomAlum + "                                                                         Apellidos: " + apelAlum));
            documento.add(new Paragraph("    Nivel: " + nivel + "                                        Grado: " + grado+ "                                      Seccion: " + Seccion));
            documento.add(new Paragraph("****************************************************************************************************************"));
            documento.add(Chunk.NEWLINE);            
            Paragraph texto = new Paragraph("La Institucion Educativa Privada Maria Montessori le hace presente el siguiente documento que "
                    + "contiene la BOLETA DE NOTAS del alumno(a) "+nomAlum+" "+apelAlum+" del grado "+grado+" de la seccion "+Seccion
                    + " del nivel educativo "+nivel+".");
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(texto);
            documento.add(Chunk.NEWLINE);
            PdfPTable tabla = new PdfPTable(6);
            tabla.setWidthPercentage(100);
            PdfPCell Curs = new PdfPCell(new Phrase("Curso"));
            Curs.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell PriBi = new PdfPCell(new Phrase("Primer Bimestre"));
            PriBi.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell SeguBi = new PdfPCell(new Phrase("Segundo Bimestre"));
            SeguBi.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell TerBi = new PdfPCell(new Phrase("Tercero Bimestre"));
            TerBi.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell CuaBi = new PdfPCell(new Phrase("Cuarto Bimestre"));
            CuaBi.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell Nota = new PdfPCell(new Phrase("Nota Final"));
            Nota.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(Curs);
            tabla.addCell(PriBi);
            tabla.addCell(SeguBi);
            tabla.addCell(TerBi);
            tabla.addCell(CuaBi);
            tabla.addCell(Nota);
            float acum=0;
            int i=0;
            for (Notas n : modeloN.listar()) {
                for (Alumno a : modeloA.listar()) {
                    if (dni.compareTo(a.getDni() + "") == 0) {
                        if (a.getApe().compareTo(n.getApe()) == 0 && a.getNom().compareTo(n.getNom()) == 0) {
                            tabla.addCell(n.getCur());
                            tabla.addCell(n.getPrimero()+""+Chunk.NEWLINE+" ");
                            tabla.addCell(n.getSegundo()+"");
                            tabla.addCell(n.getTercero()+"");
                            tabla.addCell(n.getCuarto()+"");
                            tabla.addCell(n.getPromedio()+"");
                            acum += n.getPromedio();
                            i++;
                        }
                    }
                }
            }
            tabla.addCell(""+Chunk.NEWLINE+" ");
            tabla.addCell("");
            tabla.addCell("");
            tabla.addCell("");
            tabla.addCell("Promedio Final");
            tabla.addCell(acum/i+"");
            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha));
            documento.close();
            JOptionPane.showMessageDialog(null, "El archivo PDF se a creado correctamente!");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (DocumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
