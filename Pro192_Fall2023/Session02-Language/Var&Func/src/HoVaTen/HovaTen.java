import java.util.Scanner;

public class HovaTen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập Họ của bạn: ");
        String ho= sc.nextLine();
        System.out.println("Nhập Tên của bạn: ");
        String Ten = sc.nextLine();
        
        System.out.println("=============================");
        System.out.printf("Tên đầy đủ: %s",ho+ " " +Ten);
    }
    
    
}
