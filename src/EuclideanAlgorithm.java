import java.util.Arrays;

public class EuclideanAlgorithm {

    public int GCD(int a, int b){
        if(a >= b){

            while(a >= b)
                a -= b;

            if(a == 0)
                return b;
        }

        return GCD(b, a);
    }

    public int GCD(int a){
        return a;
    }

    public int GCD(int ...args) {
        if (args.length == 0)
            throw new IllegalArgumentException("At least 1 input is expected!");

        if (args.length == 1)
            return GCD(args[0]);

        return GCD(args[0], GCD(Arrays.copyOfRange(args,1, args.length)));
    }
}
