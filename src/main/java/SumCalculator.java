public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException {
        int summa = 0;
        if (n == 0){
            throw new IllegalArgumentException("Not zero");
        }
        else {
            if (n==1){
                summa = n;
            }
            else{
                for (int i = 1; i < n; i++) {summa = summa + n;}
            }
            return summa;
        }
    }
}


