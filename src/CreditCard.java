public class CreditCard {

        double balance;
        double interest=0.5;

        void calculateInter(double balance){
                System.out.println(balance*interest);
        }

}
        class Visa extends CreditCard{

        }

        class AX extends CreditCard{
                @Override
                void calculateInter(double balance) {
                        double interest=0.4;
                        System.out.println(balance*interest);
                }
        }
        class CreditCardTester{
                public static void main(String[] args) {
                        CreditCard cc=new CreditCard();
                        cc.calculateInter(1000);

                        Visa visa=new Visa();
                        visa.calculateInter(2000);
                        AX ax=new AX();
                        ax.calculateInter(3000);
                }
        }

