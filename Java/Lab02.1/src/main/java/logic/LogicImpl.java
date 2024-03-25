/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Flace
 */
public class LogicImpl implements Logic {
    private final List<Apple> apples;
    
    public LogicImpl() {
        apples = new ArrayList<>();
    }
    
    @Override
    public boolean add(Apple apple) {
        return apples.add(apple);
    }
    
    @Override
    public List<Apple> getAll() {
        return apples;
    }
    
    @Override 
    public List<Apple> getAllPriceMore(double minPrice) {
        List<Apple> list = new ArrayList<>();
        
        for (Apple apple: apples) {
            if (apple.getPrice() > minPrice) {
                list.add(apple);
            }
        }
        
        return list;
    }
    
    @Override 
    public List<Apple> getAllPriceLess(double maxPrice) {
        List<Apple> list = new ArrayList<>();
        
        for (Apple apple: apples) {
            if (apple.getPrice() < maxPrice) {
                list.add(apple);
            }
        }
        
        return list;
    }
    
    @Override 
    public Apple getByNumber(int number) {
        if (number < 0 || number >= apples.size()) {
            return null;
        }
        
        return apples.get(number);
    }
    
    @Override 
    public boolean removeAll() {
        apples.clear();
        
        return true;
    }
    
    @Override 
    public boolean addToPlace(Apple apple, int place) {
        if (place < 0 || place > apples.size()) {
            return false;
        }
    
        apples.add(place, apple);
    
        return true;
    }
    
    @Override 
    public boolean replace(Apple apple, int place) {
        if (place < 0 || place >= apples.size()) {
            return false;
        }
    
        apples.set(place, apple);
    
        return true;
    }
}
