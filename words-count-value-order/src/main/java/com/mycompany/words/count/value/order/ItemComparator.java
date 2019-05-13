/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.words.count.value.order;

import java.util.Comparator;
import java.util.Map;

/**
 *
 * @author Denys.Prokopiuk
 */
public class ItemComparator<K> implements Comparator<Map.Entry<K, ? extends Comparable>> {

    @Override
    public int compare(Map.Entry<K, ? extends Comparable> o1, Map.Entry<K, ? extends Comparable> o2) {
        if(o1==null && o2==null){
            return 0;
        }
        if(o1==null){
            return -1;
        }
        if(o2==null){
            return 1;
        }
        return o1.getValue().compareTo(o2.getValue());
    }

}
