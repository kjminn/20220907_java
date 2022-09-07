package test.combo;

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboTest extends JFrame implements ItemListener{
	String[] itemsMeal = {"갈비탕", "초밥", "스테이크", "칼국수", "쌀국수"};
	String[] itemsDrink = {"콜라", "웰치스", "사이다", "쉐이크"};
	JComboBox<String> comboMeal, comboDrink;
	JLabel imgMeal, imgDrink;
	
	public JComboTest() {
		JPanel panN = new JPanel();
		JPanel panC = new JPanel(new GridLayout(1, 2, 30, 50));
		
		JLabel lblMeal = new JLabel("식사: ");
		JLabel lblDrink = new JLabel("음료: ");
		ImageIcon iconMeal = new ImageIcon("imgs/meal0.jpg");
		ImageIcon iconDrink = new ImageIcon("imgs/drink0.jpg");
		imgMeal = new JLabel(iconMeal);
		imgDrink = new JLabel(iconDrink);
		
		comboMeal = new JComboBox<String>(itemsMeal);
		comboDrink = new JComboBox<String>(itemsDrink);
		
		comboMeal.addItemListener(this);
		comboDrink.addItemListener(this);
		
		panN.add(lblMeal);panN.add(comboMeal);panN.add(lblDrink);panN.add(comboDrink);
		panC.add(imgMeal);panC.add(imgDrink);
		
		add("North", panN);
		add("Center", panC);
		
		setTitle("JComboBox 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 150, 500, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JComboTest();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JComboBox targetCombo=(JComboBox)e.getSource();
		int imgNum = 0;
		ImageIcon icon = null;
		if(targetCombo == comboMeal) {
			imgNum = comboMeal.getSelectedIndex();
			icon = new ImageIcon("imgs/meal"+imgNum+".jpg");
			imgMeal.setIcon(icon);
		}else {
			imgNum = comboDrink.getSelectedIndex();
			icon = new ImageIcon("imgs/drink"+imgNum+".jpg");
			imgDrink.setIcon(icon);
		}
	}

}









