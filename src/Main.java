import java.io.*;

public class Main{
    public static void main(String[] args) throws FileNotFoundException,NullPointerException {

        File file1 = new File("output.txt");
        PrintWriter pw = new PrintWriter(file1);
        double a = 0;
        double b = 0;
        boolean flag = true;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("input"));
            String line = reader.readLine();
            while (line != null) {
                flag = true;
                String[] arr = line.split(" ");
                try {
                    a = Double.parseDouble(arr[0]);
                    b = Double.parseDouble(arr[2]);
                } catch (NumberFormatException e) {
                    pw.println(line + " = " + "Error! Not number");
                    flag = false;
                }
                if("/*-+".contains(arr[1])&& flag){
                    switch (arr[1]){
                        case "+":{
                            pw.println(line + " = " + (a + b));
                            break;}

                        case "-":{
                            pw.println(line + " = " + (a - b));break;
                        }
                        case "*":{
                            pw.println(line + " = " + (a * b));break;
                        }
                        case "/":{
                            try {
                                if(b == 0.0){
                                    pw.println(line + " = " + "Error! Division by zero");
                                }
                                else{
                                    pw.println(line + " = " + (a / b));}

                            } catch (ArithmeticException e) {

                            }break;
                        }
                    }
                }if(!("/*-+".contains(arr[1]))&& flag){
                    pw.println(line + " = " + "Operation Error!");}

                line = reader.readLine();
            }pw.close();reader.close();


        } catch (IOException e) {
            pw.println("File not found");
            pw.close();
        }
    }
}
