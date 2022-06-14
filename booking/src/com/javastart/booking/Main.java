package com.javastart.booking;

import com.javastart.booking.entities.Bill;
import com.javastart.booking.entities.Client;
import com.javastart.booking.entities.Hotel;
import com.javastart.booking.entities.Room;
import com.javastart.booking.services.BookingService;

/**
 * В данном домашнем задании нужно написатьсистему бронировния номеров в отеле.
 * Сущности: Client, Hotel, Room, Bill.
 *
 * Client будет содержать поля: имя, фамилию, номер телефона, почту, ссылку на Bill
 * В Bill будет сумма денег
 * Hotel будет содеражть поля: имя отеля, список номеров
 * Room будет содеражть колличество человек, которых можно разместить, стоимость этого номера и свободен ли этот номер
 *
 * Сценарии:
 * Нужно создать нескольких клиентов с счетами и внести им первоначальную сумму.
 * Так же нужно создать несколько отелей, с разными наборами номеров (В списке внутри сущности Hotel)
 * Клиент должен попробовать забронировать номер, для этого он так же указывает
 * сколько человек в номере ему нужно разместить. После успешного бронирования списывать сумму со счета клиента.
 *
 * Так же при бронировании проверять есть ли свободные номера
 *
 * В одном из сценариев, клиенту должно не хватить денег для бронирования номера
 *
 * В методе main не нужно проводить никаких операций, кроме создания начальных объектов, сервисов и вызова их методов
 */
public class Main {
    public static void main(String[] args) {
        Bill johnBill = new Bill(12000);
        Client john = new Client("John", "Black", "79001231212", "john@nail.ru", johnBill);

        Bill susanBill = new Bill(1000);
        Client susan = new Client("Susan", "Delfino", "79001241214", "susan@mail.ru", susanBill);

        Bill jackBill = new Bill(5000);
        Client jack = new Client("Jack", "Kent", "79003453434", "jack@mail.ru", jackBill);

        Room[] californiaHotelRooms = new Room[]{
                new Room(1, 1500, true),
                new Room(3, 3500, true),
                new Room(2, 3500, true)
        };
        Hotel californiaHotel = new Hotel("California", californiaHotelRooms);

        Room[] sanfranciscoHotelRooms = new Room[]{
                new Room(5, 4500, false),
                new Room(1, 3400, true),
                new Room(2, 2300, true)
        };
        Hotel sanfranciscoHotel = new Hotel("San-Francisco", sanfranciscoHotelRooms);

        BookingService bookingService = new BookingService();
        bookingService.book(californiaHotel, 1, john);
        bookingService.book(sanfranciscoHotel, 1, susan);
        bookingService.book(californiaHotel, 1, jack);
    }
}
