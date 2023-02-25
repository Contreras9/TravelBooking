package com.virtualpairprogrammers.travelbooking;

import com.virtualpairprogrammers.travelbooking.domain.TrainTicket;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        TrainTicket trainTicket = new TrainTicket();
        trainTicket.cancel();

        TrainTicket trainTicket2 = new TrainTicket(123L, "London", "Edinburgh", new BigDecimal("59.00"),
                LocalDateTime.of(2022, 3, 7, 16, 3),
                LocalDateTime.of(2022, 3, 7, 19, 3), 1, 3, 45);

        trainTicket2.upgrade();
    }
}
