package LinearAndBinarySearch;

public class CompareStringBuffer{

    public static void main(String[] args) {

        int n = 1000000;

        StringBuffer buffer = new StringBuffer();

        long startBuffer = System.nanoTime();

        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }

        long endBuffer = System.nanoTime();

        StringBuilder builder = new StringBuilder();

        long startBuilder = System.nanoTime();

        for (int i = 0; i < n; i++) {
            builder.append("hello");
        }

        long endBuilder = System.nanoTime();

        long bufferTime = endBuffer - startBuffer;
        long builderTime = endBuilder - startBuilder;

        System.out.println("StringBuffer time: " + bufferTime + " nanoseconds");
        System.out.println("StringBuilder time: " + builderTime + " nanoseconds");

        if (bufferTime < builderTime) {
            System.out.println("StringBuffer is faster.");
        } else if (builderTime < bufferTime) {
            System.out.println("StringBuilder is faster.");
        } else {
            System.out.println("Both took the same time.");
        }
    }
}

