package Package;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class VyskrtavackaTest {

    @Test
    void generujTest1() {
        int value=313;
        Integer[] arr = { 3,1,31,13,33 };
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        //System.out.println(set);
        Vyskrtavacka vyskrtavacka=new Vyskrtavacka(value);
        Set<Integer> result = vyskrtavacka.generuj();

        assertTrue(set.containsAll(result));
        assertTrue(result.containsAll(set));
    }

    @Test
    void generujTest2() {
        int value = 1234;
        Integer[] arr = { 1,2,3,4,12,13,14,23,34,24,123,124,234,134 };
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        //System.out.println(set);
        Vyskrtavacka vyskrtavacka=new Vyskrtavacka(value);
        Set<Integer> result = vyskrtavacka.generuj();
        //System.out.println(result);
        assertTrue(set.containsAll(result));
        assertTrue(result.containsAll(set));
    }

    @Test
    void generujTest3() {
        int value = 92543;
        Integer[] arr = { 2, 3, 4, 5, 9543, 9, 23, 24, 25, 923, 9243, 92, 924, 93, 925, 94, 543, 95, 9253, 9254, 43, 2543, 943, 243, 53, 54, 953, 954, 253, 254 };
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        //System.out.println(set);
        Vyskrtavacka vyskrtavacka=new Vyskrtavacka(value);
        Set<Integer> result = vyskrtavacka.generuj();
        //System.out.println(result);
        assertTrue(set.containsAll(result));
        assertTrue(result.containsAll(set));
    }

    @Test
    void generujTest4() {
        int value = 82;
        Integer[] arr = { 8,2 };
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        //System.out.println(set);
        Vyskrtavacka vyskrtavacka=new Vyskrtavacka(value);
        Set<Integer> result = vyskrtavacka.generuj();
        //System.out.println(result);
        assertTrue(set.containsAll(result));
        assertTrue(result.containsAll(set));
    }

    @Test
    void generujTest5() {
        int value = 493;
        Integer[] arr = { 4,9,3,49,93,43 };
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        //System.out.println(set);
        Vyskrtavacka vyskrtavacka=new Vyskrtavacka(value);
        Set<Integer> result = vyskrtavacka.generuj();
        //System.out.println(result);
        assertTrue(set.containsAll(result));
        assertTrue(result.containsAll(set));
    }

    @Test
    void generujTest6() {
        int value = 5255;
        Integer[] arr = {2, 52, 5, 55, 25, 555, 525, 255 };
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        //System.out.println(set);
        Vyskrtavacka vyskrtavacka=new Vyskrtavacka(value);
        Set<Integer> result = vyskrtavacka.generuj();
        //System.out.println(result);
        assertTrue(set.containsAll(result));
        assertTrue(result.containsAll(set));
    }

    @Test
    void generujTest7() {
        int value = 111222;
        Integer[] arr = {1, 2, 1122, 1222, 11, 12, 111, 112, 11122, 22, 11222, 1112, 122, 222 };
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        //System.out.println(set);
        Vyskrtavacka vyskrtavacka=new Vyskrtavacka(value);
        Set<Integer> result = vyskrtavacka.generuj();
        //System.out.println(result);
        assertTrue(set.containsAll(result));
        assertTrue(result.containsAll(set));
    }

    @Test
    void generujTest8() {
        int value = 55;
        Integer[] arr = {5 };
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        //System.out.println(set);
        Vyskrtavacka vyskrtavacka=new Vyskrtavacka(value);
        Set<Integer> result = vyskrtavacka.generuj();
        //System.out.println(result);
        assertTrue(set.containsAll(result));
        assertTrue(result.containsAll(set));
    }

    @Test
    void generujTest9() {
        int value = 4646;
        Integer[] arr = {64, 464, 66, 466, 4, 6, 646, 44, 46, 446 };
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        //System.out.println(set);
        Vyskrtavacka vyskrtavacka=new Vyskrtavacka(value);
        Set<Integer> result = vyskrtavacka.generuj();
        //System.out.println(result);
        assertTrue(set.containsAll(result));
        assertTrue(result.containsAll(set));
    }

    @Test
    void generujTest10() {
        int value = 715348;
        Integer[] arr = {1, 1538, 3, 4, 5, 134, 7, 8, 138, 1548, 13, 14, 15, 18, 148, 534, 153, 538,
                154, 158, 34, 548, 38, 48, 7348, 53, 71348, 54, 58, 1348, 71, 73, 713, 74, 714,
                75, 715, 78, 718, 75348, 348, 734, 7134, 738, 7138, 5348, 748, 7148, 7534, 71534,
                753, 7153, 754, 7538, 7154, 71538, 15348, 758, 7158, 7548, 71548, 1534 };
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        //System.out.println(set);
        Vyskrtavacka vyskrtavacka=new Vyskrtavacka(value);
        Set<Integer> result = vyskrtavacka.generuj();
        //System.out.println(result);
        assertTrue(set.containsAll(result));
        assertTrue(result.containsAll(set));
    }

}