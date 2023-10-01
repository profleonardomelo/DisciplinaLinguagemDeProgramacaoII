package VIEW;

public class Util {

    public static void permiterDigitarSomenteNumeros(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }
    
    public static void permiterDigitarSomenteNumerosEVirgula(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != ',') {
            evt.consume();
        }
    }
}
