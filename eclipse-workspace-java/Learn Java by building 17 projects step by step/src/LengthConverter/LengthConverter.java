package LengthConverter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class LengthConverter extends JFrame {

	private JPanel contentPane;
	private JTextField v1;
	private JTextField v2;
	private JComboBox<String> type1;
	private JComboBox<String> type2;
	
	private long[] rates=new long[] {1, 1000, 1000000, 10000000, 1000000000, 1000000000000L, 25400000, 304800000, 914400000, 1609344000000L, 1852000000000L};
	private String[] names=new String[] {"Nanometres", "Microns", "Millimetres", "Centimetres", "Metres", "Kilometres", "Inches", "Feet", "Yards", "Miles", "Nautical Miles"};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LengthConverter frame = new LengthConverter();
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
	public LengthConverter() {
		setTitle("Length Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7, -1, 400, 250);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBounds(-7, -1, 400, 250);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Clear = new JButton("Clear");
		Clear.setOpaque(false);
		Clear.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v1.setText("0");
				v2.setText("0");
			}
		});
		Clear.setBounds(150, 160, 89, 23);
		contentPane.add(Clear);
		
		v1 = new JTextField();
		v1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if ((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') || e.getKeyChar()==8 || e.getKeyChar()==127) {
					v1.setEditable(true);
					if (v1.getText().contentEquals("")) v1.setText("0");
					convert(rates[type1.getSelectedIndex()], rates[type2.getSelectedIndex()], Long.parseLong(v1.getText()), v2);
	            } else 
	            	v1.setEditable(false);
			}
		});
		v1.setOpaque(false);
		v1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		v1.setText("0");
		v1.setBounds(216, 36, 141, 20);
		contentPane.add(v1);
		v1.setColumns(10);
		
		v2 = new JTextField();
		v2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if ((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') || e.getKeyChar()==8 || e.getKeyChar()==127) {
					v2.setEditable(true);
					if (v2.getText().contentEquals("")) v2.setText("0");
					convert(rates[type2.getSelectedIndex()], rates[type1.getSelectedIndex()], Long.parseLong(v2.getText()), v1);
	            } else 
	            	v2.setEditable(false);
			}
		});
		v2.setOpaque(false);
		v2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		v2.setText("0");
		v2.setBounds(216, 96, 141, 20);
		contentPane.add(v2);
		v2.setColumns(10);
		
		type1 = new JComboBox(names);
		type1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convert(rates[type1.getSelectedIndex()], rates[type2.getSelectedIndex()], Long.parseLong(v1.getText()), v2);
			}
		});
		type1.setOpaque(false);
		type1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		type1.setBounds(31, 35, 141, 22);
		contentPane.add(type1);
		
		type2 = new JComboBox(names);
		type2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convert(rates[type2.getSelectedIndex()], rates[type1.getSelectedIndex()], Long.parseLong(v2.getText()), v1);
			}
		});
		type2.setOpaque(false);
		type2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		type2.setBounds(31, 95, 141, 22);
		contentPane.add(type2);
	}
	
	public void convert(long ths, long tht, long thstf, JTextField thttf) {
		BigDecimal a=new BigDecimal(thstf), b=new BigDecimal(ths), c=new BigDecimal(tht);
		thttf.setText(a.multiply(b.divide(c, 6, RoundingMode.HALF_EVEN)).toString());
	}
	
}
