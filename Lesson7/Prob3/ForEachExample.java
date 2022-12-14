package MPP.Prob3;


import java.util.Arrays;
        import java.util.List;
        import java.util.TreeSet;


public class ForEachExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        //Using Lambda

       //list.forEach(x-> System.out.println(x.toUpperCase()));

        //Using Consumer Interface
       list.forEach(new MyConsumer());
    }
}