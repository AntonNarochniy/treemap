package kg.megacom;

import java.awt.image.ImageProducer;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {


        Map<Float, String> competitors = new TreeMap(Comparator.reverseOrder());

        competitors.put(110F,"Иван Иванов");
        competitors.put(180.5F,"Петр Петров");
        competitors.put(185F,"Joe Morgan");
        competitors.put(170F,"Ахмед Залкаров");
        competitors.put(195F,"Hui Van Chzo");
        competitors.put(197.5F,"Eleberdi Mametogly");
        competitors.put(0F,"Васiл Сорока");
        competitors.put(167.5F,"Hanz Himmer");
        int pos = 1;

        System.out.println("Количество участников: " + competitors.size());
        System.out.println("Результат соревнований по тяжелой атлетике:");
        for (Map.Entry<Float, String> entry : competitors.entrySet()){
            System.out.println("Место: " + pos + "; Имя спортсмена: " + entry.getValue() + "; Результат: " + entry.getKey() + " кг.");
            pos++;
        }



    }
}
