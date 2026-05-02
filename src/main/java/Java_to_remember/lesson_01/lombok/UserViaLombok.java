package Java_to_remember.lesson_01.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

/**
 * Sample Lombok model.
 *
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@NonNull
public class UserViaLombok {
    private String name;
    private int age;
    private String address;
    private String phone;
}
