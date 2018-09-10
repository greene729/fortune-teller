import java.util.Scanner;

public class FortuneTellerV2 {
	public static void main(String[] args) {

		// This version is for testing new changes

		Scanner input = new Scanner(System.in);

		System.out.println("Hello, mortal.");
		System.out.println("Thank you for freeing me.");
		System.out.println("It was starting to get a little cramped in that old bottle.");
		System.out.println("As a reward, I will tell you your future.");
		int yesNo = 1;
		do {
			System.out.println("What is your first name?");

			String firstName = input.next();

			System.out.println("Ah, " + firstName + " a fine human name.");
			System.out.println();
			System.out.println("Now, what is your last name?");

			String lastName = input.next();

			System.out.println(lastName + "? I like that.");
			System.out.println();
			System.out.println("So, " + firstName + " " + lastName + ", how old are you?");

			int userAge = input.nextInt();

			if (userAge <= 0) {
				System.out.println("That seems very unlikely, " + firstName + " " + lastName);
				System.out.println("But I have very little knowledge of human ages, so I'll take your word for it.");
			} else if (userAge > 0 && userAge <= 10) {
				System.out.println("Wow! " + userAge + " What a tender age!");
			} else {
				System.out.println("Wow! " + userAge + "? You don't look a day over " + (userAge - 10) + "!");
			}

			System.out.println();
			System.out.println("What month were you born in?");
			System.out.println("Please give me this as a number.");
			System.out.println("I am unfamiliar with human month names.");

			int birthMonth = input.nextInt();
			String birthMonthDemon = "";

			switch (birthMonth) {
			case 1:
				System.out.println("Ah! The first month!");
				System.out.println("Where I come from, we call that \"Yraunaj\"!");
				birthMonthDemon = "Yraunaj";
				break;
			case 2:
				System.out.println("Ah! The second month!");
				System.out.println("Where I come from, we call that \"Yraurbef\"!");
				birthMonthDemon = "Yraurbef";
				break;
			case 3:
				System.out.println("Ah! The third month!");
				System.out.println("Where I come from, we call that \"Hcram\"!");
				birthMonthDemon = "Hcram";
				break;
			case 4:
				System.out.println("Ah! The fourth month!");
				System.out.println("Where I come from, we call that \"Lirpa\"!");
				birthMonthDemon = "Lirpa";
				break;
			case 5:
				System.out.println("Ah! The fifth month!");
				System.out.println("Where I come from, we call that \"Yam\"!");
				birthMonthDemon = "Yam";
				break;
			case 6:
				System.out.println("Ah! The sixth month!");
				System.out.println("Where I come from, we call that \"Enuj\"!");
				birthMonthDemon = "Enju";
				break;
			case 7:
				System.out.println("Ah! The seventh month!");
				System.out.println("Where I come from, we call that \"Yluj\"!");
				birthMonthDemon = "Yluj";
				break;
			case 8:
				System.out.println("Ah! The eighth month!");
				System.out.println("Where I come from, we call that \"Tsugua\"!");
				birthMonthDemon = "Tsugua";
				break;
			case 9:
				System.out.println("Ah! The ninth month!");
				System.out.println("Where I come from, we call that \"Retmetpes\"!");
				birthMonthDemon = "Retmetpes";
				break;
			case 10:
				System.out.println("Ah! The tenth month!");
				System.out.println("Where I come from, we call that \"Rebotco\"!");
				birthMonthDemon = "Rebotco";
				break;
			case 11:
				System.out.println("Ah! The eleventh month!");
				System.out.println("Where I come from, we call that \"Rebmevon\"!");
				birthMonthDemon = "Rebmevon";
				break;
			case 12:
				System.out.println("Ah! The twelfth month!");
				System.out.println("Where I come from, we call that \"Rebmeced\"!");
				birthMonthDemon = "Rebmeced";
				break;
			default:
				System.out.println("I didn't know there were that many human months!");
				System.out.println("You learn something new every day!");
				birthMonthDemon = "some month I've never heard of";
			}

			System.out.println();
			System.out.println("Now, " + firstName + " " + lastName + " it is time to get a little bit personal!");
			System.out.println();
			System.out.println("What is your favorite ROYGBIV color?");
			System.out.println("If you don't know the ROYGBIV colors, please say \"Help\".");
			System.out.println("No one can say I am not a helpful demo--um...entity.");

			String favoriteColor = input.next();

			switch (favoriteColor.toLowerCase()) {
			case "red":
			case "r":
				favoriteColor = "red";
				System.out.println(favoriteColor + " is a powerful color! One of my favorites!");
				break;
			case "orange":
			case "o":
				favoriteColor = "orange";
				System.out.println(favoriteColor + " is a very 90s color! One of my favorites!");
				break;
			case "yellow":
			case "y":
				favoriteColor = "yellow";
				System.out.println(favoriteColor + " is a strong, fatherly color! One of my favorites!");
				break;
			case "green":
			case "g":
				favoriteColor = "green";
				System.out.println(favoriteColor + " is the color of tender, loving care! One of my favorites!");
				break;
			case "blue":
			case "b":
				favoriteColor = "blue";
				System.out.println(favoriteColor + " is fine. It certainly gets you where you need to be!");
				break;
			case "indigo":
			case "i":
				favoriteColor = "indigo";
				System.out.println(favoriteColor
						+ " is a color from an obscure book my mother read me when I was an im--er...young'un!");
				break;
			case "violet":
			case "v":
				favoriteColor = "violet";
				System.out.println(favoriteColor + " is an otherworldly color! One of my favorites!");
				break;
			case "help":
				do {
					System.out.println("R is for Red");
					System.out.println("O is for Orange");
					System.out.println("Y is for Yellow");
					System.out.println("And G is for Green");
					System.out.println("B is for Blue");
					System.out.println("I for Indigo");
					System.out.println("And V is for Violet");
					System.out.println("And that spells ROYGBIV");
					System.out.println();
					System.out.println("Hopefully that helped!");
					System.out.println("Now, what is your favorite ROYGBIV color");
					favoriteColor = input.next();
				} while (favoriteColor.equals("help"));
				switch (favoriteColor.toLowerCase()) {
				case "red":
				case "r":
					favoriteColor = "red";
					System.out.println(favoriteColor + " is a powerful color! One of my favorites!");
					break;
				case "orange":
				case "o":
					favoriteColor = "orange";
					System.out.println(favoriteColor + " is a very 90s color! One of my favorites!");
					break;
				case "yellow":
				case "y":
					favoriteColor = "yellow";
					System.out.println(favoriteColor + " is a strong, fatherly color! One of my favorites!");
					break;
				case "green":
				case "g":
					favoriteColor = "green";
					System.out.println(favoriteColor + " is the color of tender, loving care! One of my favorites!");
					break;
				case "blue":
				case "b":
					favoriteColor = "blue";
					System.out.println(favoriteColor + " is fine. It certainly gets you where you need to be!");
					break;
				case "indigo":
				case "i":
					favoriteColor = "indigo";
					System.out.println(favoriteColor
							+ " is a color from an obscure book my mother read me when I was an im--er...young'un!");
					break;
				case "violet":
				case "v":
					favoriteColor = "violet";
					System.out.println(favoriteColor + " is an otherworldly color! One of my favorites!");
					break;
				default:
					System.out.println(
							"I couldn't quite hear you. I'm going to say your favorite color is probably blue");
					favoriteColor = "blue";
					System.out.println(favoriteColor + " is a lovely color! One of my favorites!");
					break;
				}

				break;

			default:
				System.out.println("I couldn't quite hear you. I'm going to say your favorite color is probably blue.");
				favoriteColor = "blue";
			}

			System.out.println();
			System.out.println("Okay " + firstName + " " + lastName + ", just one more question!");
			System.out.println();
			System.out.println("How many siblings do you have?");

			int siblings = input.nextInt();

			if (siblings == 0) {
				System.out.println("An only child!");
			} else if (siblings > 0 && siblings <= 2) {
				System.out.println(siblings + " siblings. Got it!");
			} else if (siblings > 2 && siblings <= 10) {
				System.out.println(siblings + " siblings? A big family!");
			} else if (siblings > 10) {
				System.out.println(siblings + " siblings? Wow! What an enclave!");
			} else {
				System.out.println(siblings + " siblings, eh? That sounds sad. Did we do that?");
			}

			System.out.println();
			System.out.println("So, " + firstName + " " + lastName);
			System.out.println("who is " + userAge);
			System.out.println("was born in " + birthMonthDemon);
			System.out.println("whose favorite color is " + favoriteColor);
			System.out.println("and who has " + siblings + " siblings,");
			System.out.println("I will now predict your future!");
			System.out.println();
			System.out.println();
			System.out.println("Hrmm...");
			System.out.println();
			System.out.println();
			System.out.println("Very interesting...");
			System.out.println();
			System.out.println();
			System.out.println("Okay, I've got it!");
			System.out.println();

			int retireYears;

			if (userAge % 2 == 0) {
				retireYears = 30;
			} else {
				retireYears = 42;
			}

			String vacationHomeLocation;

			if (siblings == 0) {
				vacationHomeLocation = "Montreal, QC";
			} else if (siblings == 1) {
				vacationHomeLocation = "the highlands of Scottland (not to be confused with Scotland)";
			} else if (siblings == 2) {
				vacationHomeLocation = "Savannah, GA";
			} else if (siblings == 3) {
				vacationHomeLocation = "Del Boca Vista, FL";
			} else if (siblings > 3) {
				vacationHomeLocation = "New Orleans, LA";
			} else {
				vacationHomeLocation = "a very large hole, mostly full of spiders.";
			}

			String modeOfTransportation;

			switch (favoriteColor.toLowerCase()) {

			case "red":
			case "r":
				modeOfTransportation = "the power of flight (that's levitation, homes)";
				break;
			case "orange":
			case "o":
				modeOfTransportation = "roller blades";
				break;
			case "yellow":
			case "y":
				modeOfTransportation = "driving a Dodge Stratus";
				break;
			case "green":
			case "g":
				modeOfTransportation = "hanging out the passenger side of your best friend's ride";
				break;
			case "blue":
			case "b":
				modeOfTransportation = "the bus";
				break;
			case "indigo":
			case "i":
				modeOfTransportation = "a wooden shoe";
				break;
			case "violet":
			case "v":
				modeOfTransportation = "a disc on the backs of four elephants standing on the shell of a giant turtle.";
				break;
			default:
				modeOfTransportation = "ERROR PORKCHOP SANDWICHES ERROR BODY MASSAGE ERROR";
			}

			double bankBalance;

			if (birthMonth >= 1 && birthMonth <= 4) {
				bankBalance = 1867530.25;
			} else if (birthMonth >= 5 && birthMonth <= 8) {
				bankBalance = 525600.05;
			} else if (birthMonth >= 9 && birthMonth <= 12) {
				bankBalance = 256700.01;
			} else {
				bankBalance = 0.00;
			}

			System.out.println(firstName + " " + lastName + " will retire in " + retireYears + " years with $"
					+ bankBalance + " in the bank, \na vacation home in " + vacationHomeLocation
					+ ", \nand will travel by " + modeOfTransportation + ".");
			System.out.println();
			System.out.println("Did I get this right?");

			String yesNoAnswer = input.next();
			String realYesNoAnswer = yesNoAnswer.toLowerCase();

			if (realYesNoAnswer.equals("no")) {
				yesNo = 1;
				System.out.println("Well heck. Let's try this again!");
				System.out.println();
			} else if (realYesNoAnswer.equals("yes")) {
				yesNo = 2;
				System.out.println("Great! Welp, back in the bottle I guess!");
				System.out.println("G O O D B Y E  M O R T A L");
			} else {
				yesNo = 2;
				System.out.println("You are REALLY hard to hear sometimes! Welp, back to the bottle I guess!");
				System.out.println("G O O D B Y E  M O R T A L");
			}
		} while (yesNo == 1);

		input.close();

	}
}
