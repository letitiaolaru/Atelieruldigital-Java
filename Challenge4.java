import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge4 {

    public static int nr_of_pairs(List<Integer> a) {
        int k = 0;
        for(int i = 0; i < a.size(); i++) {
            for(int j = i + 1; j < a.size(); j++) {
                for(int z = j + 1; z < a.size(); z++) {
                    if(i < a.size() && j < a.size() && z < a.size()) {
                        if (a.get(i) + a.get(j) + a.get(z) == 0) {
                            a.remove(j);
                            k++;
                            i++;
                        }
                    }
                }
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int len = scanner.nextInt();
        while (len > 0) {
            int input = scanner.nextInt();
            list.add(input);
            len --;
        }
        int nr = nr_of_pairs(list);
        System.out.println(nr);
    }
}
