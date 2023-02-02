import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
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
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Number1 ");
		lblNewLabel.setBounds(48, 60, 104, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(162, 61, 217, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 104, 217, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		JRadioButton Button1 = new JRadioButton("1Digit");
		Button1.setBounds(162, 177, 109, 23);
		contentPane.add(Button1);
		
		JRadioButton Button2 = new JRadioButton("2Digit");
		Button2.setBounds(162, 197, 109, 23);
		contentPane.add(Button2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(onedigit);
		group.add(twodigit);
		
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(89, 260, 89, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1,num2,sum=0;
				if (e.getSource()==btnok) {
					num1 = Double.parseDouble(textNumber1.getText());
					num2 = Double.parseDouble(textNumber2.getText());
					//sum = num1+num2;
					operator = (String)cmbOperator.getSelectedItem();
					if(operator.equals("+")) {
						sum = num1+num2;
					}
					if(operator.equals("-")) {
						sum = num1-num2;
					}
					if(operator.equals("*")) {
						sum = num1*num2;
					}
					if(operator.equals("/")) {
						sum = num1/num2;
					}
					DecimalFormat frmNumber = null;
					//JRadioButton
					if(onedigit.isSelected()){
						frmNumber = new DecimalFormat("#,###.0");
					}
					if(twodigit.isSelected()){
						frmNumber = new DecimalFormat("#,###.0.");
					}
					lblResult.setText(frmNumber.format(sum));
				}
				
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBounds(230, 260, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Number2");
		lblNewLabel_1.setBounds(48, 105, 104, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(162, 135, 89, 22);
		contentPane.add(comboBox);
		cmbOperator.addItem("+");
		cmbOperator.addItem("-");
		cmbOperator.addItem("*");
		cmbOperator.addItem("/");
		contentPane.add(cmbOperator);
		
		JLabel lblNewLabel_2 = new JLabel("Operator");
		lblNewLabel_2.setBounds(48, 137, 82, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblbigit = new JLabel("How to show digit");
		lblbigit.setBounds(48, 178, 114, 19);
		lblbigit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblbigit);
		
		JLabel lblNewLabel_3 = new JLabel("Result");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(184, 227, 104, 25);
		contentPane.add(lblNewLabel_3);
		
		
	}
}
