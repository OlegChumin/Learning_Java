
/**
 * Открыть проект в IDEA
 * Открыть окно Project Structure (нажать Ctrl + Alt + Shift + S или выбрать пункт "Project Structure" в меню File)
 * Выбрать пункт "Artifacts" в левой части окна
 * Нажать кнопку "+" и выбрать "JAR" -> "From modules with dependencies"
 * Выбрать главный класс (класс, содержащий метод main) из выпадающего списка "Main class"
 * Настроить путь для сохранения jar-файла в поле "Output directory"
 * Нажать "OK" и закрыть окно Project Structure
 * Выполнить сборку jar-файла через меню Build -> Build Artifacts...
 * */

public class Main {
    public static void main(String[] args) {
        PlotBySpline plotBySpline = new PlotBySpline();
        plotBySpline.setSize(800, 600);
        plotBySpline.setLocationRelativeTo(null); // центрируем окно
        plotBySpline.setVisible(true);
    }
}
