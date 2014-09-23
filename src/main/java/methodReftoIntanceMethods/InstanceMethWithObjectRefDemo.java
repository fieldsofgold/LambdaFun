/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methodReftoIntanceMethods;

/**
 *
 * @author Michael
 */
public class InstanceMethWithObjectRefDemo {
    
    static<T> int counter(T[] vals, MyFunc<T> f, T v){
        int count = 0;
        
        for(int i=0; i<vals.length; i++)
            if(f.func(vals[i],v)) count++;
        
        return count;
    }
}
