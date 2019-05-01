import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.image.Image;
import javafx.scene.media.*;
import javafx.scene.control.Alert.AlertType;
import java.io.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
public class Main extends Application {
  private double xOffset = 0;
  private double yOffset = 0;

    public static void main(String[] args) {
        launch(args);
      }

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setOnMousePressed( e -> {
           xOffset = e.getSceneX();
           yOffset = e.getSceneY();
       });
       grid.setOnMouseDragged(e -> {
           stage.setX(e.getScreenX() - xOffset);
           stage.setY(e.getScreenY() - yOffset);
      });
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(25));
        grid.setHgap(10);
        grid.setVgap(10);
        BackgroundImage myBI= new BackgroundImage(new Image("\\Resources\\foxHead.png",1600,900,true,true),BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,new BackgroundSize(1600.0,900.0,false,false,false,false));
        grid.setBackground(new Background(myBI));
        //Media sound = new Media(new File(System.getProperty("user.dir") + "\\Resources\\Dancin.mp3").toURI().toString());
        //MediaPlayer mediaPlayer = new MediaPlayer(sound);
        //mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        //mediaPlayer.play();
        Scene s = new Scene(grid,1600,900);
        s.setFill(Color.TRANSPARENT);
        stage.setScene(s);
        stage.initStyle(StageStyle.TRANSPARENT);
        // stage.setX(500);
        // stage.setY(200);
        stage.setAlwaysOnTop(true);
        stage.show();
    }

}
