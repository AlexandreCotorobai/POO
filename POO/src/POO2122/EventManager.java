package POO2122;
import java.time.LocalDate;
import java.util.*;

public class EventManager {
    private String name;
    private Map<Client, Event> listaClients = new HashMap<>();

    public EventManager(String name) {
        this.name = name;
    }

    public Client addClient(String name, String localidade) {
        Client client = new Client(name, localidade);
        return client;
    }

    public Event addEvent(Client c, LocalDate data) {
        Event event = new Event(c, data.toString());
        listaClients.put(c, event);
        return event;
    }

    public String listClients() {
        String x = "";
        for (Client client : listaClients.keySet()) {
            x += client.toString() + "\n";
        }
        return x;
    }

    public String listEvents() {
        String x = "***";
        for(Event event : listaClients.values()) {
            x += event.toString() + "\n";
        }
        return x;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Map<Client,Event> getListaClients() {
        return this.listaClients;
    }

    public void setListaClients(Map<Client,Event> listaClients) {
        this.listaClients = listaClients;
    }

}
