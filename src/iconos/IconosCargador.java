
package iconos;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JLabel;


public class IconosCargador {
    public void cargar(
            JLabel lblHospital,
            JLabel lblCasa,
            JLabel lblPaciente,
            JLabel lblReporte,
            JLabel lblSalir,
            JLabel lblRegistroPaciente,
            JLabel lblPacientes,
            JLabel lblNombre,
            JLabel lblDNI,
            JLabel lblApellido,
            JLabel lblEdad,
            JLabel lblSexo,
            JLabel lblTelefono,
            JLabel lblMotivo,
            JLabel lblPrioridad,
            JLabel lblEditar,
            JLabel lblEliminar,
            JLabel lblRegistrar,
            JLabel lblFecha,
            JLabel lblDashboard
            ) {
        lblHospital.setIcon(Iconos.cargar("iconos/hospital-building.svg", 60,60));
        lblCasa.setIcon(Iconos.cargar("iconos/home-circle.svg"));
        lblPaciente.setIcon(Iconos.cargar("iconos/account.svg"));
        lblReporte.setIcon(Iconos.cargar("iconos/file-chart.svg"));
        lblSalir.setIcon(Iconos.cargar("iconos/exit-to-app.svg"));  
        lblRegistroPaciente.setIcon(new FlatSVGIcon("iconos/account.svg", 32, 32));
        lblNombre.setIcon(new FlatSVGIcon("iconos/account-details.svg", 22, 22));
        lblDNI.setIcon(new FlatSVGIcon("iconos/card-account-details.svg", 22, 22));
        lblApellido.setIcon(new FlatSVGIcon("iconos/account-star.svg", 22, 22));
        lblEdad.setIcon(new FlatSVGIcon("iconos/calendar-account-outline.svg", 22,22));
        lblSexo.setIcon(new FlatSVGIcon("iconos/account.svg",22,22));
        lblTelefono.setIcon(new FlatSVGIcon("iconos/phone.svg",22,22));
        lblMotivo.setIcon(new FlatSVGIcon("iconos/message.svg",22,22));
        lblPrioridad.setIcon(new FlatSVGIcon("iconos/flag.svg",22,22));
        lblEditar.setIcon(Iconos.cargar("iconos/pencil.svg",22,22));
        lblEliminar.setIcon(Iconos.cargar("iconos/trash-can-outline.svg",22,22));
        lblRegistrar.setIcon(Iconos.cargar("iconos/registered-trademark.svg",22,22));
        lblFecha.setIcon(new FlatSVGIcon("iconos/calendar-month.svg",22,22));
        lblDashboard.setIcon(Iconos.cargar("iconos/view-dashboard-edit-outline.svg",22,22));
        
    }
}
