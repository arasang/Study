package park.sangeun.codestudy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import park.sangeun.codestudy.datastructure.LinkedList.LinkedList;

import java.util.ArrayList;


@SpringBootTest
class CodeStudyApplicationTests {
    @Test
    public void test() {
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
        System.out.println("search : " + linkedList.search(4).toString());

    }
}
