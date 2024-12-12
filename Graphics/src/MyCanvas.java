import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
 
public class MyCanvas extends Canvas 
	{
	static int color;
	static Graphics graphics;
		
	private static final long	serialVersionUID	= 1L;
	 
	public static void main(String[] args) 
	    {
	   	
	
	    MyCanvas canvas = new MyCanvas();
	    JFrame frame = new JFrame();
	    frame.setSize(1000, 1000);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(canvas).setBackground(Color.gray);
	    frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	    frame.setResizable(false);
	    frame.setVisible(true);
		}
 
	public void paint(Graphics graphics) 
		{
//			Scanner userInput = new Scanner (System.in);
//			System.out.println("Do you want (1) blue or (2) red?");
//		    color = userInput.nextInt();
//		    
//		    if(color==1)
//		    	{
//		    		System.out.println("How wide do you want it to be?");
//		    	int	width = userInput.nextInt();
//		    	System.out.println("How tall do you want it to be?");
//		    	int	height = userInput.nextInt();
//		    	
//		    	System.out.println("Here you go!");
//		    	 graphics.setColor(Color.blue);
//			        graphics.fillRect(480, 480, width, height);
//		    	}
//		    else if (color==2)
//		    	{
//		    		System.out.println("How wide do you want it to be?");
//			    	int	width = userInput.nextInt();
//			    	System.out.println("How tall do you want it to be?");
//			    	int	height = userInput.nextInt();
//			    	
//			    	System.out.println("Here you go!");
//			    	 graphics.setColor(Color.red);
//				     graphics.fillRect(480, 480, width, height);
//		    	}
//
//	        graphics.setColor(Color.red);
//	        graphics.fillOval(140, 130, 100, 100);
//	        
//	        graphics.setColor(Color.blue);
//	        graphics.fillRect(110, 100, 200, 100);
//	     
//	        graphics.setColor(Color.blue);
//	        graphics.fillRect(10, 300, 800, 100);
//	        
//	        graphics.setColor(Color.yellow);
//	        graphics.fillRect(900, 900, 50, 50);
//	        
//	        graphics.setColor(Color.blue);
//	        graphics.drawRect(900, 900, 50, 50);
//	        
//	        graphics.setColor(Color.black);
//	        graphics.drawLine(40, 30, 330, 180);	        
//	        
//	        graphics.setColor(Color.black);
//	        graphics.drawLine(1000, 0, 0, 1000);	
//	        
//	        graphics.setColor(Color.yellow);
//	        graphics.fillOval(300, 700, 100, 100);
//	        
//	        graphics.setColor(Color.black);
//	        graphics.fillRect(325, 730, 10, 10);
//	        graphics.setColor(Color.green);
//	        graphics.fillRect(370, 730, 10, 10);
//	        
//	        graphics.setColor(Color.red);
//	        graphics.fillOval(330, 750, 40, 40);
//	        
//	        graphics.setColor(Color.yellow);
//	        graphics.fillRect(330, 750, 60, 20);
//	        
//	        for(int r=0; r< 16581375; r++)
//	        	{
//	        graphics.setColor(new Color(r,0,0));
//	        graphics.fillRect(700, 450, 100, 100);
//	        
//	        for(int g=0; g< r; g++)
//	        	{
//	        		 graphics.setColor(new Color(r,g,0));
//	     	        graphics.fillRect(700, 450, 100, 100);
//	     	      
//	     	        for(int b=0; b<g ; b++)
//	   	        	{
//	   	        		 graphics.setColor(new Color(r,g,b));
//	   	     	        graphics.fillRect(700, 450, 100, 100);
//	   	        	}
//	        	}
//	        
//	        	}
	        
//	        for (int i = 0; i < 1000; i = i + 10)
//	        	{
//		        graphics.setColor(Color.green);
//		        graphics.fillRect(i, i, 50, 50);
//		        
//		        delay();
//		        
//		        graphics.setColor(Color.gray);
//		        graphics.fillRect(i, i, 50, 50);   	
//		        
//	        	}
//	        
//	        for (int i = 950; i > 0; i = i - 10)
//	        	{
//		        graphics.setColor(Color.green);
//		        graphics.fillRect(i, i, 50, 50);
//		        
//		        delay();
//		        
//		        graphics.setColor(Color.gray);
//		        graphics.fillRect(i, i, 50, 50);   	
//		        
//	        	}
	        	
//	       for(int i = 0; i<80; i= i+20)
//	    	   {
//	    		 
//	    		   for (int e=0; e<80; e= e+20)
//	    			   {
//	    				   
//	        graphics.setColor(Color.white);
//	        graphics.fillRect(e, i, 10, 10);
//	        
//	        graphics.setColor(Color.black);
//	        graphics.fillRect((e+10), i, 10, 10);
//	        
//	    			   }
//	    		   for (int e=0; e<80; e= e+20)
//	    			   {
//	    				   
//	        graphics.setColor(Color.black);
//	        graphics.fillRect(e, (i+10), 10, 10);
//	        
//	        graphics.setColor(Color.white);
//	        graphics.fillRect((e+10), (i+10), 10, 10);
//	        
//	    			   }
//	    	   }
	        
	        
	        
	        /*        if (color == 1)
        	{
    	    graphics.setColor(Color.blue);
    	    graphics.fillRect(10, 10, 200, 100);
        	}
        else
        	{
    	    graphics.setColor(Color.red);
    	    graphics.fillRect(10, 10, 200, 100);
        	}*/
	        
//	        
//	        int [] xPoints = {60, 70, 100, 80, 90, 60, 30, 40, 20, 50};
//	        int [] yPoints = {10, 40, 40, 60, 90, 70, 90, 60, 40, 40};
//	        int nPoints = 10;
//	        graphics.setColor(Color.yellow);
//	        graphics.fillPolygon(xPoints, yPoints, nPoints);
//        
	        
//	        
//	        for (int i = 0; i < 500; i = i + 10)
//	        	{
//		        graphics.setColor(Color.green);
//		        graphics.fillRect(300, i, 50, 50);
//		        
//		        delay();
//		        if(i>=300 && i<= 390)
//		        	{
//		        		 graphics.setColor(Color.blue);
//		 		        graphics.fillRect(300, i, 50, 50);
//		        	}
//		        
//		        else
//		        	{
//		        graphics.setColor(Color.gray);
//		        graphics.fillRect(300, i, 50, 50);
//		        	}
//	        	}
			
				graphics.setColor(new Color(0,0,100));
			    graphics.fillRect(0, 600, 1000, 50);
			    
			    graphics.setColor(new Color(0,0,150));
			    graphics.fillRect(0, 650, 1000, 150);
			    
			    graphics.setColor(new Color(0,0,200));
			    graphics.fillRect(0, 800, 1000, 100);
			    
			    graphics.setColor(new Color(0,0,250));
			    graphics.fillRect(0, 900, 1000, 100);
			    
			    for (int i = 0; i < 500; i = i + 10)
		        	{
			        graphics.setColor(Color.yellow);
			        graphics.fillRect(300, i, 50, 50);
			        
			        delay();
			        if(i>=300 && i<= 390)
			        	{
			        		 graphics.setColor(Color.blue);
			 		        graphics.fillRect(300, i, 50, 50);
			        	}
			        
			        else
			        	{
			        graphics.setColor(Color.gray);
			        graphics.fillRect(300, i, 50, 50);
			        	}
				}
		}
	
	
	
	
    		public void delay()
    			{
    	        try
    					{
    					Thread.sleep(100);
    					} 
    	        catch (InterruptedException e)
    					{
    					e.printStackTrace();
    					}
    			}
    	}

	