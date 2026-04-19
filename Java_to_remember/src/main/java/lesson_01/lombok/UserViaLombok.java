package lesson_01.lombok;


import lombok.*;

/**
 * @NoArgsConstructor
 *
 @RequiredArgsConstructor for final and @NonNull
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
