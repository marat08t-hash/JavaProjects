import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List <Integer> list = new ArrayList<>();
        int m = 0;
        for(int i = 0; i < n; i++){
            m = scanner.nextInt();
            list.add(m);
        }
        System.out.println(list);

    }
}

