
package Menu_Principal;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
public class EstilodeTabla {
    public void aplicar(JTable tabla) {

        tabla.getTableHeader().setDefaultRenderer(
            new DefaultTableCellRenderer() {

                @Override
                public Component getTableCellRendererComponent(
                        JTable table, Object value,
                        boolean isSelected, boolean hasFocus,
                        int row, int column) {

                    Component c = super.getTableCellRendererComponent(
                            table, value, isSelected, hasFocus, row, column);

                    c.setBackground(new Color(10, 61, 74));
                    c.setForeground(Color.WHITE);

                    return c;
                }
            }
        );
    }
    
}
