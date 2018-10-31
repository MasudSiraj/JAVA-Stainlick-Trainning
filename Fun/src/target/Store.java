package target;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Store {

    private Map<String, Thread> lanes = new HashMap<>();


    Store(){
        createShoppingLanes();
        openShoppingLanes();
    }

    private void openShoppingLanes() {
        for (Thread thread:lanes.values()) {
            thread.start();
        }
    }

    private void createShoppingLanes() {
        lanes.put("Lane 1",new Thread(() -> processCheckout(), "Lane 1"));
        lanes.put("Lane 2",new Thread(() -> processCheckout(), "Lane 2"));
        lanes.put("Lane 3",new Thread(() -> processCheckout(), "Lane 3"));
    }

    @Cacheable
    @Loggable
    private void processCheckout() {
        String threadName = Thread.currentThread().getName();
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("Handling customers on " + threadName + " at " + LocalTime.now());
        }
    }


}
