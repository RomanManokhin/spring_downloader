package Discount;

import Bases.Comic;
import Bases.ComicBase;
import Serrialization.Serialization;
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class DiscountNewYear {

    private HashMap<Integer, Comic> newYear = new HashMap<>();
    Serialization serialization = new Serialization();
    public void InitDiscountNewYear(ComicBase comicBase) {
        File DiscountNewYear = new File("Discount.DiscountNewYear.txt");

        if (!DiscountNewYear.isFile()) {
            newYear.put(5, comicBase.getComicDB().get(5));
            newYear.put(1, comicBase.getComicDB().get(3));
            newYear.put(3, comicBase.getComicDB().get(1));
            serialization.serialization(newYear, "Discount.DiscountNewYear.txt");
        } else {
            newYear = (HashMap<Integer, Comic>) serialization.deSerialization("Discount.DiscountNewYear.txt");
        }
    }

    public void addNewYear(int id, ComicBase comicBase) {
        newYear.put(id, comicBase.getComicDB().get(id));
        serialization.serialization(newYear, "Discount.DiscountNewYear.txt");
    }


    public boolean deleteNewYear(ComicBase comicBase) {
        Scanner in = new Scanner(System.in);
        int id;
        do {
            System.out.print("Введите id для удаления: ");
            while (!in.hasNextInt()) {
                System.out.print("Введите id для удаления: ");
                in.next();
            }
            id = in.nextInt();
            if (newYear.containsKey(id)) {
                newYear.remove(id);
                serialization.serialization(newYear, "Discount.DiscountNewYear.txt");
                return true;
            } else {
                return false;
            }
        } while (id <= -1);
    }

    public void printNewYear() {
        System.out.println("Новогодние акции:\n" + serialization.deSerialization("Discount.DiscountNewYear.txt"));
    }


}
