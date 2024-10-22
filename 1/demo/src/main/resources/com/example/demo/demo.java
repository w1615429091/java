import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Alert;

public class HelloWorldApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 创建一个按钮
        Button btn = new Button("点击我");

        // 为按钮添加事件处理
        btn.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("信息对话框");
            alert.setHeaderText(null);
            alert.setContentText("Hello, JavaFX!");
            alert.showAndWait();
        });

        // 设置布局
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // 创建场景
        Scene scene = new Scene(root, 300, 250);

        // 设置舞台
        primaryStage.setTitle("JavaFX 示例");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
