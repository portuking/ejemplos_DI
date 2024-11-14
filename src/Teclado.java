import java.awt.RenderingHints.Key;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Teclado extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        System.out.println("Teclado pulsado. Código: "+ code);
    }

    public void keyPressedValue(KeyEvent e){
        int code = e.getKeyCode();
        char value = e.getKeyChar();
        System.out.println("Teclado pulsado. Código: "+ code + " Valor: " + value);
    }

    public void keyTyped(KeyEvent e) {
        char key = e.getKeyChar();
        System.out.println("Carácter pulsado. Valor: "+ key);
    }

    public void keyReleased(KeyEvent e) {

    }
}
