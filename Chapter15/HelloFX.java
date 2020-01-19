import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**  To compile, make sure to set the --module-path and the -cp in `javac`. So you will run something like
 * javac --module-path "$(eval echo ~$USER)/Downloads/javafx-sdk-14/lib/*" -cp "$(eval echo ~$USER)/Downloads/javafx-sdk-14/lib/*" -d . HelloFX.java
   java --module-path "$(eval echo ~$USER)/Downloads/javafx-sdk-14/lib"  --add-modules javafx.controls,javafx.fxml HelloFX 
 */
public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}