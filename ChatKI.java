import java.util.Scanner;
import java.util.stream.Stream;



public class ChatKI {
    public static void main(String[] args) {
        printMsgWithProgressBar("\nProgramm wird gestartet...", 50, 60);
        main_programm();
    }

    public static void main_programm () {
        print("\n\nWillkommen bei ChatKI!");
        try (
            Scanner sc = new Scanner(System.in)) {
                Boolean running = true;

                while (running) {

                    print("\nWie kann ich behilflich sein?\n1. Mit der KI schreiben \n2. Taschenrechner \n3. Programm beenden");
                    print("\nIhre Eingabe:");
                    String input = sc.nextLine();

                    switch (input) {
                        case "1" :
                            chatBot();
                            break;
                        case "2" :
                            print("2");
                            break;
                        case "3" :
                            running = false;
                            break;
                        default:
                            print("Ich habe nicht verstanden, was du meinst.");
                            break;
                    }
                    
                }
                sc.reset();
                print("Bye!");
            }
    }

    public static void chatBot () {
        try (
            Scanner sc = new Scanner(System.in)) {
            Boolean running = true;
                print("\nSchreiben Sie mit der KI. Wenn Sie fertig sind, schreiben Sie 'exit'.\nDies sind die möglichen Fragen die Sie stellen Können: \n  \n    Hallo \n    Wie geht es dir? \n    Gut \n    Nicht gut \n    Was machst du? \n    Was ist dein Name? \n    Was ist deine Lieblingsfarbe? \n    Was ist deine Lieblingszahl? \n    Was ist deine Lieblingsstadt? \n    Was ist deine Lieblingssprache? \n    Was ist deine Lieblingsmusik? \n    Was ist deine Lieblingsband? \n    Was ist deine Lieblingsserie? \n    Was ist deine Lieblingsfigur?");
            print("\nIhre Eingabe:");
            String input = sc.nextLine();
            while(running){
                switch (input) {
                    case "exit":
                        running = false;
                        break;
                    case "Wie geht es dir?":
                        print("Danke, gut. Und dir?");
                        break;
                    case "Gut":
                        print("Das freut mich.");
                        break;
                    case "Nicht gut":
                        print("Das tut mir leid.");
                        break;
                    case "Was machst du?":
                        print("Ich chatte mit dir.");
                        break;
                    case "Was ist dein Name?":
                        print("Ich heiße ChatKI.");
                        break;
                    case "Was ist deine Lieblingsfarbe?":
                        print("Meine Lieblingsfarbe ist blau.");
                        break;
                    case "Was ist deine Lieblingszahl?":
                        print("Meine Lieblingszahl ist 42.");
                        break;
                    case "Was ist deine Lieblingsstadt?":
                        print("Meine Lieblingsstadt ist Berlin.");
                        break;
                    case "Was ist deine Lieblingssprache?":
                        print("Meine Lieblingssprache ist Java.");
                        break;
                    case "Was ist deine Lieblingsmusik?":
                        print("Meine Lieblingsmusik ist Klassik.");
                        break;
                    case "Was ist deine Lieblingsband?":
                        print("Meine Lieblingsband ist Queen.");
                        break;
                    case "Was ist deine Lieblingsserie?":
                        print("Meine Lieblingsserie ist Star Trek.");
                        break;
                    case "Was ist deine Lieblingsfigur?":
                        print("Meine Lieblingsfigur ist Spock.");
                        break;
                    default:
                        print("Ich habe nicht verstanden, was du meinst.");
                        break;
                }
            sc.close();
            }
        }
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void printMsgWithProgressBar(String message, int length, long timeInterval)
    {
        char incomplete = '░'; // U+2591 Unicode Character
        char complete = '█'; // U+2588 Unicode Character

        StringBuilder builder = new StringBuilder();

        Stream.generate(() -> incomplete).limit(length).forEach(builder::append);
        System.out.println(message);

        for(int i = 0; i < length; i++)
        {
            builder.replace(i,i+1,String.valueOf(complete));
            String progressBar = "\r"+builder;
            System.out.print(progressBar);
            try
            {
                Thread.sleep(timeInterval);
            }
            catch (InterruptedException ignored)
            {

            }
        }
    }
}