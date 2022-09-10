package trabajo1.model.subnivel.under;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InternalSys {
    private final static Logger LOGGER = Logger.getLogger("trabajo1.model.subnivel.under.InternalSys");

    public void llamadaSistema(){
        LOGGER.log(Level.WARNING, "Ocurrio un error de acceso en 0xFF");
    }
}
