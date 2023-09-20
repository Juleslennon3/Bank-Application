import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BankApplication extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankApplication frame = new BankApplication();
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
	public BankApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		BankApplication frame = new BankApplication();
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		
		
		JMenu mnCustomer = new JMenu("Customer");
		menuBar.add(mnCustomer);
		
		JMenuItem mntmCreate = new JMenuItem("Create");
		mnCustomer.add(mntmCreate);
		
		class CreateAction implements ActionListener{
		}
		mntmCreate.addActionListener (new CreateAction());
		
		JMenuItem mntmModify = new JMenuItem("Modify");
		mnCustomer.add(mntmModify);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mnCustomer.add(mntmDelete);
		
		JMenuItem mntmCustomerAccount = new JMenuItem("CustomerAccount");
		mnCustomer.add(mntmCustomerAccount);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

	
	}

}
