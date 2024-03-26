package kz.zhami.interview;

public enum Role {
    STUDENT(5,18),
    TEACHER(20,60),
    DIRECTOR(40,70),
    SECURITY_GUARD(18,50);

    int ageFrom;
    int ageTo;
    Role(int ageFrom, int ageTo) {
        this.ageFrom = ageFrom;
        this.ageTo = ageTo;
    }
}
