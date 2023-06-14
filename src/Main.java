public class Main {
    public static void main(String[] args) {   task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();}
    private static void task1() {
        System.out.println("задача 1");
        int purpose = 2_459_000;
        int delay = 15000;
        int total = 0;
        int i = 0;
        while (total<=purpose){
            total+=delay;
            i++;
            System.out.println("Месяц "+i+" сумма накоплений равна "+total+" рублей» .");
        }
    }
    private static void task2() {
        System.out.println("задача 2");
        int num1 = 0, num2=10;
        while (num1<num2){
            num1++;
            System.out.print(num1+" ");}
        System.out.println();
        for (;num2>0;num2--){
            System.out.print(num2 +" ");
        }
        System.out.println();
    }
    private static void task3() {
        System.out.println("задача 3");
        int birthRate = 17, deathRate =8, population = 12_000_000, ratio=1000;
        int totalBirthRate = birthRate-deathRate;
        for (int i = 1; i<= 10; i++){
            population+=population/ratio*totalBirthRate;
            System.out.println("Год "+i+", численность населения составляет "+population);
        }
    }
    private static void task4(){
        System.out.println("задача 4");
        int purpose =12_000_000;
        int total= 15000;
        double percent =1.07;
        int i =1;
        for (;total<=purpose;i++){
            total=(int) (total*percent);
            System.out.println("Месяц "+i+" сумма накоплений равна "+total+" рублей» .");
        }
    }
    private static void task5() {
        System.out.println("задача 5");
        int purpose =12_000_000;
        int total= 15000;
        double percent =1.07;
        int i =1;
        for (;total<=purpose;i++){
            total=(int) (total*percent);
            if (i%6==0){
            System.out.println("Месяц "+i+" сумма накоплений равна "+total+" рублей» .");}
        }
    }
    private static void task6() {
        System.out.println("задача 6");
        int total= 15000;
        double percent =1.07;
        int years=9;
        int month = years*12;
        int i =1;
        for (;i<=month;i++){
            total=(int) (total*percent);
            if (i%6==0){
                System.out.println("Месяц "+i+" сумма накоплений равна "+total+" рублей» .");}
        }
    }
    private static void task7() {
        System.out.println("задача 7");
        int friday=6;
        int day = 31;
        for(;friday<=day;friday+=7){
            System.out.println("Сегодня пятница, "+friday+"-е число. Необходимо подготовить отчет");
        }
    }
    private static void task8() {
        System.out.println("задача 8");
        int cometYears=79;
        int years =2023 - 200;
        int years2 =2023 +100;
        int i=0;
        for(;i<years2;i+=cometYears){
            if (i>=years&&i<=years2){
                System.out.println(i);
            }
        }
    }
}