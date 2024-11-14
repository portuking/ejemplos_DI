import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Raton extends MouseAdapter implements MouseListener , MouseMotionListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Ratón clicado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Se ha entrado en un elemento");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Se ha salido de un elemento");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Se ha presionado el botón");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Se ha soltado el ratón");
    }
    
    public void mouseClicker(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Se ha hecho click en la coordenada X: " + x+ " Y: "+ y);
        if(e.getButton()==MouseEvent.BUTTON1){
            System.out.println("Se ha pulsado el botón izquierdo");
        }else if(e.getButton()==MouseEvent.BUTTON3){
            System.out.println("Se ha pulsado el botón derecho");
        }else{
            System.out.println("Se ha pulsado otro botón");
        }
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas Arrastrando");
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo el ratón");
    }
}
