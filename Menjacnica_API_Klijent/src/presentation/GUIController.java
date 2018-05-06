package presentation;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import logic.LogicController;

public class GUIController {

	public static LogicController lc = new LogicController();
	public static MainWindow mw;
	
	public static void exit() {
		int opcija = JOptionPane.showConfirmDialog(null, "Da li zelite da izadjete?", "Izlaz",
				JOptionPane.YES_NO_CANCEL_OPTION);
		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
