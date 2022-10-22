module com.tugas.rivanda {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tugas.rivanda to javafx.fxml;
    exports com.tugas.rivanda;
}
