import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class calculator{

	private JFrame frmStarCalculator;
	Double num1,num2,result;
	char operator;
	JButton BUTTON_isequalsto= new JButton("=");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmStarCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
		frmStarCalculator.setLocationRelativeTo(null);
		frmStarCalculator.getContentPane().setLayout(null);
	
		JTextField TEXTFIELD= new JTextField();
		TEXTFIELD.setFont(new Font("Berlin Sans FB", Font.ITALIC, 48));
		TEXTFIELD.setEditable(false);
		TEXTFIELD.setLocation(10, 11);
		TEXTFIELD.setSize(569, 89);
		
		JButton BUTTON_1 = new JButton("1");
		BUTTON_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEXTFIELD.setText(TEXTFIELD.getText().concat("1"));
			}
		});
		BUTTON_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_1.setFocusable(false);
		BUTTON_1.setRequestFocusEnabled(false);
		BUTTON_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_1.setBackground(new Color(153, 255, 51));
		BUTTON_1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_1.setBounds(33, 118, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_1);
		
		JButton BUTTON_2 = new JButton("2");
		BUTTON_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEXTFIELD.setText(TEXTFIELD.getText().concat("2"));
			}
		});
		BUTTON_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_2.setFocusable(false);
		BUTTON_2.setRequestFocusEnabled(false);
		BUTTON_2.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_2.setBackground(new Color(153, 255, 51));
		BUTTON_2.setBounds(140, 118, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_2);
		
		JButton BUTTON_3 = new JButton("3");
		BUTTON_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEXTFIELD.setText(TEXTFIELD.getText().concat("3"));
			}
		});
		BUTTON_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_3.setFocusable(false);
		BUTTON_3.setRequestFocusEnabled(false);
		BUTTON_3.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_3.setBackground(new Color(153, 255, 51));
		BUTTON_3.setBounds(247, 118, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_3);
		
		JButton BUTTON_add = new JButton("+");
		BUTTON_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=TEXTFIELD.getText();
				if(string.length()!=0) {
				num1=Double.parseDouble(TEXTFIELD.getText());
				operator='+';
				TEXTFIELD.setText("");
				BUTTON_isequalsto.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter a number to calculate");
				}
			}
		});
		BUTTON_add.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_add.setFocusable(false);
		BUTTON_add.setRequestFocusEnabled(false);
		BUTTON_add.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_add.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_add.setBackground(new Color(153, 255, 51));
		BUTTON_add.setBounds(354, 118, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_add);
		
		JButton BUTTON_pi = new JButton("");
		BUTTON_pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=TEXTFIELD.getText();
				if(string.length()!=0) {
				num1=Double.parseDouble(TEXTFIELD.getText());
				Double temp= num1*22/7;
				TEXTFIELD.setText(String.valueOf(temp));
				}
				else {
					num1=3.1428;
					TEXTFIELD.setText(String.valueOf(num1));
				}
			}
		});
		BUTTON_pi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_pi.setFocusable(false);
		BUTTON_pi.setRequestFocusEnabled(false);
		BUTTON_pi.setIcon(new ImageIcon(calculator.class.getResource("/images/icons8-pi-50.png")));
		BUTTON_pi.setToolTipText("");
		BUTTON_pi.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_pi.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_pi.setBackground(new Color(153, 255, 51));
		BUTTON_pi.setBounds(461, 187, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_pi);
		
		JButton BUTTON_4 = new JButton("4");
		BUTTON_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEXTFIELD.setText(TEXTFIELD.getText().concat("4"));
			}
		});
		BUTTON_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_4.setFocusable(false);
		BUTTON_4.setRequestFocusEnabled(false);
		BUTTON_4.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_4.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_4.setBackground(new Color(153, 255, 51));
		BUTTON_4.setBounds(33, 187, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_4);
		
		JButton BUTTON_5 = new JButton("5");
		BUTTON_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEXTFIELD.setText(TEXTFIELD.getText().concat("5"));
			}
		});
		BUTTON_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_5.setFocusable(false);
		BUTTON_5.setRequestFocusEnabled(false);
		BUTTON_5.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_5.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_5.setBackground(new Color(153, 255, 51));
		BUTTON_5.setBounds(140, 187, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_5);
		
		JButton BUTTON_6 = new JButton("6");
		BUTTON_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEXTFIELD.setText(TEXTFIELD.getText().concat("6"));
			}
		});
		BUTTON_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_6.setFocusable(false);
		BUTTON_6.setRequestFocusEnabled(false);
		BUTTON_6.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_6.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_6.setBackground(new Color(153, 255, 51));
		BUTTON_6.setBounds(247, 187, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_6);
		
		JButton BUTTON_subtract = new JButton("-");
		BUTTON_subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=TEXTFIELD.getText();
				if(string.length()!=0) {
				num1=Double.parseDouble(TEXTFIELD.getText());
				operator='-';
				TEXTFIELD.setText("");
				BUTTON_isequalsto.setEnabled(true);
				}
				else {
					TEXTFIELD.setText(TEXTFIELD.getText().concat("-"));
				}
			}
		});
		BUTTON_subtract.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_subtract.setFocusable(false);
		BUTTON_subtract.setRequestFocusEnabled(false);
		BUTTON_subtract.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_subtract.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_subtract.setBackground(new Color(153, 255, 51));
		BUTTON_subtract.setBounds(354, 187, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_subtract);
		
		BUTTON_isequalsto = new JButton("=");
		BUTTON_isequalsto.setEnabled(false);
		BUTTON_isequalsto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Double.parseDouble(TEXTFIELD.getText());
				switch (operator) {
					case '+':
						result=num1+num2;
						break;
					case '-':
						result=num1-num2;
						break;
					case '*':
						result=num1*num2;
						break;
					case '/':
						result=num1/num2;
						break;
				}
				BUTTON_isequalsto.setEnabled(false);
				TEXTFIELD.setText(String.valueOf(result));
				num1=result;
				
						}
		});
		BUTTON_isequalsto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_isequalsto.setFocusable(false);
		BUTTON_isequalsto.setRequestFocusEnabled(false);
		BUTTON_isequalsto.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_isequalsto.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_isequalsto.setBackground(new Color(153, 255, 51));
		BUTTON_isequalsto.setBounds(461, 118, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_isequalsto);
		
		JButton BUTTON_7 = new JButton("7");
		BUTTON_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEXTFIELD.setText(TEXTFIELD.getText().concat("7"));
			}
		});
		BUTTON_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_7.setFocusable(false);
		BUTTON_7.setRequestFocusEnabled(false);
		BUTTON_7.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_7.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_7.setBackground(new Color(153, 255, 51));
		BUTTON_7.setBounds(33, 256, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_7);
		
		JButton BUTTON_8 = new JButton("8");
		BUTTON_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEXTFIELD.setText(TEXTFIELD.getText().concat("8"));
			}
		});
		BUTTON_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_8.setFocusable(false);
		BUTTON_8.setRequestFocusEnabled(false);
		BUTTON_8.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_8.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_8.setBackground(new Color(153, 255, 51));
		BUTTON_8.setBounds(140, 256, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_8);
		
		JButton BUTTON_9 = new JButton("9");
		BUTTON_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEXTFIELD.setText(TEXTFIELD.getText().concat("8"));
			}
		});
		BUTTON_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_9.setFocusable(false);
		BUTTON_9.setRequestFocusEnabled(false);
		BUTTON_9.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_9.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_9.setBackground(new Color(153, 255, 51));
		BUTTON_9.setBounds(247, 256, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_9);
		
		JButton BUTTON_multiply = new JButton("x");
		BUTTON_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=TEXTFIELD.getText();
				if(string.length()!=0) {
				num1=Double.parseDouble(TEXTFIELD.getText());
				operator='*';
				TEXTFIELD.setText("");
				BUTTON_isequalsto.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter a number to calculate");
				}
			}
		});
		BUTTON_multiply.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_multiply.setFocusable(false);
		BUTTON_multiply.setRequestFocusEnabled(false);
		BUTTON_multiply.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_multiply.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_multiply.setBackground(new Color(153, 255, 51));
		BUTTON_multiply.setBounds(354, 256, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_multiply);
		
		JButton BUTTON_backspace = new JButton("");
		BUTTON_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=TEXTFIELD.getText();
				TEXTFIELD.setText("");int i;
				for(i=0;i<string.length()-1;i++) {
					TEXTFIELD.setText(TEXTFIELD.getText()+string.charAt(i));
				}
			}
		});
		BUTTON_backspace.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_backspace.setFocusable(false);
		BUTTON_backspace.setIcon(new ImageIcon(calculator.class.getResource("/images/del.png")));
		BUTTON_backspace.setRequestFocusEnabled(false);
		BUTTON_backspace.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_backspace.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_backspace.setBackground(new Color(153, 255, 51));
		BUTTON_backspace.setBounds(461, 256, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_backspace);
		
		JButton BUTTON_decimal_point = new JButton(".");
		BUTTON_decimal_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEXTFIELD.setText(TEXTFIELD.getText().concat("."));
			}
		});
		BUTTON_decimal_point.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_decimal_point.setFocusable(false);
		BUTTON_decimal_point.setRequestFocusEnabled(false);
		BUTTON_decimal_point.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_decimal_point.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_decimal_point.setBackground(new Color(153, 255, 51));
		BUTTON_decimal_point.setBounds(33, 325, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_decimal_point);
		
		JButton BUTTON_0 = new JButton("0");
		BUTTON_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEXTFIELD.setText(TEXTFIELD.getText().concat("0"));
			}
		});
		BUTTON_0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_0.setFocusable(false);
		BUTTON_0.setRequestFocusEnabled(false);
		BUTTON_0.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_0.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_0.setBackground(new Color(153, 255, 51));
		BUTTON_0.setBounds(140, 325, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_0);
		
		JButton BUTTON_00 = new JButton("00");
		BUTTON_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEXTFIELD.setText(TEXTFIELD.getText().concat("00"));
			}
		});
		BUTTON_00.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_00.setFocusable(false);
		BUTTON_00.setRequestFocusEnabled(false);
		BUTTON_00.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_00.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_00.setBackground(new Color(153, 255, 51));
		BUTTON_00.setBounds(247, 325, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_00);
		
		JButton BUTTON_divide = new JButton("/");
		BUTTON_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=TEXTFIELD.getText();
				if(string.length()!=0) {
				num1=Double.parseDouble(TEXTFIELD.getText());
				operator='/';
				TEXTFIELD.setText("");
				BUTTON_isequalsto.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter a number to calculate");
				}
			}
		});
		BUTTON_divide.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_divide.setFocusable(false);
		BUTTON_divide.setRequestFocusEnabled(false);
		BUTTON_divide.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_divide.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_divide.setBackground(new Color(153, 255, 51));
		BUTTON_divide.setBounds(354, 325, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_divide);
		
		JButton BUTTON_clear = new JButton("C");
		BUTTON_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TEXTFIELD.setText("");
			}
		});
		BUTTON_clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BUTTON_clear.setFocusable(false);
		BUTTON_clear.setRequestFocusEnabled(false);
		BUTTON_clear.setFont(new Font("Tahoma", Font.PLAIN, 36));
		BUTTON_clear.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 204, 0)));
		BUTTON_clear.setBackground(new Color(153, 255, 51));
		BUTTON_clear.setBounds(461, 325, 97, 58);
		frmStarCalculator.getContentPane().add(BUTTON_clear);
		frmStarCalculator.getContentPane().add(TEXTFIELD);
		frmStarCalculator.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			if(e.getKeyChar()>='0'&&e.getKeyChar()<='9') {
				TEXTFIELD.setText(TEXTFIELD.getText().concat(String.valueOf(e.getKeyChar())));
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
				String string=TEXTFIELD.getText();
				TEXTFIELD.setText("");int i;
				for(i=0;i<string.length()-1;i++) {
					TEXTFIELD.setText(TEXTFIELD.getText()+string.charAt(i));
				}
			}
			if(e.getKeyCode()==KeyEvent.VK_DELETE) {				
				TEXTFIELD.setText("");	
				}
			if(e.getKeyCode()==KeyEvent.VK_A) {				
				num1=Double.parseDouble(TEXTFIELD.getText());
				operator='+';
				TEXTFIELD.setText("");
				}
			if(e.getKeyCode()==KeyEvent.VK_D) {				
				num1=Double.parseDouble(TEXTFIELD.getText());
				operator='/';
				TEXTFIELD.setText("");
				}
			if(e.getKeyCode()==KeyEvent.VK_S) {				
				num1=Double.parseDouble(TEXTFIELD.getText());
				operator='-';
				TEXTFIELD.setText("");
				}
			if(e.getKeyCode()==KeyEvent.VK_X) {				
				num1=Double.parseDouble(TEXTFIELD.getText());
				operator='*';
				TEXTFIELD.setText("");
				}
			if(e.getKeyCode()==KeyEvent.VK_EQUALS) {
				num2=Double.parseDouble(TEXTFIELD.getText());
				switch (operator) {
					case '+':
						result=num1+num2;
						break;
					case '-':
						result=num1-num2;
						break;
					case '*':
						result=num1*num2;
						break;
					case '/':
						result=num1/num2;
						break;
				}
				TEXTFIELD.setText(String.valueOf(result));
				num1=result;
			}
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				num2=Double.parseDouble(TEXTFIELD.getText());
				switch (operator) {
					case '+':
						result=num1+num2;
						break;
					case '-':
						result=num1-num2;
						break;
					case '*':
						result=num1*num2;
						break;
					case '/':
						result=num1/num2;
						break;
				}
				TEXTFIELD.setText(String.valueOf(result));
				num1=result;
				}
			}
		});
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStarCalculator = new JFrame();
		frmStarCalculator.setFocusable(true);
		frmStarCalculator.setBackground(Color.WHITE);
		frmStarCalculator.getContentPane().setBackground(new Color(255, 153, 0));
		frmStarCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStarCalculator.setTitle("STAR CALCULATOR");
		frmStarCalculator.setBounds(100, 100, 605, 482);
		
		
	}
	
}
