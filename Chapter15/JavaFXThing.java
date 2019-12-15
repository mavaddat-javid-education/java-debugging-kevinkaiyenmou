import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import java.io.File;
import java.net.URL;
/**  To compile, make sure to set the --module-path and the -cp in `javac`. So you will run something like
 * javac --module-path "$(eval echo ~$USER)/Downloads/javafx-sdk-14/lib/*" -cp "$(eval echo ~$USER)/Downloads/javafx-sdk-14/lib/*" -d . JavaFXThing.java
   java --module-path "$(eval echo ~$USER)/Downloads/javafx-sdk-14/lib"  --add-modules javafx.controls,javafx.fxml JavaFXThing 
 */

public class JavaFXThing extends Application{

  public static void main(String[] args) {
    launch(args);
  }
  @Override
  public void start(Stage primaryStage) throws Exception {

    FXMLLoader loader = new FXMLLoader();
    File fxmFile = new File("Hello.fxml");
    loader.setLocation(fxmFile.toURI().toURL());
    AnchorPane anchorpane = loader.<AnchorPane>load();

    Scene scene = new Scene(anchorpane);
    primaryStage.setScene(scene);
    primaryStage.show();

  }

}
