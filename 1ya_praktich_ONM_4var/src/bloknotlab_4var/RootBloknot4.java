
package bloknotlab_4var;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;

/// Делаем новый класс4,который является наследником Абстрактным классом3, и реализует методы интерфейса
/// Реализуем методы 3 абстратного класса
/// переопределяем метод ToString
/// Добавляем поля name, оно понадобиться нам для 2ой работы

public class RootBloknot4 extends RootBloknot3 implements I_RootBloknot3 {

    public RootBloknot4(String name, String text, String time, String day, boolean Vkl_zvuk, int napom) {
        super(text, time, day, Vkl_zvuk, napom);
        this.name = name;
    }
 
    
    
    
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    private String name;
    
    
    
    public RootBloknot4() {
    }
    
   

    
   

    @Override
    public void zapominanie(){
        System.out.println("Запоминаем Акканут"); // Перезаписываем метод класса 3 запоминания
    }
    
    @Override
    public void colour(){
        System.out.println("Цвет заливки: красый"); // Перезаписываем метод класса 3 Цвет заливки
    }
  @Override
  public void update() {
        System.err.println("Обновление выключить");  // Перезаписываем интерфейс,который подключен в 3 классе
    }
 
  @Override
    public String toString() {
        return name + " " + "RootBloknot4{" + "Напоминание=" + text + ", Время=" + time + ", День=" + day + ", Включенный звук=" + Vkl_zvuk + ", Сколько раз напоминать=" + napom + '}';
    }
  
  
  
  
  

 
   } 
  






