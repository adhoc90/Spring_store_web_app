package ru.pro.sky.springstorewebapp.service;

import java.util.List;

public interface OrderService {
    List<Integer> addItems(List<Integer> itemsIds);
    List<Integer> getItems();
}