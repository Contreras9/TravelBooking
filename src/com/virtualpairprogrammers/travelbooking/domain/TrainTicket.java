package com.virtualpairprogrammers.travelbooking.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class TrainTicket extends TravelTicket{

    private Integer travelClass;
    private Integer cartNumber;
    private Integer seatNumber;

    public TrainTicket() {
        super();
    }

    public TrainTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, Integer travelClass, Integer cartNumber, Integer seatNumber) {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.travelClass = travelClass;
        this.cartNumber = cartNumber;
        this.seatNumber = seatNumber;
    }

    public Integer getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(Integer travelClass) {
        this.travelClass = travelClass;
    }

    public Integer getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(Integer cartNumber) {
        this.cartNumber = cartNumber;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void upgrade() {
        if (travelClass != 1) {
            travelClass = 1;
            System.out.println("You have been upgrade!");
        }
        else {
            System.out.println("You are already in 1st class.");
        }
    }

    @Override
    public String toString() {
        return "TrainTicket{" +
                "travelClass=" + travelClass +
                ", cartNumber=" + cartNumber +
                ", seatNumber=" + seatNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TrainTicket that = (TrainTicket) o;
        return Objects.equals(travelClass, that.travelClass) && Objects.equals(cartNumber, that.cartNumber) && Objects.equals(seatNumber, that.seatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), travelClass, cartNumber, seatNumber);
    }
}
