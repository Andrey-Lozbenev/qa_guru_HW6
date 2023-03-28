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

        // Прекрасный пример из конспекта. Не мог не воспользоваться :)
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

        //2) попробовать вычисления комбинаций типов данных (int и double)
        int z = 10;
        double y = 15.15;
        System.out.println("z + y = " + (z + y));

        float x = 0.12345F;
        System.out.println("z + x = " + (z + x));
        System.out.println("z + x = " + (z + x + y));
    }
    }