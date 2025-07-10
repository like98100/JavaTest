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
        x++;
        System.out.println("x: " + x);

        if(x < 5) System.out.println("x < 5");
        else System.out.println("x >= 5");

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