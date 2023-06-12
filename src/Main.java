import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindorStudents = {
                new Griffindor("Гарри Поттер", 10, 20, 18, 23, 15),
                new Griffindor("Гермиона Грейнджер", 12, 25, 15, 25, 9),
                new Griffindor("Рон Уизли", 5, 10, 16, 22, 16),
        };

        Hufflepuff[] hufflepuffStudents = {
                new Hufflepuff("Захария Смит", 8, 19, 20, 15, 13),
                new Hufflepuff("Седрик Диггори", 9, 22, 25, 19, 20),
                new Hufflepuff("Джастин Финч-Флетчли", 6, 16, 15, 18, 9),
                };

        Ravenclaw[] ravenclawStudents = {
                new Ravenclaw("Маркус Белби", 10, 15, 15, 5, 8, 11),
                new Ravenclaw("Падма Патил", 11, 12, 5, 15, 7, 12),
                new Ravenclaw("Чжоу Чанг", 12, 14, 17, 8, 9, 15),
        };

        Slytherin[] slytherinStudebts = {
                new Slytherin("Драко Малфой", 8, 5, 8, 6, 10, 8, 20),
                new Slytherin("Грэхэм Монтегю", 5, 3, 1, 2, 3, 3, 8),
                new Slytherin("Грегори Гойл", 4, 2, 3, 5, 7, 5, 6),
        };

        Griffindor harryPotter = new Griffindor("Гарри Поттер", 10, 20, 18, 23, 15);
        Griffindor hermionaGreinger = new Griffindor("Гермиона Грейнджер", 12, 25, 15, 25, 9);
        Griffindor ronWisli = new Griffindor("Рон Уизли", 5, 10, 16, 22, 16);

        Hufflepuff zahariyaSmit = new Hufflepuff("Захария Смит", 8, 19, 20, 15, 13);
        Hufflepuff sedricDiggory = new Hufflepuff("Седрик Диггори", 9, 22, 25, 19, 20);
        Hufflepuff jastinFinchFletchly = new Hufflepuff("Джастин Финч-Флетчли", 6, 16, 15, 18, 9);

        Ravenclaw marcusBelby = new  Ravenclaw("Маркус Белби", 10, 15, 15, 5, 8, 11);
        Ravenclaw padmaPatyl = new  Ravenclaw("Падма Патил", 11, 12, 5, 15, 7, 12);
        Ravenclaw chjouChang = new  Ravenclaw("Чжоу Чанг", 12, 14, 17, 8, 9, 15);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой",8,5,8,6,10,8,20);
        Slytherin grahamMontegry = new  Slytherin("Грэхэм Монтегю", 5, 3, 1, 2, 3, 3, 8);
        Slytherin gregoryGoyl = new  Slytherin ("Грегори Гойл", 4, 2, 3, 5, 7, 5, 6);

        System.out.println();
        System.out.println(Arrays.toString(hufflepuffStudents));
        System.out.println();
        System.out.println(hermionaGreinger);
        System.out.println();
        harryPotter.checkingStudentsOfAllFaculties(dracoMalfoy);
        System.out.println();
        sedricDiggory.checkingStudentsOfTheSameFaculty(chjouChang);






    }


}
