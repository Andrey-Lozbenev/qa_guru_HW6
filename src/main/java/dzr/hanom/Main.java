package dzr.hanom;

public class Main {
    public static void main(String[] args) {


                 //2) попробовать вычисления комбинаций типов данных (int и double)

        // Пример переполнения диапазона для byte
        byte aByte = (byte) 127;
        byte bByte = (byte) (aByte + 1);
        System.out.println("### result overflow byte: " + bByte);
        // Пример переполнения диапазона для int
        int aInt = 2147483647;
        int bInt = aInt + 1;
        System.out.println("### result overflow int: " + bInt);

        // Вывод примеров математических операторов
        int a = 10;
        int b = 20;
        int c = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++)); // значение не изменилось, но при следующем обращении произойдет +1
        System.out.println("a   = " +  (a));     // a+1 из строки выше
        System.out.println("a--   = " +  (a--)); // значение не изменилось, но при следующем обращении произойдет -1
        System.out.println("a   = " +  (a));     // a-1 из строки выше
        System.out.println("--a   = " +  (--a)); // a-1 высло сразу

        // Упражнения с математическими операторами
        int d = 10;
        int e = 15;
        int f = d * e;
        System.out.println("f = d * e = " + f);
        f = f / 100;
        System.out.println("f = f / 100 = " + f);

        // Упражнения с логическими операторами
        int j = 15;
        int h = 3;
        if ( j >= 3 && h > j){
            System.out.println("### not true ");
        } else
            System.out.println("### true ");

        if ( j >= 3 || h > j){
            System.out.println("### true story");
        } else
            System.out.println("### wrong way");
        j = j / 5;

        if ( j > 3 && h == j){
            System.out.println("### good job");
        } else
            System.out.println("### false");
        if ( j >= 3 && h == j){
            System.out.println("### good job");
        } else
            System.out.println("### false");



        //попробовать вычисления комбинаций типов данных (int и double)
        int z = 10;
        double y = 15.15;
        System.out.println("z + y = " + (z + y));

        float x = 0.12345F;
        System.out.println("z + x = " + (z + x));
        System.out.println("z + x = " + (z + x + y));
    }
    }