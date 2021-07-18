package secondtask;

public class Cube implements Value {
    public int getNewValue() {
        return (int) (Math.random() * 6 + 1);
    }
}
