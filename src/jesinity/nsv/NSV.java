package jesinity.nsv;

/**
 * Created by IntelliJ IDEA.
 * User: dgesino
 * Date: 23/10/11
 * Time: 10.34
 * To change this template use File | Settings | File Templates.
 */
public class NSV {

    public NSV(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public final String name;
    public final String value;

    @Override
    public String toString() {
        return "NSV{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
