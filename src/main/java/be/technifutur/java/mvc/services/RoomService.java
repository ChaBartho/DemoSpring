package be.technifutur.java.mvc.services;
import be.technifutur.java.mvc.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    //Propriété:
    private final List<Room> rooms = new ArrayList<>();


    //Constructeur:
    public RoomService(){
        rooms.add(new Room(1,1,0,20));
        rooms.add(new Room(2,2,0,25));
        rooms.add(new Room(3,0,1,30));
        rooms.add(new Room(4,1,1,30));
    }


    //Méthodes:
    public List<Room> getAll(){
//        return rooms; -> va renvoyer les ref et donc la liste sera modifiable
        return new ArrayList<>(rooms);  //-> renvoie une copie de la liste
    }

    public Room getOne(int numRoom){
        return rooms.stream()
                .filter(room -> room.getNumRoom() == numRoom)
                .findFirst()
                .orElseThrow( ()-> new RuntimeException("Pas de chambre avec ce numéro"));
    }



    public void insert(Room room){
        rooms.add(room);
    }

    public void update(int num, Room room){
        Room toUpdate = getOne(num);

        toUpdate.setNbSimpleBed( room.getNbSimpleBed() );
        toUpdate.setNbDoubleBed( room.getNbDoubleBed() );
        toUpdate.setSize( room.getSize() );
    }


}
