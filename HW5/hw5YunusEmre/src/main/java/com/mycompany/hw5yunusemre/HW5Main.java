/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw5yunusemre;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author bmyav
 */
public class HW5Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        ListMethods LM = new ListMethods();
        ListMethods LMs = new ListMethods();
        LinkedListRec<Integer> LLR = new LinkedListRec<>();
        LinkedListRec<String> LLRs = new LinkedListRec<>();
        TowerOfHanoi ToH = new TowerOfHanoi();
        
/*-------------------------------- PART 3 ------------------------------------*/
        LM.list1.add(8);
        LM.list1.add(114);
        LM.list1.add(1);
        LM.list1.add(114);
        LM.list1.add(8);
        LM.list1.add(21);
        LM.list2.add(1);
        LM.list2.add(11);
        LM.list2.add(1);
        LM.list2.add(114);
        LM.list2.add(71);
        LM.list2.add(114);

        System.out.println("~~~~~~> For integer numbers List Methods: ");
        System.out.println("------>List 1: " + LM.list1);
        System.out.println("------>List 2: " + LM.list2);
        List list = LM.intersectionOfLists();

        System.out.println("------>Intersection of two lists: " + list);
        System.out.println("------>List 2 Is subset of list 1: "+LM.isSubset());
        System.out.println("------>Union of two lists: "+LM.unionOfLists()+ 
                                                     "\n-------------------\n");
        
        LMs.list1.add("ahmet");
        LMs.list1.add("*/da");
        LMs.list1.add("üüasd");
        LMs.list1.add("izmir");
        LMs.list1.add("kavak");
        LMs.list1.add("batık");
        LMs.list2.add("*/");
        LMs.list2.add("izmir");
        LMs.list2.add("batıl");
        LMs.list2.add("art");

        System.out.println("~~~~~~> For Strings List Methods: ");
        System.out.println("------>List 1: " + LMs.list1);
        System.out.println("------>List 2: " + LMs.list2);
        List lists = LMs.intersectionOfLists();

        System.out.println("------>Intersection of two lists: " + lists);
        System.out.println("------>List 2 Is subset of list 1: "+LMs.isSubset());
        System.out.println("------>Union of two lists: "+LMs.unionOfLists()+ 
                                                     "\n-------------------\n");        
        
/*----------------------------------------------------------------------------*/        
        
/******************************************************************************/
        
        /*----->LinkedListRec - Remove : for String values*/

        LLRs.add("ali");
        LLRs.add("mehmet");
        LLRs.add("lale");
        LLRs.add("bursa");
        LLRs.add("leyla");
        LLRs.add("lale");
        LLRs.add("il");
        System.out.println("* Linked list before remove: "+LLRs.toString());       
        LLRs.remove("lale");
        System.out.println("* Removed: lale");
        System.out.println("* After removing method: "+LLRs.toString());
        /*--------------------------------------------------*/
        
        /*----->LinkedListRec - Remove : for integers numbers*/

        LLR.add(2);
        LLR.add(5);
        LLR.add(24);
        LLR.add(22);
        LLR.add(1);
        LLR.add(2);
        LLR.add(27);
        System.out.println("* Linked list before remove: "+LLR.toString());               
        LLR.remove(2);
        System.out.println("* Removed: 2");
        System.out.println("* Aftre removing method: "+LLR.toString());
        /*--------------------------------------------------*/        
 
/******************************************************************************/ 
        
/*##################### TOWERS OF HANOI  #####################################*/        
        /*---------------- For 3 disk ---------------*/
        /*  System.out.println("Tower of hanoi for 3 disk ");
          ToH.towerOfHanoi(3, 'S', 'D', 'A');
        /*---------------- For 4 disk ---------------*/
           System.out.println("Tower of hanoi for 4 disk ");
          ToH.towerOfHanoi(4, 'S', 'D', 'A');
        /*---------------- For 5 disk ---------------*/
        /* System.out.println("Tower of hanoi for 5 disk ");
         ToH.towerOfHanoi(5, 'S', 'D', 'A');
        
/*############################################################################*/      
    }
    
}
