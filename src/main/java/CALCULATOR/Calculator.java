package CALCULATOR;

/**
 * Created by taiseerhabib on 4/30/16.
 */



public class Calculator {

    double val;

    public double sum() {
        Number num1 = new Number();
        for (int i = 1; i <= num1.unum.length; i++) {
            if (i == 1) {
                val = num1.unum[i];
            }
            val = val + num1.unum[i];
        }
        return val;
    }

    public double subtract() {
        Number num1 = new Number();
        for (int i = 1; i <= num1.unum.length; i++) {
            if (i == 1) {
                val = num1.unum[i];
            }
            else
            val = val - num1.unum[i];
        }
        return val;
    }

    public double division() {
        Number num1 = new Number();
        for (int i = 1; i <= num1.unum.length; i++) {
            if (i == 1) {
                val = num1.unum[i];
            }
            else
            val = val / num1.unum[i];
        }
        return val;
    }

    public double multiplication() {
        Number num1 = new Number();
        for (int i = 1; i <= num1.unum.length; i++) {
            if (i == 1) {
                val = num1.unum[i];
            }
            val = val * num1.unum[i];
        }
        return val;
    }

    public double square() {
        Number num1 = new Number();
        for (int i = 1; i <= num1.unum.length; i++) {
            if (i == 1) {
                val = num1.unum[i];
            }
            else
            val = val * num1.unum[i];
        }
        return val;
    }

    public double squareroot() {
        Number num1 = new Number();
        for (int i = 1; i <= num1.unum.length; i++) {
            if (i == 1) {
                val = Math.sqrt(num1.unum[i]);
            }

        }
        return val;
    }

    public double inverse() {
        Number num1 = new Number();
        for (int i = 1; i <= num1.unum.length; i++) {
            if (i == 1) {
                val = 1/(num1.unum[i]);
            }

        }
        return val;
    }

    public double exp() {
        Number num1 = new Number();
        for (int i = 1; i <= num1.unum.length; i++) {
            if (i == 1) {
                val = Math.pow(num1.unum[i], num1.unum[i+1]);
            }

        }
        return val;
    }

    public double invert() {
        Number num1 = new Number();
        val = (num1.unum[1]* -1);
        return val;
    }


}








