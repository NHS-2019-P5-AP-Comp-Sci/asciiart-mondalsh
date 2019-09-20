/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main(String[] args) {
		sun();
		System.out.println("");
		balloons();
		tabb();
		kitty();
		cat();
		flower();

	}

	public static void sun() {
		space();
		System.out.println("   \\   |   /");
		space();
		System.out.println("  -  .....  -");
		space();
		System.out.println(" - .........  -");
		space();
		System.out.println("-  ...........  -");
		space();
		System.out.println(" - .........  -");
		space();
		System.out.println("  -  .....  -");
		space();
		System.out.println("   /   |   \\");

	}


	public static void balloons() {
		System.out.println(" ___");
		System.out.println("|   |");
		System.out.println(" ___");
		System.out.println("  |");
		System.out.println("  |");
	}
	public static void cat() {
		System.out.println(" /\\______/\\");
		System.out.println(" |  o   o |");
		System.out.println(" \\____-___/");
		System.out.println("   |      | \\____/\\");
		System.out.println("   |______|_|_____/");
		System.out.println("___|_|  |_|/__________________________________");
	}
	
	public static void flower() {
		System.out.println("       __\t   __");
		System.out.println("___ __(__)___\t__(__)__ ______/__\\__/_\\___\\_");
		System.out.println("   (__) @(__)  (__) @(__)");
		System.out.println("      (__)\t  (__)");
		System.out.println("       |\t   |");
		System.out.println("     (\\|/)\t (\\|/) /\\    /\\     /\\/\\");
		System.out.println("__/\\______________________/\\____/\\___/\\_//\\_____");

	}

	public static void tabb() {
		System.out.println("\t          ___");
		System.out.println("\t         |   |");
		System.out.println("\t          ___");
		System.out.println("\t           |");
		System.out.println("\t           |");

	}

	public static void kitty() {
		System.out.println("\t\t\t .      .");
		System.out.println("\t\t\t. ...... .");
		System.out.println("\t\t       .          .");
		System.out.println("\t\t       .   o   o   .");
		System.out.println("\t\t\t.    ^    .");
		System.out.println("\t\t\t .........     .");
		System.out.println("\t\t        /.........\\   . .");
		System.out.println("\t\t\t.           ...  .");
		System.out.println("\t\t\t.   .      .  ...");
		System.out.println("\t\t\t.   ._____.  .");
		System.out.println("________________/\\\\______....    ...._________/\\\\__/\\\\___/\\\\__/\\\\_");
	}
	public static void space() {
		System.out.print("                                        ");
	}
}

// . .
// . ...... .
// . .
// . o o .
// . ^ .
// ......... .
// /.........\ . .
// . ... .
// . . . ...
// . ._____. .
// .... ....

//           \   |   /
//          -  .....  -
//         - .........  -
//       -  ...........  -
//        -  .........  -
//         -   .....   -
//           /   |   \
