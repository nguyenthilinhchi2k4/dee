public class Tamgiac {
    private float a, b, c;

    public Tamgiac(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValid() {
        return a + b > c && b + c > a && a + c > b;
    }

    public float getChuvi() {
        return a + b + c;
    }

    public float getDientich() {
        float p = (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}