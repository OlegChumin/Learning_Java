//package materials.lesson_07_08.IV_abstraction_абстракция.interfaces;
//
///**
// * Пример с интерфейсом:
// * Для примера создадим интерфейс Playable, который определяет методы для игровых активностей,
// * а затем реализуем этот интерфейс в конкретных классах.
// * В этом примере интерфейс Playable определяет три метода: play(), pause(), и stop().
// * Классы VideoGame и MusicTrack реализуют этот интерфейс, предоставляя конкретную
// * реализацию для каждого метода. Это демонстрирует абстракцию, так как интерфейс
// * Playable определяет общее поведение, но конкретные детали реализации зависят от
// * каждого класса.
// */
//
//// Интерфейс
//interface Playable {
//    void play();
//    void pause();
//    void stop();
//}
//
//// Класс VideoGame, реализующий интерфейс Playable
//class VideoGame implements Playable {
//    @Override
//    public void play() {
//        System.out.println("Видеоигра начинается");
//    }
//
//    @Override
//    public void pause() {
//        System.out.println("Видеоигра на паузе");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Видеоигра остановлена");
//    }
//}
//
//// Класс MusicTrack, реализующий интерфейс Playable
//class MusicTrack implements Playable {
//    @Override
//    public void play() {
//        System.out.println("Музыка играет");
//    }
//
//    @Override
//    public void pause() {
//        System.out.println("Музыка на паузе");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Музыка остановлена");
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Playable game = new VideoGame();
//        Playable music = new MusicTrack();
//
//        game.play();   // Видеоигра начинается
//        music.pause(); // Музыка на паузе
//    }
//}
