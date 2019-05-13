/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.words.count.value.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Denys.Prokopiuk
 */
public class WordProcessorImpl implements WordProcessor {

    @Override
    public void process(String line) {
        String[] data = line.split(" ");
        Map<String, Long> groupingByWord = processData(data);
        List<Map.Entry<String, Long>> resultData = sort(groupingByWord);
        for (Map.Entry<String, Long> entry : resultData) {
            System.out.println(entry);
        }
    }

    private List<Map.Entry<String, Long>> sort(Map<String, Long> map) {
        List<Map.Entry<String, Long>> result = new ArrayList(map.size());
        result.addAll(map.entrySet());
        result.sort(new ItemComparator());
        return result;
    }

    private Map<String, Long> processData(String[] data) {
        Map<String, Long> map = new HashMap();
        for (String item : data) {
            Long currentValue = map.get(item);
            if (currentValue == null) {
                map.put(item, 1L);
            } else {
                map.put(item, currentValue + 1);
            }
        }
        return map;
    }

}
