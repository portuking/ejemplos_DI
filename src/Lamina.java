import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Lamina extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.drawString("Lámina Sobre JFrame con Swing", 100, 100);
        //Graphics2D g2 =(Graphics2D) g;
        //File imagen = new File("/home/COTARELO/pdopazo/Downloads/guti.jpeg");
        try{
            Image imagen = ImageIO.read(new File("/home/COTARELO/pdopazo/Downloads/danibeefeater.jpeg"));
            g.drawImage(imagen, 5, 5, null);
        }catch(IOException e){
            System.out.println("Imagen no encontrada");
        }
        
    }

    /**
     * Font fuente = new Font("Courier", Font.BOLD, 26);
        g2.setFont(fuente);
        g2.setColor(Color.blue);
        g2.drawString("Prueba texto formateado", 100, 300);
        g2.setFont(new Font("Arial", Font.ITALIC, 14));
        g2.setColor(new Color(128,90,50));
        g2.drawString("Curso de Java", 100, 200);  
     */

    /**
     * Rectangle2D rectangle2d = new Rectangle2D.Double(100,100,200,150);
        g2.setPaint(Color.blue);
        g2.fill(rectangle2d);
        Ellipse2D ellipse2d = new Ellipse2D.Double();
        ellipse2d.setFrame(rectangle2d);
        g2.setPaint(Color.red);
        g2.fill(ellipse2d); 
     */

    /**
     * Figuras
     * Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.draw(rectangulo);
        Ellipse2D ellipse2d = new Ellipse2D.Double();
        ellipse2d.setFrame(rectangulo);
        g2.draw(ellipse2d);
        g2.draw(new Line2D.Double(100, 100, 300, 250));
        double centroEnX = rectangulo.getCenterX();
        double centroEnY = rectangulo.getCenterY();
        double radio = 150;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX+radio, centroEnY+radio);
        g2.draw(circulo);
     */
}
