import java.util.Scanner;
public class Main {

    /*public static void main(String[] args) {
            //System.out.println("Hello World!");
            int tmp = 0;

            int[] input = {2, 3, 4, 3, 4};

            //for(int out : input) System.out.println(out);
            for (int j = 0; j < input.length; j++) {
                for (int i = j + 1; i < input.length; i++) {
                    if (input[i]==input[j]){
                        System.out.print(input[i]);
                    }
                }
                System.out.println();
            }
        }
    }*/
    /*public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.next();

        System.out.print("Student ID: ");
        String sid = input.next();

        System.out.print("GPA: ");
        Double gpa = input.nextDouble();

        System.out.print("Gender(M/F): ");
        String gender = input.next();

        System.out.println(name + " " + sid + " " + gpa + " " + gender);
    }*/
    private static int count;
    public static void main(String[] args){
        String input = "BenzBCT";

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == 'B'){
                count++;
            }
        }
        System.out.println(count);
    }
}
