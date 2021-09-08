package javaEssential3.task2;

public class ClassRoom {
    public ClassRoom(Pupil casualPupil, BadPupil badPupil, ExcelentPupil excelentPupil, GoodPupil goodPupil) {
        //casual
        System.out.println("Обычный ученик: ");
        casualPupil.read();
        casualPupil.relax();
        casualPupil.study();
        casualPupil.write();
        System.out.println();

        //bad
        System.out.println("Плохой ученик: ");
        badPupil.write();
        badPupil.read();
        badPupil.relax();
        badPupil.study();
        System.out.println();

        //good
        System.out.println("Хороший ученик: ");
        goodPupil.read();
        goodPupil.relax();
        goodPupil.study();
        goodPupil.write();
        System.out.println();

        //excelent
        System.out.println("Замечательный ученик: ");
        excelentPupil.read();
        excelentPupil.write();
        excelentPupil.relax();
        excelentPupil.study();


    }
}
