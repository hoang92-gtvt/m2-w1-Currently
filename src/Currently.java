//import jdk.nashorn.internal.parser.Scanner;
import java.util.Scanner;

public class Currently {
    public static void main(String[] args) {
        double rate =23000;
        System.out.println("Nhập giá trị tiền USD");
        Scanner scanner1= new Scanner(System.in);
        double value1= scanner1.nextDouble();

        System.out.println("Giá trị tiền VND là : " + value1*rate + "    VND");

    }
}
