package kz.zhami.interview.annotations;

import lombok.Value;

import java.time.LocalDate;
import java.util.List;

import static java.util.List.copyOf;

public record Employee(long id, String name, LocalDate joinDate, List<String> achievements) {
    public Employee(long id,
                    String name,
                    LocalDate joinDate,
                    List<String> achievements) {
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
        this.achievements = copyOf(achievements);
    }
}
