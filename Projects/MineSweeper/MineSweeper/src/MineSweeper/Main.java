package MineSweeper;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Main extends JPanel {
	
	static int scale = 30;
	static int XSize = scale * 10;
	static int YSize = scale * 10;
	static int XSquares = 10;
	static int YSquares = 10;
	static int Mines = 10;
	static int spacing = 2;
	static int clickcount = 0;
	static long totalCells;
	static boolean gameOver = false, win = false/*, AI = false*/;
	
	static Main M;
	static MineSweeper MS;
	static int[][] map;
	static int[][] clickedOn;
	
//	static AI ai;
	
	public Main() {
		setPreferredSize(new Dimension(YSize, XSize));
		setBackground(Color.white);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame input = new JFrame();
		input.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		input.setTitle("Enter Dimensions");
		input.setPreferredSize(new Dimension(200, 175/*200*/));
		input.setResizable(false);
		
		JPanel textfields = new JPanel(new SpringLayout());
		JLabel textfieldslabel = new JLabel("Enter the Dimensions: ");
		textfieldslabel.setFont(new Font("Monaco", Font.BOLD, 16));
		input.add(textfieldslabel, BorderLayout.NORTH);
		textfieldslabel.setLabelFor(textfields);
		JTextField XInput = new JTextField(10);
		JLabel XLabel = new JLabel("X: ");
		textfields.add(XLabel);
		XLabel.setLabelFor(XInput);
		textfields.add(XInput);
		JTextField YInput = new JTextField(10);
		JLabel YLabel = new JLabel("Y: ");
		textfields.add(YLabel);
		YLabel.setLabelFor(YInput);
		textfields.add(YInput);
		JTextField mineinput = new JTextField(10);
		JLabel mineinputlabel = new JLabel("Mine Count: ");
		textfields.add(mineinputlabel);
		YLabel.setLabelFor(mineinput);
		textfields.add(mineinput);
//		JCheckBox aicheckbox = new JCheckBox();
//		JLabel ailabel = new JLabel("AI?: ");
//		textfields.add(ailabel);
//		YLabel.setLabelFor(aicheckbox);
//		textfields.add(aicheckbox);
		
		SpringUtilities.makeCompactGrid(textfields,
                3/*4*/, 2, //rows, cols
                6, 6,        //initX, initY
                6, 6);       //xPad, yPad
		
		input.add(textfields, BorderLayout.CENTER);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent evt) {
		        // do everything here...
		    	if (XInput.getText() != null) {
		    		try {
		    			XSquares = Integer.parseInt(XInput.getText().length() > 4 ? XInput.getText().substring(0, 4) : XInput.getText());
		    		}catch(NumberFormatException e) {
		    			
		    		}
		    	}
		    	if (YInput.getText() != null) {
		    		try {
		    			YSquares = Integer.parseInt(YInput.getText().length() > 4 ? YInput.getText().substring(0, 4) : YInput.getText());
		    		}catch(NumberFormatException e) {
		    			
		    		}
		    	}
		    	if (mineinput.getText() != null) {
		    		try {
		    			Mines = Integer.parseInt(mineinput.getText().length() > 4 ? mineinput.getText().substring(0, 4) : mineinput.getText());
		    			Mines = Math.min(Mines, XSquares * YSquares);
		    		}catch(NumberFormatException e) {
		    			
		    		}
		    	}
		    	else
		    		Mines = XSquares * YSquares / 10;
//		    	AI = aicheckbox.isSelected();
		    	XSize = XSquares * scale;
		    	YSize = YSquares * scale;
		    	input.dispose();
		    }
		});;
		input.add(submit, BorderLayout.SOUTH);
		input.getRootPane().setDefaultButton(submit);
		
		windowListener WL = new windowListener();
		input.addWindowListener(WL);
		
		input.pack();
		input.setLocationRelativeTo(null);
		input.setVisible(true);
		Dimension idim = Toolkit.getDefaultToolkit().getScreenSize();
		int iw = input.getSize().width;
		int ih = input.getSize().height;
		int ix = (idim.width - iw) / 2;
		int iy = (idim.height - ih) / 2;
		
		input.setLocation(ix, iy);
		
		try {
			WL.sem.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JFrame F = new JFrame();
		M = new Main();
		mouseListener ML = new mouseListener();
		F.addMouseListener(ML);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F.setTitle("MineSweeper");
		F.add(M, BorderLayout.CENTER);
		F.setResizable(false);
		F.pack();
		F.setLocationRelativeTo(null);
		F.setVisible(true);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int w = F.getSize().width;
		int h = F.getSize().height;
		int x = (dim.width - w) / 2;
		int y = (dim.height - h) / 2;
		
		F.setLocation(x, y);
		
		MS = new MineSweeper(XSquares, YSquares, Mines);
		
//		ai = new AI(XSquares, YSquares);
//		ai.calculate();
//		
//		ML.winCondition();
		M.repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(new Font("Monaco", Font.BOLD, 16));
		
		for (int i = 0; i < XSquares; i ++) {
			for (int j = 0; j < YSquares; j ++) {
				if (clickedOn != null) {
					switch (clickedOn[i][j]) {
					case 0:
						g.setColor(new Color(175, 175, 175));
						break;
					case 1:
						g.setColor(new Color(225, 225, 225));
						break;
					case 2:
						g.setColor(new Color(150, 50, 50));
						break;
					case 3:
						g.setColor(new Color(0, 0, 0));
						break;
					}
				}
				else 
					g.setColor(new Color(175, 175, 175));
				
				if (win)
					g.setColor(new Color(0, 175, 0));
				if (clickedOn != null && clickedOn[i][j] == 3)
					g.setColor(new Color(0, 0, 0));
					
				g.fillRect(j * scale + spacing, i * scale + spacing, scale - spacing * 2, scale - spacing * 2);
				if (clickedOn != null && clickedOn[i][j] == 1 && map[i][j] >= 1) {
					g.setColor(Color.BLACK);
					g.drawString(String.valueOf(map[i][j]), 
							(j + 1) * scale - spacing - 1 
							- (scale - spacing * 2) / 2 
							- (g.getFontMetrics().stringWidth(String.valueOf(map[i][j]))) / 2, 
							(i + 1) * scale - spacing - 1 
							- (scale - spacing * 2) / 2 
							+ (g.getFontMetrics().getHeight()) / 4);
				}
			}
		}
		
	}

}
