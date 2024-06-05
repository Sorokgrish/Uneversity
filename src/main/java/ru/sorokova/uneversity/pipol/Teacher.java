package ru.sorokova.uneversity.pipol;

import ru.sorokova.uneversity.util.Teaches;
import ru.sorokova.uneversity.util.TheyGoToUniversity;

public class Teacher implements Teaches, TheyGoToUniversity {
    @Override
    public void teaches() {
        System.out.println("Я преподаватель и я учу студентов");
    }

    @Override
    public void theyGoToUniversity() {
        System.out.println("Я преподователь и что бы учить студентов я должен ходить в университет");
    }
}
