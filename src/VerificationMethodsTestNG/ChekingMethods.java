package VerificationMethodsTestNG;

import com.epam.MixingSalad.Salad;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maryia on 11/29/2015.
 */
public class ChekingMethods {

    @Test
        public void sortingValuesVerif() {
       String map="[kiwi=100.0, orange=200.0, apple=300.0]";
        Salad sal=new Salad();
        Map<String, Double> sorted = new HashMap<>();
        sorted.put("apple", 300.0);
        sorted.put("kiwi", 100.0);
        sorted.put("orange", 200.0);
        sal.sortingValues(sorted).toString();
        Assert.assertEquals(sal.sortingValues(sorted).toString(), map);
    }

    @Test
    public void sortingKeysVerif(){
        String map= "[apple=300.0, kiwi=100.0, orange=200.0]";
        Salad sal=new Salad();
        Map<String, Double> sorted = new HashMap<>();
        sorted.put("apple", 300.0);
        sorted.put("kiwi", 100.0);
        sorted.put("orange", 200.0);
        sal.sortingValues(sorted).toString();
        Assert.assertEquals(sal.sortingKeys(sorted).toString(), map);
    }
}