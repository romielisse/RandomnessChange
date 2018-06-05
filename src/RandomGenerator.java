import java.util.Random;

public class RandomGenerator{
    public static void main(String[] args)
    {
        System.out.println("Generate 10 random integers between 5 and 95");

        for (int i = 1; i <= 10; ++i)
        {
            int randomInt = getRandomNumberInRange(5,95);
            System.out.println("Generated number: " + randomInt);
        }

        System.out.println("Done.");
    }

    protected static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}