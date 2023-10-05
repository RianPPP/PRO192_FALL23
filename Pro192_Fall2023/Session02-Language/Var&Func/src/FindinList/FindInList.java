
package Find.in.list;

import java.util.Scanner;
import java.util.ArrayList;

public class FindInList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("Suda");
        list.add("Kanna Hashimoto");
        list.add("Nana Komatsu");
        list.add("Rose");
        list.add("Lalisa");
        list.add("Jennie");
        list.add("Jisoo");
        String name;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        
        for(int i=0; i<list.size(); i++){
            if(list.contains(name)){
                System.out.println("Yes");
                
                break;
            }else
                System.out.println("No");
            break;
        }
    }
    
}
