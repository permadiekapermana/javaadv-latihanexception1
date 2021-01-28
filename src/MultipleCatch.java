public class MultipleCatch {
    public static void main(String[] args) {
        try {
            String[] mahasiswa = new String[2];
            mahasiswa[0] = "Permadi";
            mahasiswa[1] = "Eka";
            mahasiswa[2] = "Permana";
            System.out.println(mahasiswa[4]);                      
           
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
        System.out.println("After exception.");
        
        
    }
}