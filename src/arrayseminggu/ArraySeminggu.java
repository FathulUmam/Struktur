/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayseminggu;

/**
 *
 * @author singupil
 */
public class ArraySeminggu {
    /**
     * Menggunakan do-while
     * @param args 
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String days [] = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
       int x = 0;
       do
       {
           System.out.println(days[x]);
           x++;    
    }while (x < 7);
   }
}  
