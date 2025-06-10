package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    private TextField tfAddTask;
    @FXML
    private TextField tfTask1;
    @FXML
    private TextField tfTask2;
    @FXML
    private TextField tfTask3;
    @FXML
    private TextField tfTask4;
    @FXML
    private TextField tfTask5;

    @FXML
private void addTask() {
    String newTask = tfAddTask.getText();
    if (newTask.isEmpty()) {
        showAlert("Error", "Task Cannot be empty.");
        return;
    }
    // Existing logic to add task
    if (tfTask1.getText().isEmpty()) {
        tfTask1.setText(newTask);
    } else if (tfTask2.getText().isEmpty()) {
        tfTask2.setText(newTask);
    } else if (tfTask3.getText().isEmpty()) {
        tfTask3.setText(newTask);
    } else if (tfTask4.getText().isEmpty()) {
        tfTask4.setText(newTask);
    } else if (tfTask5.getText().isEmpty()) {
        tfTask5.setText(newTask);
    } else {
        showAlert("Error", "All task slots are full.");
    }
    tfAddTask.clear();
}

private void showAlert(String title, String message) {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
}

    @FXML
    private void clearTask1() {
        tfTask1.clear();
    }

    @FXML
    private void clearTask2() {
        tfTask2.clear();
    }

    @FXML
    private void clearTask3() {
        tfTask3.clear();
    }

    @FXML
    private void clearTask4() {
        tfTask4.clear();
    }

    @FXML
    private void clearTask5() {
        tfTask5.clear();
    }

    @FXML
    private void clearAllTasks() {
        tfTask1.clear();
        tfTask2.clear();
        tfTask3.clear();
        tfTask4.clear();
        tfTask5.clear();
        tfAddTask.clear();
    }
}