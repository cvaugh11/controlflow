import java.util.*;

public class questions {

    public static void magicBall() {
        Scanner userInput = new Scanner(System.in);
        
     /* Questions survey = new questions();*/
        String car = survey.main(userInput);
        String pet = survey.main(userInput);
        int luckyNumber = survey.main(userInput);
        int favQb = survey.main(userInput);
        int carYear = survey.main(userInput);
        String actor = survey.main(userInput);
        int randomNumber = survey.main(userInput);


        Random random = new Random();
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
                + ", " + nonMagic5 + " Magic Ball: " + magicBall);

    }
}