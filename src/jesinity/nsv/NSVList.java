package jesinity.nsv;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: dgesino
 * Date: 23/10/11
 * Time: 10.35
 * To change this template use File | Settings | File Templates.
 */
public class NSVList {

    public List<NSV> getList() {
        return list;
    }

    private final List<NSV> list = new ArrayList<NSV>();

    @Override
    public String toString() {
        return "NSVList{" +
                "list=" + list +
                '}';
    }
}
