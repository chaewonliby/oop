class TrafficLightTest {
    enum TrafficLightColor {
        RED(30), AMBER(30), GREEN(10);

        int second;
        TrafficLightColor(int second) { this.second = second; }
        int getSecond() { return second; }
    }

    public static void main(String[] args) {
        for (TrafficLightColor color : TrafficLightColor.values()) {
            System.out.println(color.getSecond());
        }

    }
}