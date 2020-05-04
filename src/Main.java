public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();

        Thread a = new Thread(lazyPrimeFactorization);
        Thread b = new Thread(optimizedPrimeFactorization);

        a.start();
        b.start();
    }
}
