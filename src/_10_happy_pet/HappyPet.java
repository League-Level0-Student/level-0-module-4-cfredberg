package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 6; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your " + pet + " happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Food", "Water" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				cuddle();
			}else if (task == 1) {
				food();
			}else {
				water();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (happinessLevel >= 6) {
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	public static void cuddle() {
		JOptionPane.showMessageDialog(null, "Your pet is no longer itchy. It is very happy.");
		happinessLevel = happinessLevel + 2;
	}
	
	public static void food() {
		JOptionPane.showMessageDialog(null, "You have fed your pet. The pet loved its food.");
		happinessLevel = happinessLevel + 1;
	}
	
	public static void water() {
		JOptionPane.showMessageDialog(null, "Your pet is no longer thirsty. It is happy.");
		happinessLevel = happinessLevel + 3;
	}

}