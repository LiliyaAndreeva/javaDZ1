import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class sem3DZ {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i % 2==0) iterator.remove();
        }
        System.out.println(list);

        Integer max = list.get(0);
        for (int i = 0; i< list.size(); i++) {
            if (list.get(i) > max) max = list.get(i);
        }
        System.out.println(max);

        Integer min = list.get(0);
        for (int i = 0; i< list.size(); i++) {
            if (list.get(i) < min) min = list.get(i);
        }
        System.out.println(min);

        Integer mean = 0;
        for (int i = 0; i< list.size(); i++) {
            mean += list.get(i);
        }
        System.out.println(mean/ list.size());
    }


}
