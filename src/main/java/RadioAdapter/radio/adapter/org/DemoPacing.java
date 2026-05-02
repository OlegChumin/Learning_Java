package RadioAdapter.radio.adapter.org;

/**
 * Утилита для замедления демонстрационных сценариев,
 * чтобы шаги в консоли читались человеком поэтапно.
 */
final class DemoPacing {
    static final long SHORT_DELAY_MS = 700;
    static final long MEDIUM_DELAY_MS = 1100;

    private DemoPacing() {
    }

    static void pause(long delayMs) {
        try {
            Thread.sleep(delayMs);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
