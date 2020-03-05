package _06_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What is your test grade?");
		Double score1 = Double.parseDouble(score);
		if (score1 == 100) {
			JOptionPane.showMessageDialog(null, "Perfect Score!");
		}else if (score1 > 90) {
			JOptionPane.showMessageDialog(null, "Nice Job!");
		}else if (score1 > 80) {
			JOptionPane.showMessageDialog(null, "Good.");
		}else {
			JOptionPane.showMessageDialog(null, "Better Luck next time.");
		}
	}
}
