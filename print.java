import java.util.*;

class Print {
    public static void main(String[] args) {
        String name = "bunbunjin";
        int age = 18;
        String info = name + age + "歳";
        int len = name.length();
        StringTokenizer st = new StringTokenizer("I'm,bunbunjin,Student", ",");
        String pattern = st.nextToken();
        while(st.hasMoreTokens()){
            pattern = pattern + "+" + (st.nextToken());
        }

        System.out.println("Hello World!");
        System.out.println("Hello");
        System.out.printf("%s", name);
        System.out.println("\n");
        System.out.println(info);
        System.out.println(len);
        System.out.println(pattern);
        
    }
}
class List{
    public static void main(String[] args) {
    int[] num = {1, 2, 3, 4};
    int[][] many_num = {
        {1, 2, 3, 4},
        {5, 6, 7}
    };
    int first = many_num[0].length;

    System.out.println(num[0]);
    System.out.println(first);
    }
}