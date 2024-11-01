
    public class DataPresenter {
        private DataModel model;
        private ConsoleView view;

        public DataPresenter(DataModel model, ConsoleView view) {
            this.model = model;
            this.view = view;
        }

        public void updateData() {
            model.setData(view.getNewDataInput("Current Data: " + model.getData() + "\nEnter new data: "));
            view.displayData("Data updated to: " + model.getData());
        }

        public void appendMoreData() {
            model.appendData(view.getAdditionalDataInput("Enter another piece of data: "));
            view.displayFinalData("Final combined data: " + model.getData());
        }
    }


