package com.example.managerbook.utils;

import java.util.Random;

public class Utils {
    public static String RandomStringGenerator(){
        Random random = new Random();
        int randomNumber = random.nextInt(100000); // Tạo số ngẫu nhiên từ 0 đến 99999
        // Định dạng số thành chuỗi gồm 5 chữ số
        String formattedNumber = String.format("%05d", randomNumber);
        return formattedNumber;
    }
    public static int decrease(int quantity){
        if (quantity > 0){
            quantity--;
        }else {
            quantity = 0;
        }
        return quantity;
    }

}
