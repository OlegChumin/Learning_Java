package SWING.byPoints;

public class CallPlot {
    public static void main(String[] args) {
        FunctionPlot plot = new FunctionPlot();
        plot.setSize(800, 600);
        plot.setLocationRelativeTo(null); // центрируем окно
        plot.setVisible(true);
    }
}
