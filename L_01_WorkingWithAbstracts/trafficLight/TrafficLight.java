package L_01_WorkingWithAbstracts.trafficLight;

public class TrafficLight {

    private Color color;
    //нов светофар
    public TrafficLight(Color color) {
        this.color = color;
    }
        public void setColor(Color color) {
        this.color = color;
    }
    //red -> green -> yellow -> red -> green -> yellow...
    public void changeColor(){
        //текущият цвят
        switch (this.color){
            case RED:
                this.color = Color.GREEN;
                break;
            case GREEN:
                this.color = Color.YELLOW;
                break;
            case YELLOW:
                this.color = Color.RED;
                break;
        }
    }
    public String getColor(){
        return this.color.name();
    }
}
