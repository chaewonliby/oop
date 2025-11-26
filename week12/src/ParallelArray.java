public class ParallelArray {
    public static void main(String[] args) {
        String[] names =  {"SBS", "KBS2", "KBS1", "EBS1", "MBC"};
        int[] channels = { 6, 7, 9, 10, 11};

        for (int i = 0; i < names.length; i++) {
            System.out.printf("television networks: %s, channel number: %d\n", names[i], channels[i]);
        }

    }
}
