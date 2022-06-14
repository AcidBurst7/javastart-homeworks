package com.javastart.booking.services;

import com.javastart.booking.entities.Bill;
import com.javastart.booking.entities.Client;
import com.javastart.booking.entities.Hotel;
import com.javastart.booking.entities.Room;

/**
 *  Клиент должен попробовать забронировать номер, для этого он так же указывает
 *  сколько человек в номере ему нужно разместить. После успешного бронирования списывать сумму со счета клиента.
 *
 *  Так же при бронировании проверять есть ли свободные номера
 */
public class BookingService {
    public void book(Hotel hotel, int numberOfPersons, Client client) {
        boolean isFreeRooms = false;
        boolean findedFreeRoom = false;
        String clientName = client.getFirstname() + " " + client.getLastname();

        Bill clientBill = client.getBill();
        Room[] rooms = hotel.getRooms();

        for (Room room : rooms) {
            if (room.isFree()) {
                isFreeRooms = true;
            }
        }

        if(!isFreeRooms) {
            System.out.println("В отеле " + hotel.getName() + " свободных нет");
        }

        findedFreeRoom = isFindedFreeRoom(hotel, numberOfPersons, client, findedFreeRoom, clientName, clientBill, rooms);

        if (!findedFreeRoom) {
            System.out.println("Не нашлось свободных номеров в отеле " + hotel.getName() +
                    " для клиента " + clientName);
        }
    }

    private boolean isFindedFreeRoom(Hotel hotel, int numberOfPersons, Client client, boolean findedFreeRoom, String clientName, Bill clientBill, Room[] rooms) {
        for (Room room : rooms) {
            if (room.getNumberOfPerson() == numberOfPersons) {
                findedFreeRoom = true;
                System.out.println("Нашелся номер на " + numberOfPersons + " персон(у) в отеле " +
                        hotel.getName() + " для клиента " +
                        client.getFirstname() + " " + client.getLastname());

                int clientBalance = clientBill.getAmount() - room.getCost();
                if (clientBalance >= 0) {
                    room.setFree(false);
                    clientBill.setAmount(clientBalance);


                    System.out.println("Номер на " + numberOfPersons + " персон(у) в отеле " +
                            hotel.getName() + " забронирован клиентом " +
                            clientName);
                } else {
                    System.out.println("Недостаточно средств. Номер на " + numberOfPersons +
                            " персон(у) в отеле " + hotel.getName() + " не забронирован клиентом " +
                            clientName);
                }
            }
        }
        return findedFreeRoom;
    }
}
