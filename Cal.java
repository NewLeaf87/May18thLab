import java.util.Scanner;

class cal{
    public static void main(String args[]){
        Scanner question = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first number: ");
        fnum = question.nextDouble();
        System.out.println("Enter second number: ");
        snum = question.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }
}