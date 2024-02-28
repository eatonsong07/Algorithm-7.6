import java.util.ArrayList;

public class Sort {

    // Method to sort a string aay alphabetically
    public static void sortStringsSelection(String[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            String temp = a[minIdx];
            a[minIdx] = a[i];
            a[i] = temp;
        }
    }
    public static void sortStringsSelection(ArrayList<String> a) {
        for (int i = 0; i < a.size() - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(j).compareTo(a.get(minIdx)) < 0) {
                    minIdx = j;
                }
            }
            String temp = a.get(minIdx);
            a.set(minIdx, a.get(i));
            a.set(i, temp);
        }
    }
    public static void sortIntSelections(ArrayList<Integer> a) {
        for (int i = 0; i < a.size() - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(j)<(a.get(minIdx))) {
                    minIdx = j;
                }
            }
            int temp = a.get(minIdx);
            a.set(minIdx, a.get(i));
            a.set(i, temp);
        }
    }
    public static void sortStringInsertion(String[]a){
            for (int i = 1; i < a.length; ++i) {
                String key = a[i];
                int j = i - 1;
                while (j >= 0 && a[j].compareTo(key) > 0) {
                    a[j + 1] = a[j];
                    j = j - 1;
                }
                a[j + 1] = key;
            }

    }
    public static void sortStringInsertion(ArrayList<String> a){
        for (int i = 1; i < a.size(); ++i) {
            String key = a.get(i);
            int j = i - 1;
            while (j >= 0 && a.get(j).compareTo(key) > 0) {
                a.set(j+1, a.get(j));
                j = j - 1;
            }
            a.set(j+1,key);
        }

    }
    public static void sortIntInsertion(ArrayList<Integer> a){
        for (int i = 1; i < a.size(); ++i) {
            int key = a.get(i);
            int j = i - 1;
            while (j >= 0 && a.get(j)>(key)) {
                a.set(j+1, a.get(j));
                j = j - 1;
            }
            a.set(j+1,key);
        }

    }


}
