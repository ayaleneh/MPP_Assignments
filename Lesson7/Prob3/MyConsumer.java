package MPP.Prob3;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s.toUpperCase());
    }
}
