/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Munser;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abdo
 */
public class Munser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Room room = new Room();
        room.setName("I154");

        Room room1 = new Room();
        room.setName("I155");

        Room room2 = new Room();
        room.setName("I152");

        
        List<Room> rooms = new ArrayList<>();
        rooms.add(room);
        rooms.add(room1);
        rooms.add(room2);
        
        rooms.forEach((r) -> {
            System.out.println(r);
        });
        
        
        
        
    }

}
