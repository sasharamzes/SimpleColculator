import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{

        File file = new File("input");
        File file1 = new File("output");
        PrintWriter pw = new PrintWriter(file1);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            pw.println("File not found");
        }
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
            pw.println("Error! Not number");
            flag = false;return;
        }
        if("/*-+".contains(arr[1]) && flag){
            switch (arr[1]){
                case "+":{
                    pw.println(a + b);break;}
                case "-":{
                    pw.println(a - b);break;
                }
                case "*":{
                    pw.println(a * b);break;
                }
                case "/":{
                    try {
                        if(b == 0.0)
                        pw.println("Error! Division by zero");
                        else
                        pw.println(a / b);
                    } catch (ArithmeticException e) {

                    }break;
                }
            }
        }else
            pw.println("Operation Error!");
    }
}
