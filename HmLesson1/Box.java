package HmLesson1;

import javax.swing.text.html.StyleSheet;
import java.util.ArrayList;

public class Box <T extends Fruit> implements Comparable{
    private float boxWeight;
    ArrayList<T> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void info() {
        int number = 0;
        for (T t: box) {
            number++;
        }
        System.out.println("В коробке находятся " + number + " фрукта") ;
    }


    public void addBoxInBox(Box<T> tBox) {
        for (T t: box) {
            tBox.addInBox(t);

        }
        box.removeAll(box);
        tBox.info();

    }

    public void  addInBox(T t) {
        box.add(t);
    }

    public void currentWeight() {
        for (T t : box) {
            boxWeight += t.getWeight();
        }
        System.out.println(boxWeight);
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Box){
            new RuntimeException();
        }
        Box boxComp = (Box)o;
        if (this.boxWeight == boxComp.boxWeight) {
            System.out.println(true);
        } else System.out.println(false);
        return 0;
    }
}
