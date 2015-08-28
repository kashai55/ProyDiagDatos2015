import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




	/**
	 * The Interface program contains simple and 
	 * necessary complements to form a window.
	 * @author Fallas G.
	 * @version 1.3
	 */
public class Interface {
	//creating components
	
	//button general to back
	static JButton buttonBack = new JButton("Back to Menu");

	//Frame 
	static JFrame frame = new JFrame("Crazy Duck");
	
	//Panel 
	static JPanel panel = new JPanel();
	
	//loading image
	static ImageIcon img = new ImageIcon("src/fundMenu.png");
	
	//Label
	static JLabel label01 = new JLabel(img);//no funciona si declara imagen despues
	
	//buttons
	static JButton buttonNewGame 	= 	new JButton("New Game");
	static JButton buttonStreams   	=   new JButton("Streams");
	static JButton buttonAdmi		=	new JButton("Administrator");
	static JButton buttonAbout 		= 	new JButton("About");
	static JButton buttonExit 		= 	new JButton("Exit");

		/**
		 * The main method executes all the components with 
		 * established options like size, color, text and position
		 * @see Swing.class
		 * @param args
		 * @return the frame with various added components showing 
		 * in the game window interface and menu
		 */
		public static void main (String[] args){
			ReadXMLFile xml = new ReadXMLFile();
			xml.readXml("RESIST");
			
			//panel add to frame
			frame.add(panel);	
			
			//options frame
			frame.setSize(1240, 720);
			frame.setResizable(false);
			frame.setVisible(true);
			
			//components add to panel
			panel.add(buttonNewGame);
			panel.add(buttonStreams);
			panel.add(buttonAdmi);
			panel.add(buttonAbout);
			panel.add(buttonExit);
			panel.add(label01);
			
			//set Label contain image
			label01.setBounds(-2, -2, 1240, 720);
			
			//option panel
			panel.setBackground(Color.lightGray);
			panel.setVisible(true);
			panel.setLayout(null);
			panel.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
			
			//position and option buttons
			buttonNewGame.setBounds(800, 235, 125, 35);
			buttonNewGame.setFont(new Font("Arial", Font.BOLD, 15));
			buttonStreams.setBounds(680, 315, 150, 35);
			buttonStreams.setFont(new Font("Arial", Font.BOLD, 15));
			buttonAdmi.setBounds(900, 315, 150, 35);
			buttonAdmi.setFont(new Font("Arial", Font.BOLD, 15));
			buttonAbout.setBounds(570, 480, 100, 35);
			buttonAbout.setFont(new Font("Arial", Font.BOLD, 15));
			buttonExit.setBounds(570, 530, 100, 35);
			buttonExit.setFont(new Font("Arial", Font.BOLD, 15));
			
			//colors buttons
			buttonNewGame.setForeground(Color.GREEN);
			buttonNewGame.setBackground(Color.BLACK);
			buttonAdmi.setForeground(Color.GREEN);
			buttonAdmi.setBackground(Color.BLACK);
			buttonStreams.setForeground(Color.GREEN);
			buttonStreams.setBackground(Color.BLACK);
			buttonAbout.setForeground(Color.GREEN);
			buttonAbout.setBackground(Color.BLACK);
			buttonExit.setForeground(Color.RED);
			buttonExit.setBackground(Color.BLACK);
		
		
			
			//*******************Final Menu*************************
				
			
			//add event to buttonExit
			buttonExit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					//frame.dispose(); 
					System.exit(0);
						
				}
			}); //final event Exit
			
			//add event to buttonAbout
			buttonAbout.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//creating components
					JFrame frameAbout = new JFrame("About");
					JPanel panelAbout = new JPanel();
					
					//String it contains as play
					String String = "hola mundo ";
						    
					//Label shows the String
					JLabel textAbout = new JLabel(String);
					

					//option components
					frame.setVisible(false);
					frameAbout.setVisible(true);
					frameAbout.setResizable(false);
					frameAbout.setSize(1240, 720);
					panel.setLayout(null);
					
					textAbout.setFont(new Font("Arial", 21, 21));
					textAbout.setSize(500, 500);
					textAbout.setBackground(Color.RED);
					textAbout.setForeground(Color.WHITE);
					
					
					
					//add all components
					frameAbout.add(panelAbout);
					panelAbout.add(textAbout);
					panelAbout.add(buttonBack);
					
					//event buttonBack
					buttonBack.addActionListener(new ActionListener() {
						@Override 	 
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							//close frame
							frameAbout.dispose();
							frame.setVisible(true);
						}
					});//final event buttonBack
				}
			});//final event buttonAbout
			
			
			//add event to buttonNewGame
			buttonNewGame.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new VentanaJuego();
				}
			});//final event buttonNewGame
			
		
		}//main final
		
	}

