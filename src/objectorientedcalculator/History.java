/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author williamdistler
 */
public class History {
    
    List<String> results = new ArrayList<>(Arrays.asList());
    
    public List<String> getHistory() {
        return results;
    }
    
    public void addResult(String result) {
        this.results.add(result);
    }
}
