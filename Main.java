import java.util.ArrayList;

public class Main {
    public static void main(String[]args){

        //algorithm 1
        String[] list={"zebra", "alpha"};
        Sort.sortStringsSelection(list);
        for(String i:list){
            System.out.println(i);
        }
        //testing 2
        String[] list1={"zebra", "alpha", "pineapple"};
        Sort.sortStringsSelection(list1);
        for(String i:list1){
            System.out.println(i);
        }
        //testing 3
        String[] list2={"zebra", "alpha","eaton", "cheese"};
        Sort.sortStringsSelection(list2);
        for(String i:list2){
            System.out.println(i);
        }

        //algorithm 2
        String[] list3={"zebra", "alpha"};
        Sort.sortStringInsertion(list3);
        for(String i:list3){
            System.out.println(i);
        }
        //testing 2
        String[] list4={"zebra", "alpha", "pineapple"};
        Sort.sortStringInsertion(list4);
        for(String i:list4){
            System.out.println(i);
        }
        //testing 3
        String[] list5={"zebra", "alpha", "pineapple", "qdoba"};
        Sort.sortStringInsertion(list5);
        for(String i:list5){
            System.out.println(i);
        }

        //algorithm 3 overloaded method
        ArrayList<String> list6=new ArrayList<String>();
        list6.add("zebra");
        list6.add("alpha");
        Sort.sortStringsSelection(list6);
        System.out.println(list6);

        //testing 2
        ArrayList<String> list7=new ArrayList<String>();
        list7.add("zebra");
        list7.add("alpha");
        list7.add("pineapple");
        Sort.sortStringsSelection(list7);
        System.out.println(list7);
        //testing 3
        ArrayList<String> list8=new ArrayList<String>();
        list8.add("zebra");
        list8.add("alpha");
        list8.add("pineapple");
        list8.add("qdoba");
        Sort.sortStringsSelection(list8);
        System.out.println(list8);

        //algorithm 4 overloaded method
        ArrayList<String> list9=new ArrayList<String>();
        list9.add("zebra");
        list9.add("alpha");
        Sort.sortStringInsertion(list9);
        System.out.println(list9);
        //testing 2
        ArrayList<String> list10=new ArrayList<String>();
        list10.add("zebra");
        list10.add("alpha");
        list10.add("pineapple");
        Sort.sortStringInsertion(list10);
        System.out.println(list10);
        //testing 3
        ArrayList<String> list11=new ArrayList<String>();
        list11.add("zebra");
        list11.add("alpha");
        list11.add("pineapple");
        list11.add("qdoba");
        Sort.sortStringInsertion(list11);
        System.out.println(list11);

        //algorithm 5
        ArrayList<Integer> list12=new ArrayList<Integer>();
        list12.add(1);
        list12.add(0);
        list12.add(-1);
        Sort.sortIntSelections(list12);
        System.out.println(list12);
        //testing 2
        ArrayList<Integer> list13=new ArrayList<Integer>();
        list13.add(1);
        list13.add(2);
        list13.add(-1);
        Sort.sortIntSelections(list13);
        System.out.println(list13);
        //testing 3
        ArrayList<Integer> list14=new ArrayList<Integer>();
        list14.add(10);
        list14.add(8);
        list14.add(-1);
        Sort.sortIntSelections(list14);
        System.out.println(list14);

        //algorithm 6
        ArrayList<Integer> list15=new ArrayList<Integer>();
        list15.add(1);
        list15.add(0);
        list15.add(-1);
        Sort.sortIntInsertion(list15);
        System.out.println(list15);
        //testing 2
        ArrayList<Integer> list16=new ArrayList<Integer>();
        list16.add(10);
        list16.add(25);
        list16.add(-1);
        Sort.sortIntInsertion(list16);
        System.out.println(list16);
        //testing 3
        ArrayList<Integer> list17=new ArrayList<Integer>();
        list17.add(10);
        list17.add(25);
        list17.add(232);
        Sort.sortIntInsertion(list17);
        System.out.println(list17);

    }
}
