package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("dataA = " + dataA);
        System.out.println("메서드 호출 전 a = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후 a = " + dataA.value);
    }

    private static void changeReference(Data dataX) {
        System.out.println("dataX = " + dataX);
        dataX.value = 20;
    }
}
