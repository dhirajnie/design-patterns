package prototype;

//import org.apache.commons.lang3.SerializationUtils;
import java.io.Serializable;

class Foo implements Serializable {

    int stuff;
    String whatsoever;

    public Foo(int stuff, String whatsoever) {
        this.stuff = stuff;
        this.whatsoever = whatsoever;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "stuff=" + stuff +
                ", whatsoever='" + whatsoever + '\'' +
                '}';
    }

}
public class CopyUsingSerlization {
    public static void main(String[] args) {
        Foo foo = new Foo(1,"Lf");
        /**
         * Below method is part of apache common
         */
       // Foo foo2   Serizationutils.roundtrip(foo);

    }
}


