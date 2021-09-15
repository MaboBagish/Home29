import javax.sql.rowset.Predicate;
import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        var cats = Cat.makeCats (10);
        Printer.print (cats);


        cats.sort (Cat::byBreed);
        Printer.print (cats);

        cats.sort (Cat::byName);
        Printer.print (cats);

        cats.sort (Cat::byColor);
        Printer.print (cats);

        cats.sort (Comparator.comparingInt (Cat::getAge));
        Printer.print (cats);

        Iterator<Cat> catIterator = cats.iterator ( );
        while (catIterator.hasNext ( )) {
            Cat nextCat = catIterator.next ( );
            if (nextCat.getColor ( ).equals (Cat.Color.SILVER)) {
                catIterator.remove ( );
            }
        }

            Printer.print (cats);
            // А сюда добавьте код, который будет сортировать коллекцию котов
            // используйте лямбда-выражения и ссылки на методы
            //cats.sort(?);
            //Printer.print(cats);
        }


    }
