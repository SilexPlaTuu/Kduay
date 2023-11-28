package lol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class lolo extends JFrame //implements ChangeListener 
{

	private JPanel contentPane;
	JLabel lS2 = new JLabel("x2");
	JLabel lText2 = new JLabel("2");
	JLabel lS1 = new JLabel("x1");
	JLabel lText1 = new JLabel("1");
	JSlider s1 = new JSlider(0,24);
	JSlider s = new JSlider(0,24);
	private final JLabel lCenter = new JLabel("30");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lolo frame = new lolo();
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
	public lolo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 46, 0, 200, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 40, 34, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		GridBagConstraints gbc_lCenter = new GridBagConstraints();
		gbc_lCenter.insets = new Insets(0, 0, 5, 5);
		gbc_lCenter.gridx = 3;
		gbc_lCenter.gridy = 0;
		panel.add(lCenter, gbc_lCenter);
		
		
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lText1, gbc_lblNewLabel_1);
		
		
		GridBagConstraints gbc_slider = new GridBagConstraints();
		gbc_slider.insets = new Insets(0, 0, 5, 5);
		gbc_slider.gridx = 3;
		gbc_slider.gridy = 1;
		panel.add(s, gbc_slider);
		s.setValue(18);
		s.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				lS1.setText("value of Slider is =" + s.getValue());
				s1.setValue(Math.abs(30-s.getValue()));
				lS2.setText("value of Slider is =" + s1.getValue());
				
			}
		});
		s.setMajorTickSpacing(4);
		s.setMinorTickSpacing(1);
		s.setPaintTrack(true);
		s.setPaintTicks(true);
		s.setPaintLabels(true);
		
		
		
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 1;
		panel.add(lS1, gbc_lblNewLabel_2);
		lS1.setText("value of Slider is =" + s.getValue());
		
		
		GridBagConstraints g = new GridBagConstraints();
		g.insets = new Insets(0, 0, 0, 5);
		g.gridx = 1;
		g.gridy = 2;
		panel.add(lText2, g);
		
		
		GridBagConstraints gbc_slider_1 = new GridBagConstraints();
		gbc_slider_1.insets = new Insets(0, 0, 0, 5);
		gbc_slider_1.gridx = 3;
		gbc_slider_1.gridy = 2;
		panel.add(s1, gbc_slider_1);
		s1.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				lS2.setText("value of Slider is =" + s1.getValue());
				s.setValue(Math.abs(30-s1.getValue()));
				lS1.setText("value of Slider is =" + s.getValue());
			
			}
		});
		s1.setMajorTickSpacing(4);
		s1.setMinorTickSpacing(1);
		s1.setPaintTrack(true);
		s1.setPaintTicks(true);
		s1.setPaintLabels(true);
		
		
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridx = 4;
		gbc_lblNewLabel_3.gridy = 2;
		panel.add(lS2, gbc_lblNewLabel_3);
		lS2.setText("value of Slider is =" + s1.getValue());
	}


	
}