import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{

        File file = new File("input");
        File file1 = new File("output.txt");
        PrintWriter pw = new PrintWriter(file1);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            pw.println("File not found");
            pw.close();
        }
        double a = 0;
        double b = 0;
        boolean flag = true;

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        try {
            a = Double.parseDouble(arr[0]);
            b = Double.parseDouble(arr[2]);
        } catch (NumberFormatException e) {
            pw.println("Error! Not number");
            pw.close();
            flag = false;return;
        }
        if("/*-+".contains(arr[1]) && flag){
            switch (arr[1]){
                case "+":{
                    pw.println(a + b);
                    pw.close();break;}

                case "-":{
                    pw.println(a - b);pw.close();break;
                }
                case "*":{
                    pw.println(a * b);pw.close();break;
                }
                case "/":{
                    try {
                        if(b == 0.0){
                        pw.println("Error! Division by zero");
                        pw.close();}
                        else
                        pw.println(a / b);
                        pw.close();
                    } catch (ArithmeticException e) {

                    }break;
                }
            }
        }else
            pw.println("Operation Error!");
        pw.close();
    }
}
