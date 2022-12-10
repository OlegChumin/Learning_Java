package EKIDS.Students.Mark.MakGrat;

import javax.swing.*;

class Window extends JFrame 
{
	JPanel pnl = new JPanel();
	
	public Window()
	{
		super("sample Swing");
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);
		setVisible( true );
	}

	public static void main ( String[] args )
	{
		Window gui = new Window();
	} 
}
