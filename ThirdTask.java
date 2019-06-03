import javax.swing.*;
import java.awt.*;
public class ThirdTask extends JPanel
{  int width=850;
   int height=850;
   Color BACKGROUND_COLOR=Color.white;
   public ThirdTask()

   {JFrame f= new JFrame();
      f.getContentPane().add(this);
      f.setTitle("Third graph with values.");
      f.setSize(width,height);
      f.setVisible(true);
   }

   public void paintComponent(Graphics g)
   {g.setColor(Color.black);
      g.drawLine(80, 110, 200, 110); //boshti x
      g.drawLine(80, 110, 80, 20); //boshti y
      g.drawString("0",85,125);// origjina e grafikut
      g.drawString("100",200,125);//asimptota horizontale
      g.drawString("100",65,25);//asimptota vertikale
      
       g.setColor(Color.black);
      g.drawLine(80, 110, 80, 20);
       g.drawString("",70, 20);
      
      Graphics2D g2d = (Graphics2D)g;
      g2d.drawLine(80,110,160,110);//vija ku bie vlera e y
      g2d.setColor(Color.black);
      g2d.drawString("",70,110);//pozicioni i vleres se y
      g2d.setColor(Color.red);
      g2d.drawString("The graph of y=20x-(0.5x)^3  for x=0",100,70);    
      
      
      
       g.setColor(Color.black);
    g.drawLine(230, 260, 350, 260); //boshti x
      g.drawLine(230, 260, 230, 170); //boshti y
      g.drawString("0",225,275);// origjina e grafikut
      g.drawString("100",330,275);// asimptota horizontale
      g.drawString("100",200,175);// asimptota vertikale
     g.setColor(Color.blue);
      g.drawLine(240, 260, 240, 170);
       g.drawString("4",240, 275);
           
       g2d.drawLine(230,237,310,237);
      g2d.setColor(Color.blue);
      g2d.drawString("39",200,237);
      g2d.setColor(Color.blue);
      g2d.drawString("The graph of y=20x-(0.5x)^3, for x=2",300,180);
      

      

       g.setColor(Color.black);
      g.drawLine(330, 360, 450, 360); //boshti x
      g.drawLine(330, 360, 330, 270); // boshty y
      g.drawString("0",335,375);  // origjina e grafiku
      g.drawString("100",443,375);//asimptota horizontale
      g.drawString("100",300,275);// asimptota vertikale
     g.setColor(Color.green);
      g.drawLine(360, 360, 360, 270);
       g.drawString("6",360, 380);
       

      g2d.drawLine(329,310,410,310);
      g2d.setColor(Color.green);
      g2d.drawString("72",300,310);
      g2d.setColor(Color.green);
      g2d.drawString("The graph of y=20x-(0.5x)^3, for x=4",380,300);
      

      

         g.setColor(Color.black);
      g.drawLine(429, 460, 550, 460);//boshti x
      g.drawLine(430, 460, 430, 370); // boshti y
       g.drawString("0",435,475);// origjina e grafikut
      g.drawString("100",543,475);//asimptota horizontale
      g.drawString("100",400,375);// asimptota vertikale
      g.setColor(Color.orange);
      g.drawLine(480, 460, 480, 370);
       g.drawString("8",480, 480);
      
      g2d.drawLine(430,389,510,389);
      g2d.setColor(Color.orange);
      g2d.drawString("93",392,389);
      g2d.setColor(Color.orange);
      g2d.drawString("The graph of y=20x-(0.5x)^3, for x=6",480,430);
      

      

       g.setColor(Color.black);
      g.drawLine(549, 580, 670, 580);//boshti x
      g.drawLine(550, 580, 550, 490); // boshti y
      g.drawString("0",555,595);// origjina e grafikut
      g.drawString("100",655,595);// asimptota horizontale
      g.drawString("100",525,495);// asimptota vertikale

     g.setColor(Color.pink);
      g.drawLine(630, 580, 630, 490);
       g.drawString("10",630, 600);
       
      g2d.drawLine(550,500,640,500);
      g2d.setColor(Color.pink);
      g2d.drawString("96",518,510);
      g2d.setColor(Color.pink);
      g2d.drawString("The graph of y=20x-(0.5x)^3, for x=8",650,520);
      
      
      

        g.setColor(Color.black);
      g.drawLine(680, 710, 820, 710); //boshti x
      g.drawLine(680, 730, 680, 650); //boshti y
      g.drawString("0",670,710);// origjina e grafikut
      g.drawString("100",780,725);//asimptota horizontale 
      g.drawString("150",655,640);// asimptota vertikale
    g.setColor(Color.magenta);
      g.drawLine(780, 730, 780, 650);
       g.drawString("10",760, 700);
            
      g2d.drawLine(680,726,789,726);
      g2d.setColor(Color.magenta);
      g2d.drawString("-25",655,726);
      g2d.setColor(Color.magenta);
      g2d.drawString("The graph of y=20x-(0.5x)^3, for x=10",730,640);
   }


   public static void main (String [] args)

   {new ThirdTask();

   }

}