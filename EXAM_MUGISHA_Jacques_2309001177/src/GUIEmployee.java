
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class GUIEmployee extends JFrame {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JTextField idField;
	    private JTextField nameField;
	    private JTextField positionField;

	    private JButton insertButton;
	    private JButton viewButton;
	    private JButton updateButton;
	    private JButton deleteButton;

	    public GUIEmployee() {
	        // Set layout manager
	        setLayout(new GridLayout(5, 2));

	        // Create GUI components
	        JLabel idLabel = new JLabel("ID:");
	        idField = new JTextField();

	        JLabel nameLabel = new JLabel("Name:");
	        nameField = new JTextField();

	        JLabel positionLabel = new JLabel("Position:");
	        positionField = new JTextField();

	        insertButton = new JButton("Insert");
	        viewButton = new JButton("View");
	        updateButton = new JButton("Update");
	        deleteButton = new JButton("Delete");

	        // Add components to frame
	        add(idLabel);
	        add(idField);
	        add(nameLabel);
	        add(nameField);
	        add(positionLabel);
	        add(positionField);
	        add(insertButton);
	        add(viewButton);
	        add(updateButton);
	        add(deleteButton);

	        // Set frame properties
	        setTitle("Employee Management");
	        setSize(400, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);

	        // Add action listeners
	        insertButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                insertEmployee();
	            }
	        });

	        viewButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                viewEmployee();
	            }
	        });

	        updateButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                updateEmployee();
	            }
	        });

	        deleteButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                deleteEmployee();
	            }
	        });
	    }

	    private void insertEmployee() {
	        // Insert employee into database
	    }

	    private void viewEmployee() {
	        // View employee from database
	    }

	    private void updateEmployee() {
	        // Update employee in database
	    }

	    private void deleteEmployee() {
	        // Delete employee from database
	    }

	    public static void main(String[] args) {
	        new GUIEmployee();
	    }
	}


