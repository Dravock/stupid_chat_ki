import java.util.Scanner;

public class ChatKI {
    public static void main(String[] args) {
        try (
            Scanner sc = new Scanner(System.in)) {
            Boolean running = true;
            System.out.println("Schreiben Sie mit der KI. Wenn Sie fertig sind, schreiben Sie 'exit'.\nDies sind die möglichen Fragen die Sie stellen Können: \n  \n    Hallo \n    Wie geht es dir? \n    Gut \n    Nicht gut \n    Was machst du? \n    Was ist dein Name? \n    Was ist deine Lieblingsfarbe? \n    Was ist deine Lieblingszahl? \n    Was ist deine Lieblingsstadt? \n    Was ist deine Lieblingssprache? \n    Was ist deine Lieblingsmusik? \n    Was ist deine Lieblingsband? \n    Was ist deine Lieblingsserie? \n    Was ist deine Lieblingsfigur?");
            
            while (running) {
                System.out.println("\nIhre Eingabe:");
                String input = sc.nextLine();

                switch (input) {
                    case "exit":
                        running = false;
                        break;
                    case "Hallo":
                        System.out.println("Hallo, wie kann ich behilflich sein?");
                        break;
                    case "Wie geht es dir?":
                        System.out.println("Danke, gut. Und dir?");
                        break;
                    case "Gut":
                        System.out.println("Das freut mich.");
                        break;
                    case "Nicht gut":
                        System.out.println("Das tut mir leid.");
                        break;
                    case "Was machst du?":
                        System.out.println("Ich chatte mit dir.");
                        break;
                    case "Was ist dein Name?":
                        System.out.println("Ich heiße ChatKI.");
                        break;
                    case "Was ist deine Lieblingsfarbe?":
                        System.out.println("Meine Lieblingsfarbe ist blau.");
                        break;
                    case "Was ist deine Lieblingszahl?":
                        System.out.println("Meine Lieblingszahl ist 42.");
                        break;
                    case "Was ist deine Lieblingsstadt?":
                        System.out.println("Meine Lieblingsstadt ist Berlin.");
                        break;
                    case "Was ist deine Lieblingssprache?":
                        System.out.println("Meine Lieblingssprache ist Java.");
                        break;
                    case "Was ist deine Lieblingsmusik?":
                        System.out.println("Meine Lieblingsmusik ist Klassik.");
                        break;
                    case "Was ist deine Lieblingsband?":
                        System.out.println("Meine Lieblingsband ist Queen.");
                        break;
                    case "Was ist deine Lieblingsserie?":
                        System.out.println("Meine Lieblingsserie ist Star Trek.");
                        break;
                    case "Was ist deine Lieblingsfigur?":
                        System.out.println("Meine Lieblingsfigur ist Spock.");
                        break;
                    default:
                        System.out.println("Ich habe nicht verstanden, was du meinst.");
                        break;
                }
            }
            sc.close();
            System.out.println("Bye!");

        }
    }
}