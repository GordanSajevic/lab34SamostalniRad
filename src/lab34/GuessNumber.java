package lab34;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuessNumber {

	static int guess = 0;
	
	public static int middle(int start, int end, int number, int[] array)
	{
		return (start + end)/2;
	}
	
	public static void main(String[] args) {
		int[] array = new int[10000];
		for (int i=0; i<10000; i++)
		{
			array[i] = i+1;
		}
		int number = 34;
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		int start = 0;
		int end = 10000;
		guess = middle(start, end, number, array);
		JButton greaterButton = new JButton("Greater");
		greaterButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				guess = middle(guess, end, number, array);
			}
		});
		JButton lesserButton = new JButton("Lesser");
		lesserButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				guess = middle(start, guess, number, array);
				
			}
		});
		JButton equalButton = new JButton("Equal");
		equalButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane pane = new JOptionPane("Correct!");
				
			}
		});
		String text = "Number: " + guess;
		JLabel label = new JLabel(text);
		panel.add(label, BorderLayout.NORTH);
		panel.add(greaterButton, BorderLayout.WEST);
		panel.add(lesserButton, BorderLayout.EAST);
		panel.add(equalButton, BorderLayout.SOUTH);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(250, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
