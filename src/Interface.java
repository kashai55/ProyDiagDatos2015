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

			/**
		 * @see Swing.class
		 * @param args
		 */
		public static void main (String[] args){
			
			//button general to back
			JButton buttonBack = new JButton("Back to Menu");
			
			//frame
			JFrame frame = new JFrame("Crazy Duck");
			
			//Panel
			JPanel panel = new JPanel();
			
			//loading image
			ImageIcon img = new ImageIcon("src/fundMenu.png");
			
			//Label
			JLabel label01 = new JLabel(img);//no funciona si declara imagen despues
			
			//buttons
			JButton buttonNewGame 	= 	new JButton("New Game");
			JButton buttonStreams   =   new JButton("Streams");
			JButton buttonAdmi		=	new JButton("Administrator");
			JButton buttonOptions 	= 	new JButton("Options");
			JButton buttonCredits 	= 	new JButton("Credits");
			JButton buttonAbout 	= 	new JButton("About");
			JButton buttonExit 		= 	new JButton("Exit");
			
			
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
			panel.add(buttonOptions);
			panel.add(buttonCredits);
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
			buttonOptions.setBounds(570, 380, 100, 35);
			buttonOptions.setFont(new Font("Arial", Font.BOLD, 15));
			buttonCredits.setBounds(570, 430, 100, 35);
			buttonCredits.setFont(new Font("Arial", Font.BOLD, 15));
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
			buttonOptions.setForeground(Color.GREEN);
			buttonOptions.setBackground(Color.BLACK);
			buttonCredits.setForeground(Color.GREEN);
			buttonCredits.setBackground(Color.BLACK);
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
			
			//add event to buttonNew
			buttonNewGame.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					cronometro.main(null);
					
					
					//loading image
					ImageIcon img01 = new ImageIcon("src/fundGame.png");
					ImageIcon img02 = new ImageIcon("src/duck.png");
					
					//layouts
					JFrame frameGame = new JFrame("Game");
					JPanel panelGame = new JPanel();
					JLabel labelGame = new JLabel(img01);
					JLabel labelPato = new JLabel(img02);
					
					
					
					
					buttonBack.setBounds(15, 635, 150, 35);//position button
					buttonBack.addActionListener(new ActionListener() {
						@Override 	 
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							frameGame.setVisible(false);
							frame.setVisible(true);
						}
					});
					
					frame.setVisible(false);
					frameGame.setResizable(false);
					frameGame.add(panelGame);
					frameGame.setVisible(true);
					frameGame.setSize(1240, 720);
					
					labelGame.setBounds(-2, -2, 1240, 720);
					
					
				
					panelGame.setLayout(null);//necesario para dibujar en el panel
					panelGame.add(buttonBack);	
					panelGame.add(labelPato);
					panelGame.add(labelGame);
					
					
					panelGame.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
					
					
				    
					int x = 0;
					int y = 0;
					//timer
					Timer timer = new Timer(10000000, null);
					
					timer.setInitialDelay(100);
					
					while (x<100){
						timer.setDelay(10000);
						timer.setInitialDelay(10000);
						timer.start();
						labelPato.setBounds(x, y, 124, 100);
						x = x+1;
						y = y+1;
						
						System.out.println(timer.isRunning());
						panelGame.updateUI();
						
			            
					}
					
					
				}
			});//final event New
			
			//add event to butttonOptions
			buttonOptions.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JFrame frameOptions = new JFrame();
					JPanel panelOptions = new JPanel();
					
					JMenuBar menuBar	 = new JMenuBar();
					JMenu menuVolume	 	 = new JMenu("Volume");
					JMenuItem optionVolumeHigh = new JMenuItem("High");
					JMenuItem optionVolumeLow = new JMenuItem("Low");
					
					
					
					frame.setVisible(false);
					frameOptions.setResizable(false);
					frameOptions.add(panelOptions);
					frameOptions.setSize(1240, 720);
					frameOptions.setVisible(true);
					
					panelOptions.setLayout(null);
					panelOptions.add(buttonBack);
					panelOptions.add(menuBar);
					
					menuBar.setBounds(370, 100, 500, 100);
					menuBar.add(menuVolume);
					menuVolume.add(optionVolumeHigh);
					menuVolume.add(optionVolumeLow);
					
					//button back
					buttonBack.setBounds(100, 600, 150, 35);//position button
					buttonBack.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							frameOptions.setVisible(false);
							frame.setVisible(true);
						}
					});
					
					
					
					}
					
				
			});
			
		}//main final
		
	}

