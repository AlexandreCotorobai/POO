package POO2122;
import java.time.LocalDate;
import java.util.*;

public class Event implements IEvent{
    private String data;
    private Client cliente;
    private List<Activity> activities = new ArrayList<>();

    public Event(Client cliente, String data) {
        this.data = data;
        this.cliente = cliente;
    }


    ///REVER
    public Event addActivity(Activity activity) {
        activities.add(activity);
        return this;
    }

    public LocalDate getDate() {
        return LocalDate.parse(data);
    }

    public double getTotalCost() {
        double total = 0;
        for (Activity activity : activities) {
            total += activity.getCost();
        }
        return total;
    }
    // public void addClient(Client client) {
    //     listaClients.put(client, new TreeSet<Activity>());
    // }



    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Client getCliente() {
        return this.cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public List<Activity> getActivities() {
        return this.activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        String x = "";
        x = "Evento em " +data +", total=" + getTotalCost()+ " euros\n";
        for (Activity activity : activities) {
            x += activity.toString() + "\n";
        }
        return x;
                
    }

}
