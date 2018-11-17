package tubes_KustomMotor;

import java.util.*;

public class Driver{

    public static void main(String[] args) {
        List<motor> l = new ArrayList();
        
        motor m = new matic_bike("matek", "yamaho");
        motor c = new cub_bike("bebek", "handu");
        motor s = new sport_bike("lanang", "kapanlagi");
        
        l.add(m);
        l.add(c);
        l.add(s);
        
        m.CreateBody("Gede", 2, "LED", 2, "red", "glossy");
        m.CreateEngine(600, "mesin uap", 4, "kunig", "metalic");
        m.CreateTires("jaring", "offroad", 90, 80, "item", "doff");
        
        for(int i = 0; i < l.size() ; i++){
            System.out.print( l.get(i).getNama() + " ");
            System.out.println( l.get(i).getMerk() );
        }
    }
}
