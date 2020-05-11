import java.util.*;

public class main {

    public static void main(final String[] args) {
      Asciichars.printNumbers();
      Asciichars.printUpperCase();
      Asciichars.printLowerCase();

      final Scanner userInput = new Scanner(System.in);

      System.out.println("Please enter your name: ");
      final String name = userInput.nextLine();
      System.out.println("Hello " + name);

      System.out.println("Do you wish to continue to the interactive portion of this program? Please Enter: Yes or No");
      final String nextPortion = userInput.next();

      if (nextPortion.equalsIgnoreCase("Yes") || nextPortion.equalsIgnoreCase("Y")) {

        System.out.println("Do you have a red car? (yes/no)");
        String car = userInput.nextLine();

        System.out.println("What is the name of your favorite pet?");
        String pet = userInput.nextLine();

        System.out.println("What is the age of your favorite pet?");
        int petAge = Integer.parseInt(userInput.nextLine());

        System.out.println("What is your lucky number?");
        int luckyNumber = Integer.parseInt(userInput.nextLine());

        System.out.println("What is your favorite QB's Jersey number?");
        int favQb = Integer.parseInt(userInput.nextLine());

        System.out.println("What is your two digit model year of your car?");
        int carYear = Integer.parseInt(userInput.nextLine());

        System.out.println("What is the first name of your favorite actor/actress?");
        String actor = userInput.nextLine();

        System.out.println("Enter a random number between 1 and 50.");
        int randomNumber = Integer.parseInt(userInput.nextLine());

      /* main Questions = new main();*/
       questions.magicBall();
       

       /* Random random = new Random();
        int rand1 = random.nextInt(75);
        int rand2 = random.nextInt(65);
        int magicBall = 0;
        if (rand1 < 32) {
            magicBall = favQb * rand1;
            while (magicBall > 75) {
                magicBall -= 75;
            }
            System.out.println(magicBall);
        } else {
            magicBall = luckyNumber * rand1;
            while (magicBall > 75) {
                magicBall -= 75;
            }
        }
        int nonMagic1 = pet.charAt(2);
        while (nonMagic1 > 65) {
            nonMagic1 -= 65;
        }
        int nonMagic2 = carYear + luckyNumber;
        while (nonMagic2 > 65) {
            nonMagic2 -= 65;
        }
        int nonMagic3 = luckyNumber - rand2;
        while (nonMagic3 > 65) {
            nonMagic3 -= 65;
        }
        int nonMagic4 = 42;
        int nonMagic5 = actor.charAt(actor.length() - 1);
        System.out.println("Lottery Numbers: " + nonMagic1 + ", " + nonMagic2 + ", " + nonMagic3 + ", " + nonMagic4
                + ", " + nonMagic5 + " Magic Ball: " + magicBall);*/

        }else{
          System.out.println("Please return later to complete the survey.");
        }
         

    }
  
}