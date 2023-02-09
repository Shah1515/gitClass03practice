public class class15 {

    boolean isPrime(int number) {
        boolean flag=true;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % 2 == 0) {
                    flag= false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }

}



