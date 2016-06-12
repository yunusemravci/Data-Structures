/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw5yunusemre;

import java.util.LinkedList;

/**
 *
 * @author bmyav
 * @param <E>
 */
public class LinkedListRec<E> {
    private Node<E> head;
    protected LinkedList<E> list = new LinkedList<>();
   
    public LinkedListRec(){
      
    }
    /**
     * recursive remove method that remove duplicate elements
     * @param head 
     * @param pred 
     * @param outData removed element
     * @return boolean result that elements are removed or not 
     */
    private boolean remove(Node < E > head, Node < E > pred, E outData){
        try{
            if(head == null){
                return false;
            }
            else if(head.data.equals(outData)){
                pred.next = head.next;
                remove(head.next, pred, outData);
                return true;
            }
            else{
                return remove(head.next, head, outData);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    /**
     * wrapper method of remove
     * @param outData removed element
     * @return boolean expression that elements are removed or not
     */
    public boolean remove(E outData){
        try{
            if(head == null)
                return false;
            else if(head.data.equals(outData)){
                head = head.next;
                return remove(head.next,head.next,outData);
            }
            else
                return remove(head, head, outData);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    /**
     * 
     * @param <E> 
     */
    private static class Node<E>{
        //Data Fields
        /** The reference to the data */
        private E data;
        /** The reference to the next node */
        private Node<E> next;
        
        //Constructors
        /** Creates a new node with a null next field.
            @param dataItem The data stored
        */
        private Node(E dataItem){
            data = dataItem;
            next = null;
        }
        /**
         * Creates a new node that references another node
         * @param dataItem the data stored
         * @param nodeRef the node referenced by new node
         */
        private Node(E dataItem, Node<E> nodeRef){
            data = dataItem;
            next = nodeRef;
        }
    }
    
    private Node<E> addOperation(Node<E> node, E value) {
        if (node == null) {
          return new Node<>(value);
        }
        node.next = addOperation(node.next, value);
        return node;
  }
   
    /** public wrapper method, calls the private recursive method
       * @param value
      */
    public void add(E value) {
        head = addOperation(head, value);
    }
    
      private String toString(Node<E> node) {
        if (node == null) {
          return "";
        }
        if (node.next == null) {
          return node.data.toString();
        }
        return node.data.toString() + " ==> " + toString(node.next);
    }

  /** 
    * concatenates the elements of the linked list, separated by " ==> "
    * @return the string representation of the list
    */
    @Override
  public String toString() {
    return toString(head);
  }
}
