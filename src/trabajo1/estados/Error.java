package trabajo1.estados;

import trabajo1.model.Logger;

public class Error extends Estado{

    @Override
    public void info2(String mensaje) {

    }

    @Override
    public void warn2(String mensaje) {

    }

    @Override
    public void error2(String mensaje) {
        System.out.println("ERROR: " + mensaje);
    }
    @Override
    public void debug2(String mensaje) {

    }
}
