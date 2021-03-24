package Operation;

import java.io.IOError;

public class Div extends Operation {

    @Override
    public double operate() {
        try {
            return numberA/numberB;
        } catch (IOError e) {
            System.out.println("除数不能为空！");
            return 0;
        }
    }
}