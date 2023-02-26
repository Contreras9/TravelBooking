package com.virtualpairprogrammers.travelbooking;

import com.virtualpairprogrammers.travelbooking.domain.BusTicket;
import com.virtualpairprogrammers.travelbooking.domain.TrainTicket;
import com.virtualpairprogrammers.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        TrainTicket trainTicket = new TrainTicket();
        trainTicket.cancel();

        TrainTicket trainTicket2 = new TrainTicket(123L,"London","Edinburgh", new BigDecimal("59.00"), LocalDateTime.of(2022,9,30,16,3), LocalDateTime.of(2023,3,7,19,3),1,3,45);
        trainTicket2.upgrade();

        String[] providers = {"1st bus company", "2nd bus company"};
        BusTicket busTicket = new BusTicket(125L,"London","Edinburgh", new BigDecimal("59.00"), LocalDateTime.of(2023,3,7,16,3), LocalDateTime.of(2023,3,7,19,3), providers);
        trainTicket2.cancel();
        busTicket.cancel();

        // TravelTicket travelTicket = new TravelTicket();

    }
}
