import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;


public class addLorryController implements ActionListener {
	private Model model;
	private addLorryView lorryview;
	
	public addLorryController(addLorryView lorryview, Model model) {
		this.model = model;
		this.lorryview = lorryview;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		
	if(action.equalsIgnoreCase("save")) {
			
			int kmField = Integer.parseInt(lorryview.getKilometresText());
			String seatsField = lorryview.getSeatsText();
			String brandField = lorryview.getBrandText();
			String modelField = lorryview.getModelText();
			int topSpeedField = Integer.parseInt(lorryview.getTopSpeedText());
			String reg_noField = lorryview.getReg_numberText();
			double hireRateField = Double.parseDouble(lorryview.getHireRateText());
			String load_capField = lorryview.getload_capText();
			int load_weightField = Integer.parseInt(lorryview.getload_weightText());
			
			Car car = new Car(kmField, seatsField, brandField, modelField, topSpeedField, reg_noField, hireRateField, fuelTypeField, doorsField);
			model.addCar(car);
			
			lorryview.getKilometres().setText("");
			lorryview.getSeats().setText("");
			lorryview.getBrand().setText("");
			lorryview.getModel().setText("");
			lorryview.getTopSpeed().setText("");
			lorryview.getReg_number().setText("");
			lorryview.getHireRate().setText("");
			lorryview.getload_cap().setText("");
			lorryview.getload_weight().setText("");
			
		
		}
		
		if(action.equalsIgnoreCase("Back")) {
			StaffView staffGUI = new StaffView();
			staffController staffctrler = new staffController(staffGUI, model);
			StaffView.addListeners(staffctrler);
		}
	}
		
	}
}