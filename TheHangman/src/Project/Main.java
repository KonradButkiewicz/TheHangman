package Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zagrajmy w wisielca! Trwa losowanie słówka...");
        Logic logic = new Logic();
        Drawing drawing = new Drawing();
        Scanner scanner = new Scanner(System.in);

        drawing.gallows(1);

        System.out.println("Twoje słowo to: " + logic.getBlurredWord() + " " + logic.getWord());

        int maxAttempts = 6;
        int attempts = 0;
        boolean wordGuessed = false;

        while (true) {
            System.out.print("Podaj literę lub wpisz całe słowo: ");

            try {
                String input = scanner.next();

                if (input.length() == 1) {
                    char letter = input.charAt(0);
                    String blurredWord = logic.inputCheck(letter);
                    System.out.println(blurredWord);

                    if (blurredWord.equals(logic.getWord())) {
                        wordGuessed = true;
                        break;
                    }

                    if (blurredWord.equals(logic.getBlurredWord())) {
                        attempts++;
                        if (attempts >= maxAttempts) {
                            break;
                        }
                    } else {
                        attempts = 0;
                    }
                } else {
                    logic.checkWord(input);
                    if (logic.isWordGuessed()) {
                        wordGuessed = true;
                        break;
                    } else {
                        attempts++;
                        if (attempts >= maxAttempts) {
                            break;
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawny znak. Podaj literę lub całe słowo.");

            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Wprowadzono pustą wartość. Podaj literę lub całe słowo.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        if (wordGuessed) {
            System.out.println("Gratulacje! Zgadłeś słowo!");
        } else {
            System.out.println("Przegrałeś. Nie udało się zgadnąć słowa.");
        }
    }
}
