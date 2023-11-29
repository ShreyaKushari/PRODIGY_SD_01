package temperature_Converter;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TemperatureConverter {
	
	
	//declaring GUI elements
	public static JFrame frmMain;
	public static JLabel lblCelsius;
	public static JTextField textCelsius;
	public static JLabel lblFahrenheit;
	public static JTextField textFahrenheit;
	public static JLabel lblKelvin;
	public static JTextField textKelvin;
	
	public static JButton btnCalculateCtoF;
	public static JButton btnCalculateCtoK;
	public static JButton btnCalculateFtoC;
	public static JButton btnCalculateFtoK;
	public static JButton btnCalculateKtoF;
	public static JButton btnCalculateKtoC;
	
	public static void main(String[] args) {
		
		//set up frame
		frmMain = new JFrame("Temperature Convertor");
		frmMain.setSize(150,200);
		frmMain.setLayout(new FlowLayout());
		
		//create GUI elements
		lblCelsius = new JLabel("Celcius");
		textCelsius = new JTextField(10);
		lblFahrenheit = new JLabel("Fahrenheit");
		textFahrenheit = new JTextField(10);
		lblKelvin = new JLabel("Kelvin");
		textKelvin = new JTextField(10);
		
		
		//Celsius --> Fahrenheit
		btnCalculateCtoF = new JButton("Calculate C to F");
		
		btnCalculateCtoF.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String cText = textCelsius.getText();
						double c = Double.parseDouble(cText);
						double f = (c*9/5)+32;
						textFahrenheit.setText(String.valueOf(f));
					}
				}
				);
		
		//Celsius --> Kelvin
		btnCalculateCtoK = new JButton("Calculate C to K");
		
		btnCalculateCtoK.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String cText = textCelsius.getText();
						double c = Double.parseDouble(cText);
						double K = c+273;
						textKelvin.setText(String.valueOf(K));
					}
				}
				);
		
		
		//Fahrenheit --> Celsius
		btnCalculateFtoC = new JButton("Calculate F to C");
		
		btnCalculateFtoC.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String fText = textFahrenheit.getText();
						double f = Double.parseDouble(fText);
						double c = (f-32)*5/9;
						textCelsius.setText(String.valueOf(c));
					}
				}
				);
		
		//Fahrenheit --> Kelvin
		btnCalculateFtoK = new JButton("Calculate F to K");
		
		btnCalculateFtoK.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String fText = textFahrenheit.getText();
						double f = Double.parseDouble(fText);
						double K =(f - 32)*5/9 + 273;
						textKelvin.setText(String.valueOf(K));
					}
				}
				);
		
		//Kelvin --> Celsius
		btnCalculateKtoC = new JButton("Calculate K to C");
		
		btnCalculateKtoC.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String kText = textKelvin.getText();
						double k = Double.parseDouble(kText);
						double c =k-273;
						textCelsius.setText(String.valueOf(c));
					}
				}
				);
		
		
		//Kelvin --> Fahrenheit
		btnCalculateKtoF = new JButton("Calculate K to F");
		
		btnCalculateKtoF.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String kText = textKelvin.getText();
						double k = Double.parseDouble(kText);
						double f =(k - 273)*9/5 + 32;
						textFahrenheit.setText(String.valueOf(f));
					}
				}
				);
		
		
		
		//add GUI elements to the frame
		frmMain.add(lblCelsius);
		frmMain.add(textCelsius);
		frmMain.add(lblFahrenheit);
		frmMain.add(textFahrenheit);
		frmMain.add(lblKelvin);
		frmMain.add(textKelvin);
		frmMain.add(btnCalculateCtoF);
		frmMain.add(btnCalculateFtoC);
		frmMain.add(btnCalculateCtoK);
		frmMain.add(btnCalculateFtoK);
		frmMain.add(btnCalculateKtoC);
		frmMain.add(btnCalculateKtoF);
		
		
		//make the frame visible
		frmMain.setVisible(true);
	}

}
