package WordCounter;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class WordCounter extends JFrame {

	private JPanel contentPane;
	private JTextPane txtp, header;
	private JTextField count;
	private JScrollPane txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordCounter frame = new WordCounter();
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
	char[] txtr;
	public WordCounter() {
		long rc=1, wc=0, r=1, cc=0;
		String rs=" 1 ";
//		addComponentListener(new ComponentAdapter() {
//			@Override
//			public void componentResized(ComponentEvent e) {
//			getContentPane().setBounds(0, 0, getWidth(), getHeight());
//			txt=new JScrollPane(txtp);
//		    txt.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		    txt.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
//		    txt.setBounds(0, 0, (int) Math.round(getContentPane().getWidth()/450*437), (int) Math.round(getContentPane().getHeight()/300*250));
//		    txt.getVerticalScrollBar().setOpaque(false);
//		    txt.getHorizontalScrollBar().setOpaque(false);
//		    
//		    header.setFont(new Font("Segoe UI", Font.PLAIN, 11));
//			header.setBackground(new Color(235, 235, 235));
//			header.setForeground(new Color(125, 125, 125));
//			header.setEditable(false);
//			header.setText(rs);
//			txt.setRowHeaderView(header);
//		    
//		    count = new JTextField();
//			count.setText("Word Count: 0,        Character Count: 0");
//			count.setFont(new Font("Segoe UI", Font.PLAIN, 9));
//			count.setBounds(0, (int) Math.round(getContentPane().getHeight()/300*250), (int) Math.round(getContentPane().getWidth()/450*439), (int) Math.round(getContentPane().getHeight()/300*13));
//			count.setColumns(10);
//			
//		    System.out.println(getWidth()+" "+getHeight());
//			}
//		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7, -1, 450, 300);
		contentPane = new JPanel();
//		contentPane.addHierarchyBoundsListener(new HierarchyBoundsAdapter() {
//			@Override
//			public void ancestorResized(HierarchyEvent e) {
//			    }
//		});
		contentPane.setBounds(0, 0, getWidth(), getHeight());
		setContentPane(contentPane);
		System.out.println(getWidth()+" "+getHeight());
		contentPane.setLayout(null);
		
		txtp = new JTextPane();
		txtp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				txtr=txtp.getText().toCharArray();
				System.out.print(txtr);
				System.out.println(" "+(int) e.getKeyChar());
			}
			public void keyTyped(KeyEvent e) {
				txtr=txtp.getText().toCharArray();
				System.out.print("typed ");
				System.out.print(txtr);
				System.out.print(" "+e.getKeyChar());
				System.out.println(" \\typed");
			}
		});
		txtp.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
	    txt=new JScrollPane(txtp);
	    txt.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    txt.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	    txt.setBounds(0, 0, (int) Math.round(getContentPane().getWidth()/450*437), (int) Math.round(getContentPane().getHeight()/300*250));
	    txt.getVerticalScrollBar().setOpaque(false);
	    txt.getHorizontalScrollBar().setOpaque(false);
		
		header = new JTextPane();
		header.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		header.setBackground(new Color(235, 235, 235));
		header.setForeground(new Color(125, 125, 125));
		header.setEditable(false);
		header.setText(rs);
		txt.setRowHeaderView(header);
		
	    contentPane.add(txt);
		
		count = new JTextField();
		count.setText("Word Count: 0,        Character Count: 0");
		count.setFont(new Font("Segoe UI", Font.PLAIN, 9));
		count.setBounds(0, (int) Math.round(getContentPane().getHeight()/300*250), (int) Math.round(getContentPane().getWidth()/450*439), (int) Math.round(getContentPane().getHeight()/300*13));
		contentPane.add(count);
		count.setColumns(10);
	}
}
