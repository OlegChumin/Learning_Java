package radio.adapter.org.exceptions;

/**
 * Исключение верхнего уровня для ошибок воспроизведения WAV-файлов.
 * <p>
 * Используется в {@link radio.adapter.org.WavPlayer}, чтобы обернуть ошибки
 * работы с аудиофайлами и устройствами воспроизведения.
 * </p>
 */
public class AudioPlaybackException extends RuntimeException {

    /**
     * Создаёт исключение с сообщением и исходной причиной.
     *
     * @param message описание ошибки
     * @param cause   исходное исключение
     */
    public AudioPlaybackException(String message, Throwable cause) {
        super(message, cause);
    }
}
