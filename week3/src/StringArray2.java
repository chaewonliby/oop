class StringArray2 {
    public static void main(String[] args) {
        String[] strArr1 = {"Google Chrome", "Microsoft Edge", "Mozilla Firefox", "Naver Whale"};
        String[] strArr2 = new String[4];
        strArr2[0] = strArr1[0];
        strArr2[1] = "Microsoft Edge";
        strArr2[2] = "Mozilla Firefox";
        strArr2[3] = new String("Naver Whale");

        for (int i = 0; i < strArr1.length; i++) {
            System.out.println("browsers1 출력");
            System.out.println(strArr1[i] + strArr1[i].length());
            System.out.println("browsers2 출력");
            System.out.println(strArr2[i] + strArr2[i].length());
        }

    }
}