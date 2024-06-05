package ru.sorokova.uneversity.main;

import ru.sorokova.uneversity.pipol.Student;
import ru.sorokova.uneversity.pipol.Teacher;
import ru.sorokova.uneversity.pipol.Uneversity;

public class _Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        Uneversity uneversity = new Uneversity();

        Uneversity.makeuneversity(student);
        Uneversity.makestudent(student);
        Uneversity.makeuneversity(teacher);
        Uneversity.maketeacher(teacher);


    }
}
