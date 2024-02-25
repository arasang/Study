package park.sangeun.codestudy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import park.sangeun.codestudy.datastructure.ArrayList.ArrayList;


@SpringBootTest
class CodeStudyApplicationTests {
    @Test
    public void test() {
        ArrayList<String> test = new ArrayList<>(4);
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.add("4");

        System.out.println(test);

        test.add("5");
        System.out.println(test);
        test.remove("4"); // 1,2,3,4,4,5 -> // 1,2,3,4,5
        System.out.println(test);

        test.add("4");
        System.out.println(test);
  
        test.removeAll("4");
        System.out.println(test);
}
    public void linkedListTest() {
        LinkedList<String> linkedList = new LinkedList<>();
        String value = "a";
        linkedList.add(value);

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
      
        System.out.println(test.indexOf("9"));
    }
}
