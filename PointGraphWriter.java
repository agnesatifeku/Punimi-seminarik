import java.awt.*;
import javax.swing.*;
public class PointGraphWriter extends JPanel

{
   private int x_position;
   private int y_position;
   private int height = 108;   //lartesia e pikave
   private int axis_length=110;
   int thick = 3;            //trashesia e pikave
   private int width = 300;         // gjeresia e kornizes
   private int frame_height = 200;  // gjatesia e kornizes
   private int pointDistance = 20; // largesa ndermjet pikave 
   private int p1 = pointDistance;

   Graphics g ;
   JFrame my_frame;
   
   public PointGraphWriter()
   {
      my_frame = new JFrame();
      my_frame.getContentPane().add(this);
      my_frame.setSize(width,frame_height);
      my_frame.setVisible(true);
   } 

      public void setTitle(String title)
   {
      my_frame.setTitle(title);
   }

      public void paintComponent(Graphics g)
   {
      g.setColor(Color.white);
      g.fillRect(0, 0, width, frame_height); 
   }

   public void setAxes(int x_pos, int y_pos,int axis_length, String x_label, String y_label)
   {
      g = this.getGraphics();
      this.x_position = x_pos;
      this.y_position = y_pos;
      g.setColor(Color.black);      
      g.drawString(x_label, x_position+110, y_position+15);
      g.drawString("0", x_position, y_position+15);
      g.drawString("0", x_position-15, y_position);
      g.drawString(y_label, y_position-80, x_position - 20);

      // x-axis
      g.drawLine(x_position, y_position, axis_length+70 , y_position);
      // y-axis
      g.drawLine(x_position, axis_length-70, x_position, y_position);
   }
   
         public void setPoint1(int height)        // setPoint1 vizaton piken 1 ne grafik

   {
      g.setColor(Color.black);
      g.drawOval(x_position, height+108, thick, thick);
      g.fillOval(x_position, height+108, thick, thick);
      } 


    
         public void setPoint2(int height)      // setPoint2 vizaton piken e 2-te ne grafik  

   {
      g.setColor(Color.black);
      g.drawOval((x_position/5)+60,height+100, thick, thick);
      g.fillOval((x_position/5)+60,height+100, thick, thick);
      g.drawLine(x_position,height+106,(x_position/5)+60,height+102);
   }

   
   public void setPoint3(int height)    // setPoint3 vizaton piken e 3-te ne grafik

   {
      g.setColor(Color.black);
      g.drawOval((x_position/5)+p1+60, height+84, thick, thick);
      g.fillOval((x_position/5)+p1+60, height+84, thick, thick);
      g.drawLine((x_position/5)+60,height+94,(x_position/5)+p1+60,height+86);
         }

   public void setPoint4(int height)      // setPoint4 vizaton pike e 4-te ne grafik

    {  g.setColor(Color.black);
      g.drawOval((x_position/5)+p1*2+60,height+60, thick, thick);
      g.fillOval((x_position/5)+p1*2+60, height+60, thick, thick);
      g.drawLine((x_position/5)+60+p1,y_position-12,(x_position/5)+p1*2+60,height+62);
      }

   

   
   public void setPoint5(int height)       // setPoint5 vizaton piken e 5-te ne grafik
   {     
      g.setColor(Color.black);
      g.drawOval((x_position/5)+p1*3+60, height+20, thick, thick);
      g.fillOval((x_position/5)+p1*3+60, height+20, thick, thick);
      g.drawLine((x_position/5)+p1*2+60,y_position-p1,(x_position/5)+p1*3+60,height+22);
}

     public void setPoint6( int height)          // setPoint6 vizaton piken e 6-te ne grafik

   { 
       g.setColor(Color.black);
      g.drawOval((x_position/5)+p1*4+60, height-28, thick, thick);
      g.fillOval((x_position/5)+p1*4+60, height-28, thick, thick);
      g.drawLine((x_position/5)+p1*3+60,y_position-p1*2,(x_position/5)+p1*4+60,height-26);
}

}