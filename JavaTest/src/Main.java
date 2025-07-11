public class Main {
    public static void main(String[] args) {
         //System.out.println("Hello world!");
        System.out.println(10+10);
        int num1 = 5;
        int num2 = 7;

        System.out.println("num1 + num2: "+num1 + num2);

        int x = 5;
        x += 3;
        System.out.println("x: " + x);

        System.out.println(x == 10);

        System.out.println((5>3)&& (10>5));

        x++;
        System.out.println("x: " + x);

        int score = 85;
        System.out.println((score >=90) ? "A" : "B");

        int n = 5;
        int m = 3;
        System.out.println(n&m);

        if(x < 5) System.out.println("x < 5");
        else System.out.println("x >= 5");

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            default:
                System.out.println("기타 요일");
                break;
        }

        for(int i = 0; i < 3; i++)
        {
            x += i;
            System.out.println("x: " + x);
        }

        while(true)
        {
            x++;
            System.out.println("x: " + x);
            if(x > 20) break;
        }

        do {
            x++;
            System.out.println("x: " + x);
        } while (x < 25);
    }
}