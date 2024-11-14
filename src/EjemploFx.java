import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjemploFx extends JFrame implements WindowListener{

    public void windowActivated(WindowEvent e){
        System.out.println("Ventana activada");
    }

    public void windowDeactivated(WindowEvent e){
        System.out.println("Ventana desactivada");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana cerrada");
    }

    public void windowOpened(WindowEvent e){
        System.out.println("Ventana abierta");
    }

    public void windowClosing(WindowEvent e){
        System.out.println("Ventana cerrando");
    }
    
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    public void windowDeiconified(WindowEvent e){
        System.out.println("Ventana desminimizada");
    }

    public void miMarco(){
        //setSize(500,300);
        //setLocation(500,300);
        setVisible(true);
        setBounds(500, 300, 250, 250);
        //setResizable(false);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Mi ventana");
        getContentPane().setBackground(new Color(65, 105, 225));
    }

    public void miMarcoCentrado(){
        setVisible(true);
        setTitle("Mi ventana centrada");
        getContentPane().setBackground(new Color(65, 105, 225));
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = screen.getScreenSize();
        int alturaPantalla = (int)tamanoPantalla.getHeight();
        int anchoPantalla = (int)tamanoPantalla.getWidth();
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);

    }

    public void marcoConTexto(){
        getContentPane().setBackground(new Color(65, 105, 225));
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("Ventana con Texto");
        Lamina mLamina = new Lamina();
        mLamina.setOpaque(false);
        add(mLamina);
    }

    public void marcoConFiguras(){
        setVisible(true);
        setSize(400,400);
        setTitle("Ventana con Figuras");
        Lamina miLamina = new Lamina();
        add(miLamina);
    }

    public void marcoConColor(){
        setVisible(true);
        setTitle("Prueba con colores");
        setSize(400,400);
        Lamina mLamina = new Lamina();
        add(mLamina);
    }

    public void textos(){
        setVisible(true);
        setTitle("Prueba con textos");
        setSize(500, 500);
        Lamina mLamina = new Lamina();
        add(mLamina);
    }

    public void foto(){
        setVisible(true);
        setTitle("Marco con imagen");
        setBounds(750,300,300,200);
        Lamina mLamina = new Lamina();
        add(mLamina);
    }

    public void boton(){
        setTitle("Ventana con botón centrado");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));

        JButton boton = new JButton("Púlsame");
        boton.setPreferredSize(new Dimension(100, 50)); 

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botón pulsado");
            }
        });
        panel.add(boton);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void marcoVentana(){
        setVisible(true);
        setSize(700, 650);
        setTitle("Marco con ventana");
        addWindowListener(new EjemploFx());
    }

    public void marcoTeclado(){
        setVisible(true);
        setTitle("Ventana para uso de teclado");
        setSize(700, 650);
        addKeyListener(new Teclado());
    }
}

