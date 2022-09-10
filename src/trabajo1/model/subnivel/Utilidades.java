package trabajo1.model.subnivel;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Utilidades {
    private final static Logger LOGGER = Logger.getLogger("trabajo1.model.subnivel.Utilidades");

    public void funcionDudosa(){
        LOGGER.log(Level.SEVERE, "ERROR MASIVO");
    }
}
