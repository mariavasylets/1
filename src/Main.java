import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.");
        //Допишіть спосіб 1
        Consumer<String> task1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        task1.accept("Олександр");
        //Спосіб 2
        Consumer<String> printStudent = name -> System.out.println("Студент: " + name);
        printStudent.accept("Олександр");


        System.out.println("2.");
        //Допишіть спосіб 1
        Function<Integer, String> task2 = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                if (integer >= 90) return "Відмінно";
                else if (integer >= 75) return "Добре";
                else if (integer >= 60) return "Задовільно";
                else return "Незадовільно";
            }
        };
        System.out.println(task2.apply(95));
        System.out.println(task2.apply(80));
        //Спосіб 2
        Function<Integer, String> gradeToText = grade -> {
            if (grade >= 90) return "Відмінно";
            else if (grade >= 75) return "Добре";
            else if (grade >= 60) return "Задовільно";
            else return "Незадовільно";
        };
        System.out.println(gradeToText.apply(70));
        System.out.println(gradeToText.apply(50));


        System.out.println("3.");
        //спосіб 1
        Predicate<Integer> hasP = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer>=60) return true;
                else return false;
            }
        };
        System.out.println(hasP.test(80));
        //Допишіть спосіб 2
        Predicate<Integer> task3 = grade -> grade>=60;
        System.out.println(task3.test(50));


        System.out.println("4.");
        //Допишіть спосіб 1
        BiFunction<Double, Double, Double> task4 = new BiFunction<Double, Double, Double>() {
            @Override
            public Double apply(Double coursework1, Double exam1) {
                return coursework1*0.4+exam1*0.6;
            }
        };
        System.out.println(task4.apply(80.0, 90.0));
        //Спосіб 2
        BiFunction<Double, Double, Double> finalGrade = (coursework, exam) -> coursework * 0.4 + exam * 0.6;
        System.out.println(finalGrade.apply(80.0, 90.0));
        



    }
}