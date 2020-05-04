public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int count = 0;
        int number = 0;
        long start = System.currentTimeMillis();
        try {
            while (count<10){
                if (isPrime(number)) System.out.println(number);
                count++;
                number++;
            }
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Done in " + (start - end) + "Milliseconds");
    }
    private boolean isPrime(int number){
        if(number<2) return false;
        else if (number ==2 ) return  true;
        else {
            for (int i =2; i<Math.sqrt(number); i++){
                if (number%i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
