import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("input");
        Scanner sc = new Scanner(file);
        double a = 0;
        double b = 0;
        boolean flag = true;
        sc.useLocale(Locale.US);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        try {
            a = Double.parseDouble(arr[0]);
            b = Double.parseDouble(arr[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error! Not number");
            flag = false;return;
        }
        if("/*-+".contains(arr[1]) && flag){
            switch (arr[1]){
                case "+":{
                    System.out.println(a + b);break;}
                case "-":{
                    System.out.println(a - b);break;
                }
                case "*":{
                    System.out.println(a * b);break;
                }
                case "/":{
                    try {
                        if(b == 0.0)
                        System.out.println("Error! Division by zero");
                        else
                        System.out.println(a / b);
                    } catch (ArithmeticException e) {

                    }break;
                }
            }
        }else
            System.out.println("Operation Error!");
    }
}
