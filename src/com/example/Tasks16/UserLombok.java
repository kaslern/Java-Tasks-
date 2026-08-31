package com.example.Tasks16;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class UserLombok {
    @NonNull
    String firstName;

    String lastName;
    @ToString.Exclude
    int age;
}
