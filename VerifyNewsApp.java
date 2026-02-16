import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class VerifyNewsApp extends Application {

    @Override
    public void start(Stage stage) {

        VBox root = new VBox();
        root.setStyle("-fx-background-color: #f8f7f4;");
        root.setPadding(new Insets(20));
        root.setSpacing(40);

        // ================= NAVBAR =================
        HBox navbar = new HBox();
        navbar.setAlignment(Pos.CENTER_LEFT);
        navbar.setSpacing(10);

        Label logoIcon = new Label("🛡");
        logoIcon.setStyle("-fx-font-size: 22px;");

        Label logoText = new Label("VerifyNews");
        logoText.setFont(Font.font("Georgia", FontWeight.BOLD, 20));

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        Label tagline = new Label("AI-Powered Fact Verification");
        tagline.setStyle("-fx-text-fill: #6b7280;");

        navbar.getChildren().addAll(logoIcon, logoText, spacer, tagline);

        // ================= HERO SECTION =================
        VBox hero = new VBox(20);
        hero.setAlignment(Pos.CENTER);

        // Badge
        Label badge = new Label("👁 NLP-Powered Analysis");
        badge.setStyle(
                "-fx-background-color: #e5e7eb;" +
                "-fx-background-radius: 30;" +
                "-fx-padding: 8 18 8 18;" +
                "-fx-text-fill: #1f2937;"
        );

        // Main Heading
        Text part1 = new Text("Separate ");
        part1.setFont(Font.font("Georgia", FontWeight.BOLD, 64));
        part1.setFill(Color.web("#111827"));

        Text fact = new Text("Fact ");
        fact.setFont(Font.font("Georgia", FontWeight.BOLD, 64));
        fact.setFill(Color.web("#2563eb"));

        Text part2 = new Text("from ");
        part2.setFont(Font.font("Georgia", FontWeight.BOLD, 64));
        part2.setFill(Color.web("#111827"));

        Text fiction = new Text("Fiction");
        fiction.setFont(Font.font("Georgia", FontWeight.BOLD, 64));
        fiction.setFill(Color.web("#dc2626"));

        TextFlow heading = new TextFlow(part1, fact, part2, fiction);
        heading.setTextAlignment(TextAlignment.CENTER);

        // Subtext
        Label subText = new Label(
                "Paste any news article URL or text to instantly analyze its\n" +
                "credibility, verify claims against fact-checking databases, and\n" +
                "assess source reliability."
        );
        subText.setStyle("-fx-text-fill: #6b7280; -fx-font-size: 18px;");
        subText.setAlignment(Pos.CENTER);
        subText.setTextAlignment(TextAlignment.CENTER);

        // ================= BUTTONS =================
        HBox buttons = new HBox(20);
        buttons.setAlignment(Pos.CENTER);

        Button pasteUrl = new Button("🔗  Paste URL");
        pasteUrl.setStyle(
                "-fx-background-color: #0f172a;" +
                "-fx-text-fill: white;" +
                "-fx-font-size: 16px;" +
                "-fx-background-radius: 30;" +
                "-fx-padding: 10 25 10 25;"
        );

        Button pasteArticle = new Button("📄  Paste Article");
        pasteArticle.setStyle(
                "-fx-background-color: #e5e7eb;" +
                "-fx-text-fill: #111827;" +
                "-fx-font-size: 16px;" +
                "-fx-background-radius: 30;" +
                "-fx-padding: 10 25 10 25;"
        );

        buttons.getChildren().addAll(pasteUrl, pasteArticle);

        hero.getChildren().addAll(badge, heading, subText, buttons);

        root.getChildren().addAll(navbar, hero);

        Scene scene = new Scene(root, 1200, 700);
        stage.setTitle("VerifyNews");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
