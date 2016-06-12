/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.speclist;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author yunusemre
 * @param <E>
 * @created 02.03.2016
 */
public class SpecList<E extends Comparable<E> > extends LinkedList<E>{
    
    /**
     * Default constructor
     */
    SpecList(){
        
    }

    /**
     * adding collection elements to head
     * @param c Collection that all of its elements adds to this' head
     * @return true or false whether elements are added or not
     */
    public boolean addAllAtHead(Collection<? extends E> c){
        try{
            if(c.isEmpty()){
                throw new Exception("Collection is empty !!");
            }
            if(this.addAll(0,c)){
                return true;
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        return false;
    }
    
    /**
     * get intersect of two collection that its elements are unique
     * @param c collection that get intersect with this LinkedList
     * @return intersect list
     */
    public List<E> getIntersectList(Collection<? extends E> c){
        int flag = 0;
        /** *intersect list of two collection that its objects are unique */
        List<E> intersect =new LinkedList<>();
        /** *Generic arrays to get to each elements */
        List<E> tempList = new LinkedList<>();
        try{ /** *determine that found object added before to intersect List*/


            if(c.isEmpty()){
                throw new Exception("Collection is empty !!\n");
            }
            else{
                tempList.addAll(c);


                for(int i = 0; i<this.size(); i++){
                    for(int j = 0; j<tempList.size(); j++){
                        if(this.get(i) == tempList.get(j)){
                            for (E intersect1 : intersect) {
                                if (intersect1 == this.get(i)) {
                                    flag = 1;
                                }
                            }
                            if(flag != 1){
                                intersect.add(this.get(i));

                            }
                        }
                    }
                    flag = 0;
                }
            }
            return intersect;
       }
       catch(Exception e){
           System.err.println(e.getMessage());
           return null;
       }
        
    }
    /**
     * sorting the list with cocktail algorithm increasing or decreasing
     * @param whichOrder to determine sorting operation which order is
     * @return sorted list that can be descending order or ascending order
     */
    public List<E> sortList(int whichOrder){
        List<E> sortedList = new LinkedList<>();
        E tempObject;
        boolean swapped = false;
        try{
            do{

                for(int i=0; i<=this.size()-2; i++){
                    if(this.get(i).compareTo(this.get(i+1)) > 0){
                        tempObject = this.get(i);
                        this.set(i, this.get(i+1));
                        this.set(i+1, tempObject);
                        swapped = true;
                    }
                 // System.out.print(this+"\n");

                }
                if(swapped == false){
                    break;
                }
                swapped = false;

                for(int j = this.size()-2; j >=0; j-- ){
                    if(this.get(j).compareTo(this.get(j+1)) > 0){
                       tempObject = this.get(j);
                        this.set(j, this.get(j+1));
                        this.set(j+1, tempObject);
                        swapped = true;
                    }
                 //System.out.print(this+"b\n");
                }

            }while(swapped);
            /*İf whichOrder == 1 then order is descending*/
            if(whichOrder == 1){
                List<E> newList = new LinkedList<>();
                for(int i=this.size()-1; i>=0; i--){
                    newList.add(this.get(i));
                }
                return newList;
            }
        }
        catch(Exception e){
            
        }
        return this;
    }
}