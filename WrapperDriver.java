public class WrapperDriver {
    public static void main(String[] args) {
        Wrapper wrapper1 = new Wrapper(10);
        Wrapper wrapper2 = new Wrapper(50);

        try {            
            System.out.println("Hash Code 1 = " + wrapper1.getHashCode());
            System.out.println("Hash Code 2 = " + wrapper2.getHashCode());

            wrapper1.compare(wrapper2);

        } catch (LesserThanException e) {
            System.out.println(e.getMessage());
        } catch (GreaterThanException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finished_Problem_3 !");
        }

    }    
}