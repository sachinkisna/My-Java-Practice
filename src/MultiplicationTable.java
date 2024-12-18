import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The NUmber:");
        int num=sc.nextInt();
        int i=1;
        for(i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
        System.out.println("---------Thank You--------");
    }
}
