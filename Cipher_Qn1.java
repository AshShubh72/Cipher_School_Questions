import java.util.Scanner;

public class Cipher_Qn1 {

    public static void main (String argus[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the student marks: ");
        int Marks = obj.nextInt();

        if(Marks >= 90){
            System.out.println("Grade A");
        }
        else if (Marks >= 80 && Marks < 90) {
            System.out.println("Grade B");
        }
        else if (Marks >= 70 && Marks < 80) {
            System.out.println("Grade C");
        }
        else if (Marks >= 60 && Marks < 70) {
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
    }
}