public class Crossings {
    private String portName;
    private String state;
    private int portCode;
    private String border;
    private String date;
    private String measure;
    private int value;

    public Crossings(String portName, String state, int portCode, String border, String date, String measure, int value) {
        this.portName = portName;
        this.state = state;
        this.portCode = portCode;
        this.border = border;
        this.date = date;
        this.measure = measure;
        this.value = value;
    }

    public Crossings(String line){
        String[] x = line.split(",");
        int a = Integer.parseInt(x[2]);
        int b = Integer.parseInt(x[6]);
        portName = x[0];
        state = x[1];
        portCode = a;
        border = x[3];
        date = x[4];
        measure = x[5];
        value = b;
    }


    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPortCode() {
        return portCode;
    }

    public void setPortCode(int portCode) {
        this.portCode = portCode;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void show() {
        System.out.println("Portname:" + portName + " State:" + state + " Portcode:" + portCode + " Border:" + border + " Date:" + date + " Measure:" + measure + " Value:" + value);
    }

    // Overriding
    public String toString() {
        return ("Portname:" + portName + " State:" + state + " Portcode:" + portCode + " Border:" + border + " Date:" + date + " Measure:" + measure + " Value:" + value);
    }
}


