import java.util.Scanner;
import javax.swing.JOptionPane;

public class Animals {
	
	public static void main(String[] args){
	
		String petName;
		String fName;
		String lName;
		String address;
		String city;
		String state;
		String zipCode;
		
		Object[] possibleValues = {"Dog", "Cat", "Bird", "Rabbit", "Other"};
		Object selectedValue = JOptionPane.showInputDialog(null, "Select animal type of patient: ", "Animal Hospital Label Creator", JOptionPane.QUESTION_MESSAGE, null, possibleValues, possibleValues[0]);
		if (selectedValue == null){
			System.exit(0);
		}
		if (selectedValue == "Other"){
			selectedValue = JOptionPane.showInputDialog("Type in the animal:");
			if (selectedValue == null){
				System.exit(0);
			}
		}
		
		petName = JOptionPane.showInputDialog("Type in the " + selectedValue + "'s name:");
		if (petName == null){
			System.exit(0);
		}
		fName = JOptionPane.showInputDialog("First name of " + petName + "'s owner:");
		if (fName == null){
			System.exit(0);
		}
		lName = JOptionPane.showInputDialog(fName + "'s last name:");
		if (lName == null){
			System.exit(0);
		}
		address = JOptionPane.showInputDialog(fName + " " + lName + "'s address:");
		if (address == null){
			System.exit(0);
		}
		city = JOptionPane.showInputDialog("Type in the city:");
		if (city == null){
			System.exit(0);
		}
		
		Object[] cityValues = {"MN", "WI", "IA", "ND", "Other"};
		Object selectedCityValue = JOptionPane.showInputDialog(null, "Select state: ", "Animal Hospital Label Creator", JOptionPane.QUESTION_MESSAGE, null, cityValues, cityValues[0]);
		
		if (selectedCityValue == "Other"){
			state = JOptionPane.showInputDialog("Type in the state:");
			if (state == null){
				System.exit(0);
			}
		}
		else{
			state = (String) selectedCityValue;
			if (state == null){
				System.exit(0);
			}
		}
		
		zipCode = JOptionPane.showInputDialog("Type in the zip code:");
		if (zipCode == null){
			System.exit(0);
		}
		
		JOptionPane.showMessageDialog(null, petName + " " + lName + "\nc/o " + fName + " " + lName + "\n" + address + "\n" + city + ", " + state + " " + zipCode + "\n\nThe world is a better place with " + selectedValue + "s", petName + "'s address label", JOptionPane.INFORMATION_MESSAGE);
		
		
	}	
}
