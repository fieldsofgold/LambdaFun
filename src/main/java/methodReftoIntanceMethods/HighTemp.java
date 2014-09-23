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
public class HighTemp {
    private int hTemp;
    
    HighTemp(int ht) {hTemp = ht;}
    
    boolean sameTemp(HighTemp ht2){
        return hTemp ==ht2.hTemp;
    }
    
    boolean lessThanTemp(HighTemp ht2){
        return hTemp < ht2.hTemp;
    }
    
}
