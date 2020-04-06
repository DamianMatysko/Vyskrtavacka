package Package;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Vyskrtavacka {
    public int cislo;

    public void Vyskrtavacka(int cislo) {
        this.cislo = cislo;
    }

    public Set<Integer> generuj() {
        Integer[] arr = {};
        Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(arr)); // capacity of 'numElements'
        String stringCislo = String.valueOf(cislo);
        int intCislo;

        for (int i = 0; i < stringCislo.length(); i++) { //todo if exist
            intCislo = stringCislo.charAt(i);
            mySet.add(intCislo);
        }



        return mySet;
    }
}
