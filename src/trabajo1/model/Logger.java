package trabajo1.model;

import trabajo1.estados.Debug;
import trabajo1.estados.Estado;
import trabajo1.estados.Info;

import java.awt.desktop.ScreenSleepEvent;

public class Logger {
    private static Logger logger;

    private static Estado estado;

    private Logger (Estado estado) {
        Logger.estado = estado;
    }

    public static Logger getInstance() {
        if (!Logger.tieneInstancia()) {
            Logger.logger = new Logger(new Debug());
        }
        return Logger.logger;
    }

    private static boolean tieneInstancia() {
        return Logger.estado != null;
    }

    public void setNivel(Estado estado) {
        Logger.estado = estado;
    }

    public String debug(String string) { return estado.debug2(string); }
    public String info(String string) {
        return estado.info2(string);
    }
    public String warn(String string) {
        return estado.warn2(string);
    }
    public String error(String string) { return estado.error2(string); }

    public static Estado getEstado() {
        return estado;
    }
}
