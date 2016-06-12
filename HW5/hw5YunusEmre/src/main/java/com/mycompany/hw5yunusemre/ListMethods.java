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
 * @param <E>
 */
public class ListMethods<E extends Comparable<E> > {
    List<E> list1 = new LinkedList<>();
    List<E> list2 = new LinkedList<>();
    
    List<E> unionList = new LinkedList<>();
 
    /**
     * 
     * @return list of private data members intersect
     */
    public List intersectionOfLists(){
        try{
        List<E> intersect;
        List<E> tempList1 = new LinkedList<>();
        tempList1.addAll(this.list1);
        
        List<E> tempList2 = new LinkedList<>();
        tempList2.addAll(list2);
        
        intersect = intersectionOfLists(tempList1, tempList2);
        
        return intersect;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    /**
     * 
     * @param list1
     * @param list2
     * @return 
     */  
    @SuppressWarnings("null")
    private List intersectionOfLists(List<E> tempList1, List<E> tempList2){
        List<E> intersectionList = new LinkedList<>();
        List<E> sublist = new LinkedList<>();
        try{
            if(tempList2 == null)
                return null;
            if(tempList1.isEmpty())
                return intersectionList;
            if(tempList1 == null) 
                return null;
            else{
                //System.out.println(list1.get(0));
                if(tempList2.contains(tempList1.get(0))){
                //System.out.println("contains");
                    if(!intersectionList.contains(list1.get(0))){
                        intersectionList.add(tempList1.get(0));
                        tempList2.remove(tempList1.get(0));

                        //System.out.println("added");
                   }
                }

                sublist.addAll(tempList1.subList(1, tempList1.size()));
                //System.out.println("size = "+ sublist.size());
                sublist = removeDuplicatesFromList(sublist,tempList1.get(0));

                intersectionList.addAll(intersectionOfLists(sublist, tempList2));
                return intersectionList;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 
        return null;
    }
    /**
     * 
     * @param tempList
     * @param data
     * @return 
     */
    private List<E> removeDuplicatesFromList(List<E> tempList, E data){
        try{
            for(int i= 0; i<tempList.size(); i++){
            if(tempList.get(i) == data){
                tempList.remove(i);
            }
        }
            
        return tempList;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    /**
     * wrapper method of union
     * @return private recursive method result
     */
    public List unionOfLists(){
        List<E> tempList1 = new LinkedList<>();
        tempList1.addAll(this.list1);
        
        List<E> tempList2 = new LinkedList<>();
        tempList2.addAll(this.list2);
        
        return unionOfLists(tempList1, tempList2);
    
    }
    /**
     * recursive method of union method
     * @param templist1 first list that searched 
     * @param templist2 second list
     * @return list that union of templist1 and templist2
     */
    @SuppressWarnings("null")
    private List unionOfLists(List<E> templist1, List<E> templist2){
        try{
            List<E> unionlist = new LinkedList<>();
        if(templist1 == null && templist2 != null)
            return new LinkedList();

        if(templist1.isEmpty() && !templist2.isEmpty()){
            //templist2.removeAll(unionlist);
            if(!unionlist.contains(templist2.get(0)))
                unionlist.add(templist2.remove(0));
            else
                templist2.remove(0);
            //unionlist.addAll(unionOfLists(templist1,templist2));
           // return unionlist;
        }
        if(!templist1.isEmpty() && templist2.isEmpty()){
            //templist1.removeAll(unionlist);
            if(!unionlist.contains(templist1.get(0)))
                unionlist.add(templist1.remove(0));
            else
                templist1.remove(0);
          //  unionlist.addAll(unionOfLists(templist1,templist2));
           // return unionlist; 
        }

        if(!templist1.isEmpty() && !templist2.isEmpty()) {

            if(!unionlist.contains(templist1.get(0)) && unionlist.contains(templist2.get(0)))
            {
               unionlist.add(templist1.remove(0));
               templist2.remove(0);
            }
            else if(unionlist.contains(templist1.get(0)) && !unionlist.contains(templist2.get(0))){
                unionlist.add(templist2.remove(0));
                templist1.remove(0);
            }
            else if(!unionlist.contains(templist1.get(0)) && !unionlist.contains(templist2.get(0))){
                if(templist1.get(0).compareTo(templist2.get(0)) == 0){
                    unionlist.add(templist1.remove(0));
                   // unionlist.add(
                    templist2.remove(0);
                }
                else{
                    unionlist.add(templist1.remove(0));
                    unionlist.add(templist2.remove(0));
                }
            }
            else{
              templist2.remove(0);
              templist1.remove(0);
            }

            unionlist.addAll(unionOfLists(templist1, templist2));
            return unionlist;
        }
        else if(templist1.isEmpty() && templist2.isEmpty()){
           return unionlist;
        }
        else
            return new LinkedList();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }  
        return null;
    }
    /**
     * pri. data member list2 is subset of l1 or not (wrapper)
     * @return boolean expression list subset or not
     */
    public boolean isSubset(){
        
        if(list1.size() < list2.size())
            return false;
        List<E> tempList1 = new LinkedList<>();
        tempList1.addAll(this.list1);
        
        List<E> tempList2 = new LinkedList<>();
        tempList2.addAll(list2);
        
        return isSubset(tempList1, tempList2);
    }
    /**
     * recursive method of isSubset
     * @param templist1
     * @param templist2
     * @return boolean expression
     */
    private boolean isSubset(List<E> templist1, List<E> templist2){
        List<E> sublist = new LinkedList<>();
        try{
        if(templist2 == null || templist2.isEmpty())
            return false;
        if(templist1 == null || templist1.isEmpty())
            return false;
        if(templist2.size() == 1){
            if(templist1.contains(templist2.get(0)))
                return true;
            else
                return false;
        }
        else{
            if(templist1.contains(templist2.get(0))){
                return true;
            }
            
            sublist.addAll(templist2.subList(1, templist2.size()));
            isSubset(templist1,sublist);
            
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
