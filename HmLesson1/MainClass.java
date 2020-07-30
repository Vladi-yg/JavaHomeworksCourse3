package HmLesson1;

import java.util.ArrayList;
import java.util.Collection;

public class MainClass {
    //3. Большая задача:
//a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
//b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//d. Сделать метод getWeight() который высчитывает вес коробки,
// зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
// которую подадут в compare в качестве параметра, true - если их веса равны,
// false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
// (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
// соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
//g. Не забываем про метод добавления фрукта в коробку.
    public static void main(String[] args) {
     Box<Apple> appleBox = new Box<>();
     appleBox.addInBox(new Apple());
     appleBox.addInBox(new Apple());
     appleBox.addInBox(new Apple());
     appleBox.currentWeight();
     Box<Apple> appleBox2 = new Box<>();
     appleBox2.addInBox(new Apple());
     appleBox2.addBoxInBox(appleBox); // добавляем вторую коробку ы первую
     appleBox2.info();

     ////////////////////////////////

     Box<Orange> orangeBox = new Box<>();
     orangeBox.addInBox(new Orange());
     orangeBox.addInBox(new Orange());
     orangeBox.addInBox(new Orange());
     orangeBox.currentWeight();
     appleBox.compareTo(orangeBox);


    }
}
