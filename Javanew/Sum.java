import java.util.ArrayList;

public class Sum {
    public static int Summs(ArrayList<Integer> Num) {
        int sum = 0;

        for (int i : Num) {
            sum += i;

        }
        return sum;
    }

    public static double Avrg(ArrayList<Integer> Var) {
        double number = Summs(Var) * 1.0 / Var.size();
        return number;

    }

    public static double variance(ArrayList<Integer> lists) {
        double average = Avrg(lists);
        double var = 0;
        double total = 0;
        for (int num : lists) {
            var = Math.pow(num * 1.0 - average, 2);
            total += var;
        }
        total = total / lists.size() - 1;
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Integer> MyList = new ArrayList<Integer>();
        MyList.add(10);
        MyList.add(156);
        MyList.add(50);
        MyList.add(16);
        MyList.add(15);
        System.out.println("The total summmation of the list is " + Summs(MyList));
        MyList.add(52);
        System.out.println("The Average of the list is " + Avrg(MyList));
        System.out.println("The Simple variance for the lists is " + variance(MyList));

    }

}
