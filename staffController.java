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
		
		
		 if (action.equalsIgnoreCase("Add Car")){
			addCarView addCarGUI = new addCarView();
			AddCarController carCntrl = new AddCarController(addCarGUI, model);
			addCarGUI.addListeners(carCntrl);
		}
		 
		 if (action.equalsIgnoreCase("Add Minibus")){
				addMinibusView addMinibusGUI = new addMinibusView();
				addMinibusController minibusCntrl = new addMinibusController(addMinibusGUI, model);
				addMinibusGUI.addListeners(minibusCntrl);
			}
		 
		 if (action.equalsIgnoreCase("Add Lorry")){
				addLorryView addLorryGUI = new addLorryView();
				addLorryController lorryCntrl = new addLorryController(addLorryGUI, model);
				addLorryGUI.addListeners(lorryCntrl);
			}
		 
	}
}
