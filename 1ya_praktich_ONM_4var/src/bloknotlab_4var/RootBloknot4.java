
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

/// ������ ����� �����4,������� �������� ����������� ����������� �������3, � ��������� ������ ����������
/// ��������� ������ 3 ����������� ������
/// �������������� ����� ToString
/// ��������� ���� name, ��� ������������ ��� ��� 2�� ������

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
        System.out.println("���������� �������"); // �������������� ����� ������ 3 �����������
    }
    
    @Override
    public void colour(){
        System.out.println("���� �������: ������"); // �������������� ����� ������ 3 ���� �������
    }
  @Override
  public void update() {
        System.err.println("���������� ���������");  // �������������� ���������,������� ��������� � 3 ������
    }
 
  @Override
    public String toString() {
        return name + " " + "RootBloknot4{" + "�����������=" + text + ", �����=" + time + ", ����=" + day + ", ���������� ����=" + Vkl_zvuk + ", ������� ��� ����������=" + napom + '}';
    }
  
  
  
  
  

 
   } 
  






