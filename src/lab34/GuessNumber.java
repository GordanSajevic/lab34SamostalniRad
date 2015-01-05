package lab34;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Samostalni rad

public class GuessNumber {

	static JButton greaterButton;
	static JButton lesserButton;
	static JButton equalButton;
	static JTextField text;
	static JLabel label;
	static int[] array = new int[10000];
	static int start;
	static int mid;
	static int end;
	static int counter;
	
	
	public static void main(String[] args) {
		for (int i=0; i<10000; i++)
		{
			array[i] = i+1;
		}
		counter = 1;
		start = 0;
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		start = 0;
		end = array.length - 1;
		mid = (start + end) / 2;
		greaterButton = new JButton("Greater");
		lesserButton = new JButton("Lesser");
		equalButton = new JButton("Equal");
		text = new JTextField("Number: " + mid);
		text.setEnabled(false);
		text.setHorizontalAlignment(JTextField.CENTER);
		panel.setLayout(new FlowLayout());
		panel.add(text);
		panel.add(greaterButton);
		panel.add(lesserButton);
		panel.add(equalButton);
		frame.add(panel);
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		ButtonHandler handler = new ButtonHandler();
		greaterButton.addActionListener(handler);
		lesserButton.addActionListener(handler);
		equalButton.addActionListener(handler);
	}
	
	public static class ButtonHandler implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(lesserButton))
			{
				end = mid - 1;
				mid = (start + end)/2;
				text.setText("Number: " + mid);
			}
			if(e.getSource().equals(greaterButton))
			{
				start = mid + 1;
				mid = (start + end)/2;
				text.setText("Number: " + mid);
			}
			if (e.getSource().equals(equalButton))
			{
				JOptionPane pane = new JOptionPane("Congratulations!");
			}
			
		}
		
	}

}
