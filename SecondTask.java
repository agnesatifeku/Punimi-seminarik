import javax.swing.*;
import java.awt.*;
public class SecondTask extends JPanel

{  int width=850;
  int height=850;
  Color BACKGROUND_COLOR=Color.white;

  public SecondTask()
 {JFrame f= new JFrame();
   f.getContentPane().add(this);
   f.setTitle("Second graph with values.");
   f.setSize(width,height);
   f.setVisible(true);
   }

   public void paintComponent(Graphics g)
   
   {g.setColor(Color.black);
    g.drawLine(80, 110, 200, 110); // boshti x
    g.drawLine(80, 110, 80, 20);  // boshti y
    g.drawString("0",85,125);    //origjina e grafikut
    g.drawString("100",200,125); //asimptota horizontale
    g.drawString("100",65,25);  // asimptota vertikale
    
       g.setColor(Color.red);
    g.drawLine(80, 110, 80, 20);
    g.drawString("",70, 20);
   
    Graphics2D g2d = (Graphics2D)g;
    g2d.drawLine(80,40,160,40);
    g2d.setColor(Color.red);
    g2d.drawString("90",63,40);
    g2d.setColor(Color.red);
    g2d.drawString("The graph of y=90-(0.8x)^2  for x=0",100,70);
    
    
    
    
    g.setColor(Color.black);
    g.drawLine(230, 260, 350, 260); //boshti x
    g.drawLine(230, 260, 230, 170); //boshti y
    g.drawString("0",230,275); // origjina e grafikut
    g.drawString("100",330,275); // asimptota horizontale
    g.drawString("100",200,175); // asimptota vertikale
    
      g.setColor(Color.blue);
      g.drawLine(240, 270, 240, 170);
       g.drawString("2",245, 272);
       g2d.drawLine(230,200,310,200);
      g2d.setColor(Color.blue);
      g2d.drawString("87.44",190,200);
      g2d.setColor(Color.blue);
      g2d.drawString("The graph of y=90-(0.8x)^2, for x=2",300,180);
      

      

      g.setColor(Color.black);
      g.drawLine(330, 360, 450, 360); // boshti x
      g.drawLine(330, 360, 330, 270); //boshti y
      g.drawString("0",335,375); // origjina e grafikut 
      g.drawString("100",443,375); //asimptota horizontale
      g.drawString("100",300,275); // asimptota vertikale
      
      g.setColor(Color.green);
      g.drawLine(350, 360, 350, 270);
       g.drawString("4",350,373);
       

       g2d.drawLine(329,325,410,325);
       g2d.setColor(Color.green);
       g2d.drawString("79.76",272,325);
       g2d.setColor(Color.green);
       g2d.drawString("The graph of y=90-(0.8x)^2, for x=4",380,300);
       

      

      g.setColor(Color.black);
      g.drawLine(429, 460, 550, 460); // boshti x
      g.drawLine(430, 460, 430, 370); // boshti y
       g.drawString("0",435,475); // origjina e grafikut
      g.drawString("100",543,475); //asimptota horizontale
      g.drawString("100",400,375); // asimptota vertikale 
      
      g.setColor(Color.orange);
      g.drawLine(465, 460, 465, 370);
      g.drawString("6",465, 480);
      
       g2d.drawLine(430,429,510,429);
      g2d.setColor(Color.orange);
      g2d.drawString("66.96",392,421);
      g2d.setColor(Color.orange);
      g2d.drawString("The graph of y=90-(0.8x)^2, for x=6",480,400);
      
      
      
      
       g.setColor(Color.black);
      g.drawLine(544, 580, 670, 580); //boshti x
      g.drawLine(550, 580, 550, 490); //bohti y
      g.drawString("0",555,595); //origjina e grafikut
      g.drawString("100",655,595); //asimptota horizontale
      g.drawString("100",525,495); // asimptota vertikale
      
      g.setColor(Color.pink);
      g.drawLine(600, 580, 600, 490);
       g.drawString("8",600, 600);
      
      g2d.drawLine(550,555,630,555);
      g2d.setColor(Color.pink);
      g2d.drawString("49.04",518,555);
      g2d.setColor(Color.pink);
      g2d.drawString("The graph of y=90-(0.8x)^2, for x=8",600,520);
      
      

      

        g.setColor(Color.black);
    g.drawLine(680, 710, 800, 710); //boshti x
      g.drawLine(680, 710, 680, 620); //boshti y
      g.drawString("0",685,725); //origjina e grafikut
      g.drawString("100",780,725);// asimptota horizontale 
      g.drawString("150",655,620);// asimptota vertikale
      
      g.setColor(Color.magenta);
      g.drawLine(750, 710, 750, 620);
       g.drawString("10",750, 730);
       g2d.drawLine(680,700,760,700);
      g2d.setColor(Color.magenta);
      g2d.drawString("26",655,700);
      g2d.setColor(Color.magenta);
      g2d.drawString("The graph of y=90-(0.8x)^2, for x=10",730,640);

   }

   public static void main (String [] args)

   {new SecondTask();

   }

}