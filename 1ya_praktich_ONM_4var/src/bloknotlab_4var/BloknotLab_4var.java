package bloknotlab_4var;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BloknotLab_4var {

    public static void main(String[] args) {
       
        
         

        RootBloknot4 aep34 = new RootBloknot4("Проснуться","Встань по-раньше","15:00","Вторник",false, 15);
        aep34.Scrollbox();
        aep34.update();
        aep34.colour();
        System.out.println(aep34);
       
        
       
        
        
    }

}
