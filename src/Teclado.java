import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Teclado extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        System.out.println("Teclado pulsado. Código: "+ code);
    }
}
