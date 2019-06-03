import javax.swing.*;
import java.awt.*;
public class FourthTask extends JPanel
{  int width=850;
   int height=850;
   Color BACKGROUND_COLOR=Color.white;

   public FourthTask()
   {JFrame f= new JFrame();
      f.getContentPane().add(this);
      f.setTitle("Fourth graph with values.");
      f.setSize(width,height);
      f.setVisible(true);
   }

   public void paintComponent(Graphics g)

   {g.setColor(Color.black);
      g.drawLine(80, 110, 200, 110); //boshti x
      g.drawLine(80, 110, 80, 20); //boshti y
      g.drawString("0",85,125);// origjina e grafikut
      g.drawString("5",200,125);//asimptota horizontale
      g.drawString("30",65,25);// asimptota vertikale
      
       g.setColor(Color.black);
       g.drawLine(80, 110, 80, 20);
       g.drawString("",85,90);
  
        Graphics2D g2d = (Graphics2D)g;
      g2d.drawLine(80,110,160,110);//vija ne te cilen vlera e y bie
      g2d.setColor(Color.red);
      g2d.drawString("0",63,110);//pozicioni i vleres se y
      g2d.setColor(Color.red);
      g2d.drawString("The graph of y=0.1(x^3)+x^2-x, for x=0",100,70);
      
      
      

       g.setColor(Color.black);
      g.drawLine(230, 260, 350, 260); 
      g.drawLine(230, 260, 230, 170); 
      g.drawString("0",228,275);// origjina e grafikut
      g.drawString("100",330,275);//asimptota horizontale
      g.drawString("100",200,175);//asimptota vertikale
      
      g.setColor(Color.blue);
      g.drawLine(240, 260, 240, 170);
       g.drawString("2",240, 272);
    
      g2d.drawLine(230,255,310,255);//vija ne te cilen vlera e y bie
      g2d.setColor(Color.blue);
      g2d.drawString("2.8",212,255);//pozicioni i vleres se y
      g2d.setColor(Color.blue);
      g2d.drawString("The graph of y=0.1(x^3)+x^2-x, for x=2",280,200);
      


       g.setColor(Color.black);
      g.drawLine(330, 360, 450, 360); 
      g.drawLine(330, 360, 330, 270); 
      g.drawString("0",335,375);// origjina e grafikut
      g.drawString("100",443,375);//asimptota horizontale
      g.drawString("100",300,275);//asimptota vertikale
      
      g.setColor(Color.green);
      g.drawLine(360, 360, 360, 270);
       g.drawString("4",360, 373);
           
       g2d.drawLine(330,341,410,341);//vija ne te cilen vlera e y bie
       g2d.setColor(Color.green);
       g2d.drawString("18.4",301,341);//pozicioni i vleres se y
       g2d.setColor(Color.green);
      g2d.drawString("The graph of y=0.1(x^3)+x^2-x, for x=4",380,300);

      

          
      g.setColor(Color.black);
      g.drawLine(425, 460, 550, 460); //boshti x
      g.drawLine(430, 460, 430, 370); // boshti y
      g.drawString("0",435,475);// origjina e grafikut
      g.drawString("100",543,475);//asimptota horizontale
      g.drawString("100",400,375);// asimptota vertikale
      
      g.setColor(Color.orange);
      g.drawLine(480, 460, 480, 370);
      g.drawString("6",480, 470);

      g2d.drawLine(430,418,510,418);//vija ne te cilen vlera e y bie
      g2d.setColor(Color.orange);
      g2d.drawString("51.6",401,418);//pozicioni i vleres se y
      g2d.setColor(Color.orange);
      g2d.drawString("The graph of y=0.1(x^3)+x^2-x, for x=6",480,400);

      


       g.setColor(Color.black);
      g.drawLine(551, 580, 670, 580);//boshti x
      g.drawLine(550, 580, 550, 490);// boshti y 
      g.drawString("0",555,595);// origjina e grafikut
      g.drawString("115",655,595);//asimptota horizontale
      g.drawString("100",525,495);// asimptota vertikale
      
      g.setColor(Color.pink);
      g.drawLine(620, 580, 620, 490);
      g.drawString("8",620, 590);
      
      g2d.drawLine(550,512,630,512);//vija ne te cilen vlera e y bie
      g2d.setColor(Color.pink);
      g2d.drawString("107.2",515,512);//pozicioni i vleres se y
      g2d.setColor(Color.pink);
      g2d.drawString("The graph of y=0.1(x^3)+x^2-x, for x=8",625,530);
      
      
      
      
      g.setColor(Color.black);
      g.drawLine(680, 710, 800, 710);//boshti x
      g.drawLine(680, 710, 680, 620); // boshti y 
      g.drawString("0",685,725);// origjina e grafikut
      g.drawString("100",780,740);// asimptota horizontale
      g.drawString("200",655,620);// asimptota vertikale

      g.setColor(Color.magenta);
      g.drawLine(780, 710, 780, 620);
      g.drawString("10",780, 720);

      g2d.drawLine(680,634,790,634); 
      g2d.setColor(Color.magenta);
      g2d.drawString("190",658,634);
      g2d.setColor(Color.magenta);
      g2d.drawString("The graph of y=0.1(x^3)+x^2-x, for x=10",730,650);
   }


   public static void main (String [] args)

   {new FourthTask();

   }

}