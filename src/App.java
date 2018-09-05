import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class App extends JFrame {

	private JPanel contentPane;

	Card[] cards = new Card[16];
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 4, 33, 33));
		setCards();
		
		pack();
		setLocationRelativeTo(null);
		
	}
	
	void setCards()
	{
		for (int i = 0; i < 16 ; i++) 
		{
			cards[i] = new Card(i % 8);
			getContentPane().add(cards[i]);
		}
	}

}
