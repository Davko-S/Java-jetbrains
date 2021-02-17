package pl.davko.jetbrains.excercise.factory.table;

public class TableStore extends TableFactory {

    @Override
    Table createTable(String type) {
        if (type.toLowerCase().equals("office")) {
            return new TableOffice("Office Table");
        } else if (type.toLowerCase().equals("lab")) {
            return new TableLab("Lab Table");
        } else if (type.toLowerCase().equals("kitchen")) {
            return new TableKitchen("Kitchen Table");
        } else return null;
    }
}
