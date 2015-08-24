import java.awt.Color;
	import java.awt.Cursor;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;



	/**
	 * 
	 * @author Gustavo F.
	 * @version 17 August, 2015
	 *
	 */
public class Interface {
	
	//button general to back
	static JButton buttonBack = new JButton("Back to Menu");
	
	//frame
	static JFrame frame = new JFrame("Crazy Duck");
	
	//Panel
	static JPanel panel = new JPanel();
	
	//loading image
	static ImageIcon img = new ImageIcon("src/fundMenu.png");
	
	//Label
	static JLabel label01 = new JLabel(img);//no funciona si declara imagen despues
	
	//buttons
	static JButton buttonNewGame 	= 	new JButton("New Game");
	static JButton buttonStreams   =   new JButton("Streams");
	static JButton buttonAdmi		=	new JButton("Administrator");
	static JButton buttonAbout 	= 	new JButton("About");
	static JButton buttonExit 		= 	new JButton("Exit");

			/**
		 * @see Swing.class
		 * @param args
		 */
		public static void main (String[] args){

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
			
			//option buttons
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
			
			
			//add event to buttonNewGame
			buttonNewGame.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					VentanaJuego Ven;
					Ven= new VentanaJuego();
				}
			});//final event New
			
			//add event to butttonOptions
			
		}//main final
		
	}

