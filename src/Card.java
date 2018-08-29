import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Card extends JLabel
{
	public String closeImg = "D:/Eclipse_Projects/FindMatch/box.png";
	public String openImg = "";
	public boolean isOpen = false;
	public int cardNo = 0;
	
	public Card(int cardNo)
	{
		this.cardNo = cardNo;
		this.openImg = "D:/Eclipse_Projects/FindMatch/"+cardNo+".png";
		isOpen = true;
		setHorizontalAlignment(SwingConstants.CENTER);
		setVerticalAlignment(SwingConstants.CENTER);
		drawCard();
	}
	
	public void drawCard()
	{
		if(isOpen)
			setIcon(new ImageIcon(openImg));
		else
			setIcon(new ImageIcon(closeImg));
		
		repaint();
	}
}
