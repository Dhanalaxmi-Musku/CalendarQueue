
public class Week {
private Queue<WeekDay> days;
    
    public Week() {
        days = new Queue<>();
    }
    
    public void addDay(WeekDay day) {
        days.enqueue(day);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Queue<WeekDay> tempQueue = new Queue<>();
        
        while (!days.isEmpty()) {
            WeekDay day = days.dequeue();
            sb.append(day.toString());
            tempQueue.enqueue(day);
        }
        
        while (!tempQueue.isEmpty()) {
            days.enqueue(tempQueue.dequeue());
        }
        
        return sb.toString();
    }

}
