package trabajo1.model.subnivel;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Control {
    private final static Logger LOGGER = Logger.getLogger("trabajo1.model.subnivel.Control");

    public void controlar(){
        LOGGER.log(Level.INFO, "Proceso exitoso");
    }
}
