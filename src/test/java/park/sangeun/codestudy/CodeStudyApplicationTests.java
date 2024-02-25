package park.sangeun.codestudy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import park.sangeun.codestudy.datastructure.ArrayList.ArrayList;
import park.sangeun.codestudy.datastructure.LinkedList.LinkedList;


@SpringBootTest
class CodeStudyApplicationTests {
    @Test
    public void test() throws Exception{
       arrayListTest();
       linkedListTest();
    }

    public void arrayListTest() throws Exception {
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

        ArrayList<String> cloneList = (ArrayList<String>) test.clone();

        System.out.println(test);
        System.out.println(cloneList);

        Object[] objectArray =test.toArray();
        System.out.println(test.toArray(objectArray));

        for (int i=0; i<objectArray.length; i++) {
            System.out.println(objectArray[i]);
        }

        String[] strArray = new String[20];
        strArray = test.toArray(strArray);

        for (int i=0; i<strArray.length; i++) {
            System.out.println(strArray[i]);
        }
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

        linkedList.remove(linkedList.size() - 1);
        System.out.println("after Remove : " + linkedList.toString());
        System.out.println("size : " + linkedList.size());

        linkedList.clear();
        System.out.println("after Remove : " + linkedList.toString());
        System.out.println("size : " + linkedList.size());
    }
}
