import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Insets;
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
					String String = 
					"*Inicie una nueva partida en New Game" + "*Si desea hacer cambios en la configuracion" 				+ "\n"
					+ " del juego como, ver las partidas de los jugadores, eliminar jugador entre otras," 					+ "\n"
					+ " ingrese como Administrador."																		+ "\n"
					+ "*Si desea ver una partida online ingrese su usuario como Streams" 									+ "\n"
					+ "*Usted debera disparar con el cursor dando cli a los patos en pantalla, se le sumara" 				+ "\n"
					+ "  puntos; esto depende del pato al que dispare, asi los diferentes tipos de patos son:" 				+ "\n"
					+ "-Pato salvaje: rápidos y comunes, mueren con una bala y su puntuación es de 1. Su color es Negro." 	+ "\n"
					+ "-Pato colorado: son rápidos y fuertes, dan 2 puntos y aguantan hasta 5 balas. Su color es Azul."	 	+ "\n"
					+ "-Tarro canelo: son lento y extremadamente fuertes, aportan 5 puntos, su vida se calcula" 			+ "\n"
					+ "  aleatoriamente con una distribución normal con una media de 30. Su color es Amarillo." 			+ "\n"
					+ "-Yaguasa piquirrojo: son el doble de rápidos que el pato colorado, con una bala mueren y" 			+ "\n"
					+ "dan 25 puntos, su vida dura 25 segundos, en el caso de que no le dispare resta 5 del jugador."  		+ "\n"
					+ " Su color es Rojo." 																					+ "\n"
					+ "-Ganso de Hawai: son rápidos y muy agiles, dan 10 puntos y son débiles con 2 balas ya caen." 		+ "\n"
					+ "Su color es Verde" 																					+ "\n" + "\n"
					+ "Al iniciar una partida los patos aparecerán cada 10 segundos aleatoriamente, el juego avanza de" 	+ "\n"
					+ "nivel al minuto treinta o cuando ya no haya ningún pato en la pantalla, al subir de nivel la" 		+ "\n"
					+ "velocidad de aparición  de los patos va aumentado, el pato salvaje bajara su probabilidad de " 		+ "\n"
					+ "aparición un 4%, mientras que los demás aumentara un 1%." 											+ "\n"
					+ "El juego termina cuando hay más de 20 patos en la pantalla." 										+ "\n"
					;
						    
					//Label shows the String
					JTextArea textAbout = new JTextArea(String);
					

					//option components
					frame.setVisible(false);
					frameAbout.setVisible(true);
					frameAbout.setResizable(false);
					frameAbout.setSize(1240, 720);
					panelAbout.setBackground(Color.BLACK);
					panelAbout.setLayout(null);
					
					textAbout.setEditable(false);
					textAbout.setFont(new Font("Arial", 21, 21));
					textAbout.setMargin(new Insets(20, 35, 10, 100));
					textAbout.setColumns(10);
					textAbout.setBounds(100, 20, 1000, 580);
					//different methods to change color
					textAbout.setBackground(new Color(50, 50, 50));
					textAbout.setForeground(Color.GREEN);
					
					//add all components
					frameAbout.add(panelAbout);
					panelAbout.add(textAbout);
					panelAbout.add(buttonBack);
					
					//event buttonBack
					
					buttonBack.setBounds(545, 620, 150, 50);
					buttonBack.setBackground(new Color(45, 45, 45));
					buttonBack.setForeground(new Color(45, 255, 45));
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

