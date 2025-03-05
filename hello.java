import java.util.Scanner;

class hello{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a num");
        int i = sc.nextInt();
        System.out.println("hello world -" + (i+10));
        System.out.println("hello world -" + (i*10));
    }
}
