
import java.io.*;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import java.util.*;





public class QRCodeGenerator{
    static String  details ;
    static String  x;
    public static void main (String [] arg) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("**********Enter the details for the qr code**********");
        details = scan.nextLine();

        System.err.println("**********Please write the name of the file !!");
        x = scan.nextLine();
        ByteArrayOutputStream out = QRCode. from(details).to(ImageType.PNG).stream();

         File f = new File ("C:\\Users\\Alvinyoo\\Documents\\java\\java practice\\QuickResponsesImages\\ "+ x +".png");

         FileOutputStream fos =new FileOutputStream(f);
         fos.write(out.toByteArray());
         fos.flush();
    }
}