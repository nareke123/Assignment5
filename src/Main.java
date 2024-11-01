import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize Model, View, and Presenter
        DataModel model = new DataModel("Initial Data");
        ConsoleView view = new ConsoleView();
        DataPresenter presenter = new DataPresenter(model, view);

        // Execute operations through the Presenter
        presenter.updateData();
        presenter.appendMoreData();
    }
}
