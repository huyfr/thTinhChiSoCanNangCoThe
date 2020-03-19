import java.util.Scanner;

public class BodyMassIndex
{
    public static void main(String[] args)
    {
        double weight, height, bmi;
        String result;

        Scanner number=new Scanner(System.in);

        System.out.println("Enter your weight:");
        weight=number.nextDouble();
        System.out.println("Enter your height:");
        height=number.nextDouble();

        bmi=weight/Math.pow(height,2);

        if (bmi<18.5)
        {
            result="Underweight";
            System.out.println("Your bmi is: "+bmi+" "+result);
        }
        else if (bmi<25)
        {
            result="Normal";
            System.out.println("Your bmi is: "+bmi+" "+result);
        }
        else if (bmi<30)
        {
            result="Overweight";
            System.out.println("Your bmi is: "+bmi+" "+result);
        }
        else
        {
            result="Obese";
            System.out.println("Your bmi is: "+bmi+" "+result);
        }
    }
}
