
package iconos;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;

public class Iconos {
    private static final Color COLOR_ICONOS = Color.WHITE;
    
    public static FlatSVGIcon cargar(String ruta) {
        return cargar(ruta, 32, 32);
    }
    
    public static FlatSVGIcon cargar(String ruta, int ancho, int alto) {
        FlatSVGIcon icon = new FlatSVGIcon(ruta,  ancho,  alto);

        icon.setColorFilter(
            new FlatSVGIcon.ColorFilter(
                color -> COLOR_ICONOS
            )
        );

        return icon;
    }
}
