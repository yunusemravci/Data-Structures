/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.speclist;

import java.util.List;

/**
 *
 * @author bmyav
 * @serial 
 * @version 
 * @create
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SpecList<Integer> a = new SpecList<>();
        SpecList<String> b = new SpecList<>();
        SpecList<String> d = new SpecList<>();      
        SpecList<Integer> c = new SpecList<>();
        SpecList<Double> e = new SpecList<>();
        SpecList<Double> f = new SpecList<>(); 
        
        List<Integer> kesim;
        List<Integer> SortedInteger;
        List<String> kesimStr;
        List<String> SortedString;
        List<Double> intersectDbl;
        List<Double> SortedDouble;
 
        a.add(1);
        a.add(15);
        a.add(2);
        c.add(14);
        c.add(17);
        c.add(18);
        c.add(1);
        c.add(1);
        b.add("ali");
        b.add("485");
        b.add("mehmet");
        b.add("*4a");
        b.add("yunus");
        b.add("362");
        b.add("veli kar");
        d.add("362");
        d.add("***");
        d.add("-*23");
        d.add("memo");
        d.add("4a");
              
        e.add(0.47);
        e.add(1.62);
        e.add(-1.87);
        e.add(4.29);
        e.add(15.67);
        e.add(-8.887);
        e.add(0.59);
        f.add(-1.1);
        f.add(0.15);
        f.add(1.48);
        f.add(-4.9);
        f.add(-15.1457);
        
        
        
        /*--------------INTEGER---------------------*/
        System.out.print("--------------INTEGER---------------------\n\n");
        System.out.print("First Integer LL(a): "+a+"\n");
        System.out.print("Second Integer LL(c): "+c+"\n");
        SortedInteger = a.sortList(0);
        System.out.print("Sorted Integer List of a on ascending Order:"+SortedInteger+"\n");
        kesim = a.getIntersectList(c);
        a.addAllAtHead(c);
        System.out.print("c adding to a: "+a+"\n");     
        System.out.print("Intersection of a and c:"+kesim+"\n");
        
        SortedInteger = c.sortList(1);
        System.out.print("Sorted Integer List of c on descending Order:"+SortedInteger+"\n");
        System.out.print("------------------------------------------\n\n");

        /*------------------DOUBLE---------------------*/
        System.out.print("--------------DOUBLE---------------------\n\n");
        System.out.print("First Double LL(a): "+e+"\n");
        System.out.print("Second Double LL(c): "+f+"\n");
        SortedDouble = e.sortList(0);
        System.out.print("Sorted Double List of e on ascending Order:"+SortedDouble+"\n");
        intersectDbl = e.getIntersectList(f);
        e.addAllAtHead(f);
        System.out.print("f adding to e: "+e+"\n");     
        System.out.print("Intersection of e and f:"+intersectDbl+"\n");
        
        SortedDouble = f.sortList(1);
        System.out.print("Sorted Double List of f on descending Order:"+SortedDouble+"\n");
        System.out.print("------------------------------------------\n\n");
        /*-----------------------------------------------*/

        /*------------------STRING---------------------*/
        System.out.print("--------------STRING---------------------\n\n");
        System.out.print("First String LL(b): "+b+"\n");
        System.out.print("Second String LL(d): "+d+"\n");
        SortedString = b.sortList(0);
        System.out.print("Sorted String List of b on ascending Order:"+SortedString+"\n");
        kesimStr = b.getIntersectList(d);
        e.addAllAtHead(f);
        System.out.print("d adding to b: "+b+"\n");     
        System.out.print("Intersection of b and d:"+kesimStr+"\n");
        
        SortedString = d.sortList(1);
        System.out.print("Sorted String List of d on descending Order:"+SortedString+"\n");
        System.out.print("------------------------------------------\n\n");
        /*-----------------------------------------------*/

    }
    
}
