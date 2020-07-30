package HmLesson1;

import java.util.ArrayList;

public class Main <T>{
    //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    //2. Написать метод, который преобразует массив в ArrayList;
    public static void main(String[] args) {

        String a1 = "1";
        String a2 = "2";
        String a3 = "3";
        String a4 = "4";
        String a5 = "5";
        String[] strings = {a1, a2, a3, a4, a5};

        Main m = new Main();
        m.changeElements(3, 4, strings);

        Apple ap1 = new Apple();
        Apple ap2 = new Apple();
        Apple ap3 = new Apple();
        Apple ap4 = new Apple();
        Apple ap5 = new Apple();
        Apple[] apples = {ap1, ap2, ap3, ap4, ap5};
        m.arrToList(apples);

    }
    public  void arrToList(T... t) {
        ArrayList<T> tArrayList = new ArrayList<>();
        for (T t1 : t) {
            tArrayList.add(t1);
        }
        System.out.println(tArrayList);
    }


    public void changeElements(int n, int m, T... t) {
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
        T tVar;
        tVar = t[n];
        t[n] = t[m];
        t[m] = tVar;
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }
}
