package smartphone;
import java.util.Scanner;
import java.util.Random;

public class smartphoneTesting {
	public static void main(String args[]) {
		
		
		Random random = new Random();
		double initialCharge = random.nextDouble() * 10 + 1;
		System.out.println("Cellulofono Mi13ProMaxPlus");
		Smartphone celluloPhono = new Smartphone(initialCharge);
		System.out.println("Credito residuo: € " + (Math.round(celluloPhono.getRecharge() * 100.0) / 100.0) + "\n");
		System.out.println("1. Ricarica");
		System.out.println("2. Chiama");
		System.out.println("3. Traffico residuo");
		System.out.println("4. Azzera le chiamate");
		System.out.println("5. Visualizza il numero di chiamate effettuate");
		System.out.println("6. Spegni il telefono (Modalità Zen)");
		
		int select;
		boolean exit = false;
		do {
			double charge;
			System.out.println("Cosa vuoi fare?");
			Scanner input = new Scanner(System.in);
			select = input.nextInt();
			switch(select) {
				case 1:
					System.out.println("Scegliere l'importo della ricarica: ");
					Scanner chargeInput = new Scanner(System.in);
					charge = chargeInput.nextDouble();
					celluloPhono.recharge(charge);
					celluloPhono.number404();
					break;
				
				case 2:
					charge = celluloPhono.getRecharge();
					if (charge > 0) {
						Random callRandom = new Random();
						double callLength = Math.round(callRandom.nextDouble() * 30 + 1);
						celluloPhono.call(callLength);
						System.out.println("Durata dell'ultima chiamata " + Math.round(callLength * 100.0) / 100.0 + " minuti.");
					} else {
						celluloPhono.call(0);
						celluloPhono.number404();
					}
					break;
					
				case 3:
					celluloPhono.number404();
					break;
					
				case 4:
					celluloPhono.resetCalls();
					System.out.println("Chiamate azzerate!");
					break;
					
				case 5:
					System.out.println("Hai effettuato " + celluloPhono.getCallsMade() + " chiamate!");
					break;
					
				case 6:
					exit = true;
					System.out.println("Spento!");
					break;
			}
			
		} while(select < 0 || select > 6 || !exit);
			
	}
	
//	public static double round(double valueToRound) {
//		return Math.round(valueToRound * 100.0) / 100.0;
//	}
}
