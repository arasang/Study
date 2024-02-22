package park.sangeun.codestudy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import park.sangeun.codestudy.datastructure.LinkedList.LinkedList;

import java.util.ArrayList;


@SpringBootTest
class CodeStudyApplicationTests {
    @Test
    public void linkedListTest() {
        LinkedList<String> linkedList = new LinkedList<>();
        String value = "a";
        linkedList.add(value);

        String value2 = "b";
        linkedList.add(value2);

        String value3 = "c";
        linkedList.add(value3);

        String value4 = "B";
        linkedList.add(1, value4);
        linkedList.addFirst("A");
        System.out.println("linkedList : " + linkedList.toString());
        System.out.println("size : " + linkedList.size());
        System.out.println("contain : " + linkedList.contain("z"));

        linkedList.remove("a");
        System.out.println("after Remove : " + linkedList.toString());
        System.out.println("size : " + linkedList.size());

        linkedList.remove(0);
        System.out.println("after Remove : " + linkedList.toString());
        System.out.println("size : " + linkedList.size());

        linkedList.remove(linkedList.size()-1);
        System.out.println("after Remove : " + linkedList.toString());
        System.out.println("size : " + linkedList.size());

        linkedList.removeAll();
        System.out.println("after Remove : " + linkedList.toString());
        System.out.println("size : " + linkedList.size());

    }
}
