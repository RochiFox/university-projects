/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logic;

import java.util.List;

/**
 *
 * @author Flace
 */
public interface Logic {
    // 1
    boolean add (Apple apple);
    
    // 2
    List <Apple> getAll();
    
    // 3
    List <Apple> getAllPriceMore(double minPrice);
    
    // 4
    List <Apple> getAllPriceLess(double maxPrice);
    
    // 5
    Apple getByNumber(int number);
    
    // 6 
    boolean removeAll();
    
    // 7
    boolean addToPlace(Apple apple, int place);
    
    // 8 
    boolean replace(Apple apple, int place);
}
