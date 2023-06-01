package poo_relaciones_ej2;

/**
 *
 * @author Costanzo
 */
public class TestRandomProbabilitiesWith_MathRandom {
    
    public static void lol(String[] args) {
        int aux;
        int n0 = 0,n1 = 0,n2 = 0,n3 = 0,n4 = 0,n5 = 0;
        for (int i = 0; i < 2000; i++) {
            aux = (int) Math.floor((Math.random()*100)%6);
            System.out.println(aux);
            switch (aux) {
                case 0:
                    n0 += 1;
                    break;
                case 1:
                    n1 += 1;
                    break;
                case 2:
                    n2 += 1;
                    break;
                case 3:
                    n3 += 1;
                    break;
                case 4:
                    n4 += 1;
                    break;
                case 5:
                    n5 += 1;
                    break;
                default:
                    throw new AssertionError();
            }
        }
            System.out.println("0: "+ n0+" 1: "+ n1+" 2: "+ n2+" 3: "+ n3+" 4: "+ n4+" 5: "+ n5);
    }
    
}
