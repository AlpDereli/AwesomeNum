import java.util.Scanner;
public class num {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = take.nextInt();
        int product = 0;
        for (int i = 1;i<num;i++)
        {
            if (num%i==0)
            {
                product+=i;
            }
        }
        if (product == num)
        {
            System.out.println("Awesome number");
        }
        else {
            System.out.println("Not Awesome");
        }
    }
}
