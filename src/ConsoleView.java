import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    public void displayData(String data) {
        System.out.println("Current Data: " + data);
    }

    public String getNewDataInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public String getAdditionalDataInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void displayFinalData(String data) {
        System.out.println("Final combined data: " + data);
    }
}
