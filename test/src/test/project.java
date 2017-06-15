import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class project extends JPanel {

   public void paint(Graphics g) {
      Image img = createImageWithText();
      g.drawImage(img, 20,20,this);
   }

   private Image createImageWithText(){
      BufferedImage bufferedImage = new 
      BufferedImage(2000,2000,BufferedImage.TYPE_INT_RGB);
      Graphics g = bufferedImage.getGraphics();
      g.drawString("hello world", 600,100);
      g.drawString("HELLO WORRLD", 400,300);
      g.drawString("HELLO world", 600,500);
      g.drawString("hello WORLD", 800,300);
      return bufferedImage;
   }
   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.getContentPane().add(new project());

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(2000, 2000);
      frame.setVisible(true);
   }
}