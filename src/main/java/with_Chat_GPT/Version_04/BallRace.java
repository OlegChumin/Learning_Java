//package with_Chat_GPT.Version_04;
//
//import javafx.animation.Animation;
//import javafx.animation.KeyFrame;
//import javafx.animation.Timeline;
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//
//import java.util.*;
//
//public class BallRace extends Application {
//    private static final int WIDTH = 800;
//    private static final int HEIGHT = 600;
//    private static final int DISTANCE = 400;
//    private static final int NUM_BALLS = 6;
//    private static final int RADIUS = 10;
//    private static final int DELAY = 10;
//
//    private Pane root;
//    private List<Ball> balls;
//    private Map<Ball, List<Line>> tracks;
//    private Timeline timeline;
//
//    public void start(Stage stage) {
//        root = new Pane();
//        Scene scene = new Scene(root, WIDTH, HEIGHT);
//
//        initBalls();
//        initTracks();
//
//        root.getChildren().addAll(getTrackLines());
//        root.getChildren().addAll(getBalls());
//
//        timeline = new Timeline(new KeyFrame(Duration.millis(DELAY), event -> {
//            moveBalls();
//            checkWinners();
//        }));
//        timeline.setCycleCount(Animation.INDEFINITE);
//        timeline.play();
//
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    private void initBalls() {
//        balls = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < NUM_BALLS; i++) {
//            Color color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
//            Ball ball = new Ball(color, RADIUS, DISTANCE, DELAY);
//            balls.add(ball);
//        }
//    }
//
//    private void initTracks() {
//        tracks = new HashMap<>();
//        for (Ball ball : balls) {
//            List<Line> track = new ArrayList<>();
//            for (int i = 0; i < ball.getDistance(); i++) {
//                track.add(new Line());
//            }
//            tracks.put(ball, track);
//        }
//    }
//
//    private List<Circle> getBalls() {
//        List<Circle> circles = new ArrayList<>();
//        for (Ball ball : balls) {
//            Circle circle = new Circle(ball.getRadius(), ball.getColor());
//            circle.setTranslateY((HEIGHT - ball.getRadius()) / 2);
//            circle.setTranslateX(ball.getPosition());
//            circles.add(circle);
//        }
//        return circles;
//    }
//
//    private List<Line> getTrackLines() {
//        List<Line> lines = new ArrayList<>();
//        for (Ball ball : balls) {
//            List<Line> track = tracks.get(ball);
//            for (int i = 0; i < track.size(); i++) {
//                Line line = track.get(i);
//                line.setStroke(ball.getColor());
//                line.setStrokeWidth(2);
//                line.setStartX(i);
//                line.setStartY((HEIGHT - RADIUS) / 2);
//                line.setEndX(i);
//                line.setEndY((HEIGHT + RADIUS) / 2);
//                lines.add(line);
//            }
//        }
//        return lines;
//    }
//
//    private void moveBalls() {
//        for (Ball ball : balls) {
//            ball.move();
//            List<Line>
