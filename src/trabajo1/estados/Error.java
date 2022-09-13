package trabajo1.estados;

import trabajo1.model.Logger;

public class Error extends Estado{

    @Override
    public String info2(String mensaje) {
        return null;
    }

    @Override
    public String warn2(String mensaje) {
        return null;
    }

    @Override
    public String error2(String mensaje) {
        return "ERROR: " + mensaje;    }

    @Override
    public String debug2(String mensaje) {
        return null;
    }
}
