import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class staffController implements ActionListener {
	private Model model;
	private StaffView staff;
	
	public staffController(StaffView staff, Model model) {
		this.model = model;
		this.staff  = staff;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String action = arg0.getActionCommand();
		if (action.equalsIgnoreCase("Add Customer")) {
			
			AddCustomerView customerGUI = new AddCustomerView();
			AddCustomerController customerController = new AddCustomerController(customerGUI, model);
			customerGUI.addListeners(customerController);
		}
	}
}
