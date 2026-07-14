package Reporte;

import Menu_Principal.ListaEnlazada;
import Menu_Principal.Nodo;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

import java.io.FileOutputStream;
import java.time.LocalDate;

public class GestorReporte {

    public static Nodo buscarPorDni(ListaEnlazada lista, String dni) {

        if (lista == null || dni == null || dni.isEmpty()) {
            return null;
        }

        Nodo actual = lista.getCabeza();

        while (actual != null) {

            if (actual.getDni().equalsIgnoreCase(dni)
                    && actual.getEstado().equalsIgnoreCase("Atendido")) {

                return actual;
            }

            actual = actual.getSiguiente();
        }

        return null;
    }

    public static boolean exportarFichaPdf(String rutaArchivo, Nodo paciente) {
        Document documento = new Document(PageSize.A4, 50, 50, 50, 50);

        try {

            PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
            documento.open();

            Font titulo = FontFactory.getFont(FontFactory.TIMES_BOLD, 18);
            Font subtitulo = FontFactory.getFont(FontFactory.TIMES_BOLD, 13);
            Font normal = FontFactory.getFont(FontFactory.TIMES, 12);
            Font negrita = FontFactory.getFont(FontFactory.TIMES_BOLD, 12);
            Font nombreSistema = FontFactory.getFont(FontFactory.TIMES_BOLD, 22);
            Font descripcion = FontFactory.getFont( FontFactory.TIMES_ITALIC, 11);
            Font lineaTitulo = FontFactory.getFont( FontFactory.TIMES_BOLD, 16 );

            // Nombre grande
            Paragraph sitrah = new Paragraph("SITRAH", nombreSistema);
            sitrah.setAlignment(Element.ALIGN_CENTER);
            documento.add(sitrah);

            // Descripción
            Paragraph subtituloSistema = new Paragraph(
                    "Sistema Integrado de Triaje Hospitalario",
                    descripcion
            );

            subtituloSistema.setAlignment(Element.ALIGN_CENTER);
            documento.add(subtituloSistema);

            documento.add(new Paragraph(" "));
            documento.add(new LineSeparator());
            documento.add(new Paragraph(" "));

            //titulo
            Paragraph pTitulo = new Paragraph("INFORME DE TRIAJE", titulo);
            pTitulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(pTitulo);

            documento.add(new Paragraph(" "));

            //datos
            PdfPTable tabla = new PdfPTable(2);
            tabla.setWidthPercentage(100);
            tabla.setWidths(new float[]{35, 65});

            agregarFila(tabla, "PACIENTE", paciente.getNombre() + " " + paciente.getApellido(), negrita, normal);
            agregarFila(tabla, "DNI", paciente.getDni(), negrita, normal);
            agregarFila(tabla, "EDAD", paciente.getEdad() + " años", negrita, normal);
            agregarFila(tabla, "SEXO", paciente.getSexo(), negrita, normal);
            agregarFila(tabla, "TELÉFONO", paciente.getTelefono(), negrita, normal);
            agregarFila(tabla, "FECHA DE ATENCIÓN", LocalDate.now().toString(), negrita, normal);

            documento.add(tabla);

            documento.add(new Paragraph(" "));
            documento.add(new LineSeparator());

            documento.add(new Paragraph(" "));
            documento.add(new Paragraph("MOTIVO DE CONSULTA", subtitulo));
            documento.add(new Paragraph(paciente.getMotivo(), normal));

            documento.add(new Paragraph(" "));
            documento.add(new LineSeparator());

            documento.add(new Paragraph(" "));
            documento.add(new Paragraph("EVALUACIÓN DE TRIAJE", subtitulo));
            documento.add(new Paragraph("Prioridad: " + paciente.getPrioridad().toUpperCase(), normal));

            documento.add(new Paragraph(" "));
            documento.add(new LineSeparator());

            documento.add(new Paragraph(" "));
            documento.add(new Paragraph("OBSERVACIONES", subtitulo));
            documento.add(new Paragraph(
                    "Reporte generado automáticamente por el Sistema de Triaje Hospitalario (SITRAH).",
                    normal));

            documento.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void agregarFila(PdfPTable tabla,
            String etiqueta,
            String valor,
            Font f1,
            Font f2) {

        PdfPCell c1 = new PdfPCell(new Phrase(etiqueta, f1));
        c1.setBorder(Rectangle.NO_BORDER);

        PdfPCell c2 = new PdfPCell(new Phrase(": " + valor, f2));
        c2.setBorder(Rectangle.NO_BORDER);

        tabla.addCell(c1);
        tabla.addCell(c2);
    }
}
