package ru.sorokova.uneversity.pipol;

import ru.sorokova.uneversity.util.Study;
import ru.sorokova.uneversity.util.TheyGoToUniversity;

public class Student implements Study, TheyGoToUniversity {
    @Override
    public void study() {
        System.out.println("Я студент и я учусь");
    }

    @Override
    public void theyGoToUniversity() {
        System.out.println("Я студент и чтобы учится, я должен ходить в университет ");
    }

}
