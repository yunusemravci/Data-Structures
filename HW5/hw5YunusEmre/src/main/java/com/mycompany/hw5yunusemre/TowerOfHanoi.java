/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw5yunusemre;

import static java.lang.Math.pow;
import java.util.Stack;

/**
 *
 * @author bmyav
 */
public class TowerOfHanoi {
    
    /**  */
    Stack<Integer> src = new Stack<>();
    /** */
    Stack<Integer> dst = new Stack<>();
    /** */
    Stack<Integer> aux = new Stack<>();
    
    public TowerOfHanoi(){

    }
    /**
     * source getter
     * @return src stack
     */
    public Stack<Integer> getSrc() {
        return src;
    }

    
    /**
     * destination getter
     * @return dst stack
     */
    public Stack<Integer> getDst() {
        return dst;
    }

    /**
     * auxiliary getter
     * @return aux stack
     */
    public Stack<Integer> getAux() {
        return aux;
    }
    
    
    /**
     * iteratively implementation of towers of hanoi
     * @param src source peg
     * @param dst destination peg
     * @param aux auxiliary peg
     * @param disksize how many disks
     */
    public void towerOfHanoi(int disksize,char src,char dst, char aux){
        try{
            int totalmovement = (int) pow(2,disksize);
            fillSrcStack(disksize);
            if(disksize % 2 == 0){
                char temp = dst;
                dst = aux;
                aux = temp;
            }
            for(int i= 1; i < totalmovement; i++){
                if(i%3 == 1){   //source and destination
                    if(!this.src.isEmpty() && this.dst.isEmpty()){
                        int disk = this.src.peek();
                        System.out.println("Move Disk " + this.src.pop() + " from peg "+ src +" to peg " + dst+"\n");
                        this.dst.push(disk);
                    }
                    else if(this.src.isEmpty() && !this.dst.isEmpty()){
                        int disk = this.dst.peek();

                            System.out.println("Move Disk " + this.dst.pop() + " from peg "+ dst +" to peg " + src+"\n");
                            this.src.push(disk);    

                    }
                    else if(!this.src.isEmpty() && !this.dst.isEmpty()){
                        int disk = this.dst.peek();
                        int disk2 = this.src.peek();
                        if(disk > disk2){
                            System.out.println("Move Disk " + this.src.pop() + " from peg "+ src +" to peg " + dst+"\n");
                            this.dst.push(disk2);    
                        }
                        else{
                            System.out.println("Move Disk " + this.dst.pop() + " from peg "+ dst +" to peg " + src+"\n");
                            this.src.push(disk);
                        }    
                    }
                }
                else if(i%3 == 0){  //auxiliary and destination
                    int diskaux ;                
                    int diskdst ; 
                    if(this.dst.isEmpty() && !this.aux.isEmpty()){
                        diskaux = this.aux.peek();                

                        System.out.println("Move Disk " + this.aux.pop() + " from peg "+ aux +" to peg " + dst+"\n");
                        this.dst.push(diskaux);
                    }

                    else if(!this.dst.isEmpty() && this.aux.isEmpty()){
                        //diskaux = this.aux.peek();                
                        diskdst = this.dst.peek();

                        System.out.println("Move Disk " + this.dst.pop() + " from peg "+ dst +" to peg " + aux+"\n");
                        this.aux.push(diskdst);
                    }else if(!this.dst.isEmpty() && !this.aux.isEmpty()){
                        diskaux = this.aux.peek();                
                        diskdst = this.dst.peek();

                       if(diskaux > diskdst){                    

                       System.out.println("Move Disk " + this.dst.pop() + " from peg "+ dst +" to peg " + aux+"\n");
                            this.aux.push(diskdst);
                       }
                        else{
                            System.out.println("Move Disk " + this.aux.pop() + " from peg "+ aux +" to peg " + dst+"\n");
                            this.dst.push(diskaux);

                        }

                    }
                }
                else if(i%3 == 2){ //source and auxiliary
                    int diskaux;                 
                    int disksrc ; 
                    if(this.aux.isEmpty() && !this.src.isEmpty()){
                        disksrc = this.src.peek();                

                        System.out.println("Move Disk " + this.src.pop() + " from peg "+ src +" to peg " + aux+"\n");
                        this.aux.push(disksrc);
                    }

                    else if(!this.aux.isEmpty() && this.src.isEmpty()){
                        diskaux = this.aux.peek();                
                        System.out.println("Move Disk " + this.aux.pop() + " from peg "+ aux +" to peg " + src+"\n");
                        this.src.push(diskaux);
                    }
                    else if(!this.aux.isEmpty() && !this.src.isEmpty()){
                        diskaux = this.aux.peek();                
                        disksrc = this.src.peek();

                        if(disksrc > diskaux){
                            System.out.println("Move Disk " + this.aux.pop() + " from peg "+ aux +" to peg " + src+"\n");
                            this.src.push(diskaux);
                        }
                        else{
                            System.out.println("Move Disk " + this.src.pop() + " from peg "+ src +" to peg " + aux+"\n");
                            this.aux.push(disksrc); 
                        }                       
                    }


                }            
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    /**
     * to put disks to source peg with increasing order
     * @param diskSize 
     */
    private void fillSrcStack(int diskSize){
        for(int i = diskSize; i>0; i--){
            this.src.push(i);
            
        }
    }
}
