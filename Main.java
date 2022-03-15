import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CircleWithException cwe = new CircleWithException();
        int input;
        boolean correct = false;
   
        while(!correct)
        {
            try 
        {
            input = scan.nextInt();
            if(input<=0)
                throw new IllegalArgumentException();
            }catch (Exception e) {
                System.out.println("Please enter a value more than 0");
                continue;
            }
            correct = true;
            cwe.setRadius(input);
        }

        try {
            if(cwe.getArea() > 1000)
            {
                scan.close();
                throw new IllegalArgumentException();
            }
            else
                System.out.println(cwe.getArea());
            
        } catch (Exception e) {
            System.out.println("Error! area is bigger than 1000!");
        }
        scan.close();
    }
     
    
}
