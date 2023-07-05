module com.example.thismoduleveryneedstesting {
  requires javafx.controls;
  requires javafx.fxml;

  opens com.example.thismoduleveryneedstesting to javafx.fxml;
  exports com.example.thismoduleveryneedstesting;
}