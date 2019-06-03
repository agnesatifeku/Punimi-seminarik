import javax.swing.*;
import java.awt.*;
public class FirstTask extends JPanel

{  int width=850;
   int height=850;
 Color BACKGROUND_COLOR=Color.white;

    public FirstTask()
  {JFrame f= new JFrame();
      f.getContentPane().add(this);
      f.setTitle("First graph with values.");
      f.setSize(width,height);
      f.setVisible(true);
   }

   public void paintComponent(Graphics g)
  {g.setColor(Color.black);
   g.drawLine(80, 110, 200, 110); 
    g.drawLine(80, 110, 80, 20); 
   g.drawString("0",85,125);    // origjina e grafikut
    g.drawString("5",200,125);  //asimptota horizontale
    g.drawString("30",65,25);   // asimptota vertikale
    g.setColor(Color.black);
    g.drawLine(80, 110, 80, 20);
    g.drawString("",85,90);
 

     Graphics2D g2d = (Graphics2D)g;
     g2d.drawLine(80,100,160,100);
     
     g2d.setColor(Color.red);
     g2d.drawString("1",63,100);
     g2d.setColor(Color.red);
     g2d.drawString("The graph of y=x^2+2x+1, for x=0",100,70);
     
     
     
     g.setColor(Color.black);
     g.drawLine(230, 260, 350, 260); 
     g.drawLine(230, 260, 230, 170); 
     g.drawString("0",225,275);     // origjina e grafikut
     g.drawString("100",330,275);   // asimptota horizontale
     g.drawString("100",200,175);   // asimptota vertikale
     
     g.setColor(Color.blue);
     g.drawLine(235, 260, 235, 170);
     g.drawString("2",238,275);
    
     g2d.drawLine(230,240,310,240);
     g2d.setColor(Color.blue);
     g2d.drawString("9",212,247);
     g2d.setColor(Color.blue);
     g2d.drawString("The graph of y=x^2+2x+1, for x=2",280,200);
     
     
     
     
     g.setColor(Color.black);
     g.drawLine(330, 360, 450, 360); 
     g.drawLine(330, 360, 330, 270); 
     g.drawString("0",335,375);    // origjina e grafikut
     g.drawString("100",443,375);  // asimptota horizontale
     g.drawString("100",300,275);  // asimptota vertikale
     
     g.setColor(Color.green);
      g.drawLine(350, 360, 350, 270);
       g.drawString("4",350,369);
      g2d.drawLine(330,330,410,330);
      g2d.setColor(Color.green);
      g2d.drawString("25",312,330);
      g2d.setColor(Color.green);
      g2d.drawString("The graph of y=x^2+2x+1, for x=4",380,300);
      
      
      
      

      g.setColor(Color.black);
      g.drawLine(425, 460, 550, 460); // boshti x
      g.drawLine(430, 460, 430, 370); // boshti y
      g.drawString("0",420,475);    // origjina e grafikut
      g.drawString("100",543,475);   //asimptota horizontale
      g.drawString("100",400,375);    // asimptota vertikale
      
      g.setColor(Color.orange);
      g.drawLine(460, 460, 460, 370);
      g.drawString("6",453, 479);
            g2d.drawLine(430,421,510,421);
      g2d.setColor(Color.orange);
      g2d.drawString("49",412,421);
      g2d.setColor(Color.orange);
      g2d.drawString("The graph of y=x^2+2x+1, for x=6",480,400);
      
      
      
      
      
       g.setColor(Color.black);
      g.drawLine(551, 580, 670, 580);  // boshti x 
      g.drawLine(550, 580, 550, 490);  // boshti y 
      g.drawString("0",555,595);     // origjina e grafikut
      g.drawString("20",655,595);    //asimptota horizontale
      g.drawString("100",525,495);  // asimptota vertikale
      
       g.setColor(Color.pink);
       g.drawLine(600, 580, 600, 490);
       g.drawString("8",600, 600);
          
     g2d.drawLine(550,528,630,528);
      g2d.setColor(Color.pink);
      g2d.drawString("81",532,528);
      g2d.setColor(Color.pink);
      g2d.drawString("The graph of y=x^2+2x+1, for x=8",600,520);
      
      
      
      

        g.setColor(Color.black);
      g.drawLine(680, 710, 800, 710);   // boshti x
      g.drawLine(680, 710, 680, 620);   // boshty y 
      g.drawString("0",685,725);     // origjina e grafikut
      g.drawString("20",780,725);   // asimptota horizontale 
      g.drawString("150",655,620);   // asimptota vertikale
      
      g.setColor(Color.pink);
      g.drawLine(740, 710, 740, 620);
      g.drawString("10",740, 730);
      
       g2d.drawLine(680,644,760,644);
     g2d.setColor(Color.pink);
     g2d.drawString("121",658,644);
     g2d.setColor(Color.pink);
     g2d.drawString("The graph of y=x^2+2x+1, for x=10",750,640);

   }

   public static void main (String [] args)

   {new FirstTask();

   }

}