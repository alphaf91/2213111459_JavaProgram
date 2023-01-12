import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TempConversion extends JFrame{
	
	private JLabel celsiusLabel;
	private JLabel fathrenheitLabel;
	
	private JTextField celsiusTF;
	private JTextField fathrenheitTF;
	
	private static final int WIDTH = 500;
	private static final int HEIGHT = 100;
	private static final double FTOC = 5.0/9.0;
	private static final double CTOF = 9.0/5.0;
	private static final double OFFSET = 32;
	
	
	public TempCoversion() {
		setTitle("Temperature Conversion");
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,4));
		
		celsiusLabel = new JLabel("Temp in Celsius: ");
		fathrenheitLabel = new JLabel("Temp in Fahrenheit: ");
		
		celsiusTF = new JTextField(10);
		fathrenheitTF = new JTextField(10);
		
		c.add(celsiusLabel);
		c.add(celsiusTF);
		c.add(fathrenheitLabel);
		c.add(fathrenheitTF);
		
		
		CelsHandler celsiusHandler = new CelsHandler();
		celsiusTF.addActionListener(celsiusHandler);
		
		FahrHandler fahrenheitHandle = new FahrHandler();
		fathrenheitTF.addActionListener(fahrenheitHandler);
		
		setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        CenteredFrame(this);
        

	}
	
	public void CenteredFrame(javax.swing.JFrame objFrame){
		Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
		int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
		int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
		objFrame.setLocation(iCoordX, iCoordY);
		}
	
	private class CelsHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celsius,fahenheit;
			celsius = Double.parseDouble(celsiusTF.getText());
			fahenheit = celsius * CTOF + OFFSET;
			fathrenheitTF.setText(String.format("%.2f",fahenheit));			
		}
	}
	private class FahrHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celsius,fahenheit;
			fahenheit = Double.parseDouble(fathrenheitTF.getText());
			celsius = (fahenheit-OFFSET) * CTOF + OFFSET;
			celsiusTF.setText(String.format("%.2f",celsius));			
		}
	}


	public static void main(String[] args) {
		TempConversion tempConv = new TempConversion();

	}

}
