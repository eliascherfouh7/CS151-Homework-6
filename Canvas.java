import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Rectangle;

import javax.swing.JPanel;


public class Canvas extends JPanel{
	/**
	 * Extends JPanel. The layout of the Panel is following a FlowLayout
	 */
	public Canvas(){
		super(new FlowLayout());
		this.setBounds(new Rectangle(400,400));
		this.setBackground(Color.WHITE);
	}
}
