package Package;

import java.util.HashSet;
import java.util.Set;

public class Vyskrtavacka {
    public int cislo;

    public Vyskrtavacka(int value) {
        this.cislo = value;
    }

    public Set<Integer> generuj() {
        //Integer[] arr = {};
        Set<Integer> mySet = new HashSet<Integer>();
        String stringCislo = String.valueOf(cislo);
        int intCislo = 0;


        for (int i = 0; i < stringCislo.length(); i++) {
            intCislo = Character.getNumericValue(stringCislo.charAt(i));
            mySet.add(intCislo);
        }

        for (int i = 0; i < stringCislo.length(); i++) {
            for (int j = i + 1; j < stringCislo.length(); j++) {
                String string = "";
                string += stringCislo.charAt(i);
                string += stringCislo.charAt(j);
                intCislo = Integer.parseInt(string);
                mySet.add(intCislo);
            }
        }

        for (int i = 0; i < stringCislo.length(); i++) {
            for (int j = i + 1; j < stringCislo.length(); j++) {
                for (int k = j + 1; k < stringCislo.length(); k++) {
                    String string = "";
                    string += stringCislo.charAt(i);
                    string += stringCislo.charAt(j);
                    string += stringCislo.charAt(k);
                    intCislo = Integer.parseInt(string);
                    mySet.add(intCislo);
                }
            }
        }

        for (int i = 0; i < stringCislo.length(); i++) {
            for (int j = i + 1; j < stringCislo.length(); j++) {
                for (int k = j + 1; k < stringCislo.length(); k++) {
                    for (int l = k + 1; l < stringCislo.length(); l++) {
                        String string = "";
                        string += stringCislo.charAt(i);
                        string += stringCislo.charAt(j);
                        string += stringCislo.charAt(k);
                        string += stringCislo.charAt(l);
                        intCislo = Integer.parseInt(string);
                        mySet.add(intCislo);
                    }
                }
            }
        }

        for (int i = 0; i < stringCislo.length(); i++) {
            for (int j = i + 1; j < stringCislo.length(); j++) {
                for (int k = j + 1; k < stringCislo.length(); k++) {
                    for (int l = k + 1; l < stringCislo.length(); l++) {
                        for (int m = l + 1; m < stringCislo.length(); m++) {
                            String string = "";
                            string += stringCislo.charAt(i);
                            string += stringCislo.charAt(j);
                            string += stringCislo.charAt(k);
                            string += stringCislo.charAt(l);
                            string += stringCislo.charAt(m);
                            intCislo = Integer.parseInt(string);
                            mySet.add(intCislo);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < stringCislo.length(); i++) {
            for (int j = i + 1; j < stringCislo.length(); j++) {
                for (int k = j + 1; k < stringCislo.length(); k++) {
                    for (int l = k + 1; l < stringCislo.length(); l++) {
                        for (int m = l + 1; m < stringCislo.length(); m++) {
                            for (int n = m + 1; n < stringCislo.length(); n++) {
                                String string = "";
                                string += stringCislo.charAt(i);
                                string += stringCislo.charAt(j);
                                string += stringCislo.charAt(k);
                                string += stringCislo.charAt(l);
                                string += stringCislo.charAt(m);
                                string += stringCislo.charAt(n);
                                intCislo = Integer.parseInt(string);
                                mySet.add(intCislo);
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < stringCislo.length(); i++) {
            for (int j = i + 1; j < stringCislo.length(); j++) {
                for (int k = j + 1; k < stringCislo.length(); k++) {
                    for (int l = k + 1; l < stringCislo.length(); l++) {
                        for (int m = l + 1; m < stringCislo.length(); m++) {
                            for (int n = m + 1; n < stringCislo.length(); n++) {
                                for (int o = n + 1; o < stringCislo.length(); o++) {
                                    String string = "";
                                    string += stringCislo.charAt(i);
                                    string += stringCislo.charAt(j);
                                    string += stringCislo.charAt(k);
                                    string += stringCislo.charAt(l);
                                    string += stringCislo.charAt(m);
                                    string += stringCislo.charAt(n);
                                    string += stringCislo.charAt(n);
                                    intCislo = Integer.parseInt(string);
                                    mySet.add(intCislo);
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < stringCislo.length(); i++) {
            for (int j = i + 1; j < stringCislo.length(); j++) {
                for (int k = j + 1; k < stringCislo.length(); k++) {
                    for (int l = k + 1; l < stringCislo.length(); l++) {
                        for (int m = l + 1; m < stringCislo.length(); m++) {
                            for (int n = m + 1; n < stringCislo.length(); n++) {
                                for (int o = n + 1; o < stringCislo.length(); o++) {
                                    for (int p = o + 1; p < stringCislo.length(); p++) {
                                        String string = "";
                                        string += stringCislo.charAt(i);
                                        string += stringCislo.charAt(j);
                                        string += stringCislo.charAt(k);
                                        string += stringCislo.charAt(l);
                                        string += stringCislo.charAt(m);
                                        string += stringCislo.charAt(n);
                                        string += stringCislo.charAt(n);
                                        string += stringCislo.charAt(p);
                                        intCislo = Integer.parseInt(string);
                                        mySet.add(intCislo);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < stringCislo.length(); i++) {
            for (int j = i + 1; j < stringCislo.length(); j++) {
                for (int k = j + 1; k < stringCislo.length(); k++) {
                    for (int l = k + 1; l < stringCislo.length(); l++) {
                        for (int m = l + 1; m < stringCislo.length(); m++) {
                            for (int n = m + 1; n < stringCislo.length(); n++) {
                                for (int o = n + 1; o < stringCislo.length(); o++) {
                                    for (int p = o + 1; p < stringCislo.length(); p++) {
                                        for (int r = p + 1; r < stringCislo.length(); r++) {
                                            String string = "";
                                            string += stringCislo.charAt(i);
                                            string += stringCislo.charAt(j);
                                            string += stringCislo.charAt(k);
                                            string += stringCislo.charAt(l);
                                            string += stringCislo.charAt(m);
                                            string += stringCislo.charAt(n);
                                            string += stringCislo.charAt(n);
                                            string += stringCislo.charAt(p);
                                            string += stringCislo.charAt(r);
                                            intCislo = Integer.parseInt(string);
                                            mySet.add(intCislo);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        mySet.remove(cislo);

        return mySet;
    }
}
