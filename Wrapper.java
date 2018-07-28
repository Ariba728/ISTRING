import java.util.Date;

public class Wrapper implements IWrapper {
    private int value;
    
    public Wrapper() {
        value = 0;
    }
    public Wrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public String getHashCode() {
        Date date = new Date();
        return Wrapper.class.getName() + ":" + this.value + ":" + (date.getHours() + "-" + date.getMinutes());
    }
    public void compare(Wrapper wrapper) throws LesserThanException, GreaterThanException {
        if (this.value <= wrapper.value) {
            throw new LesserThanException("Value is lesser");
        } else {
            throw new GreaterThanException("Value is greater");
        }
    }
}