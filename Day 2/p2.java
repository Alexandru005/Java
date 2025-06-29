public class p2{
    public static void main(String[] args){
        int a = 3;
        int b = 5;

        if(a > b)
            System.out.println(a + " este mai mare ca " + b);
        if(b > a)
            System.out.println(b + " este mai mare ca " + a);
        if(a == b)
            System.out.println("Numerele sunt egale");
        
        int suma = 0;
        for(int i = 1; i <= 100; i++)
            if(i % 2 == 1)
                System.out.print(i + " ");
            else
                suma = suma + i;
        System.out.print("\n" + "Suma este: " + suma + "\n");
    }
}