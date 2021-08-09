
package ChapterTen;

public class Client {

    public static void main(String[] args) {
        Worker worker = new Worker();
        try {

            worker.methodOne(3);
        }
        catch (NullPointerException e){
            System.out.println("Handled");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("input mismatch caught");

        }

        catch (ArrayStoreException xx){

            System.out.println("ARRAY CAUGHT");
        }
        }

    }

