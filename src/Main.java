import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            RemoteRMI stub = (RemoteRMI) registry.lookup("test");
            System.out.println("%%%%%%%%%5");
            String response = stub.sayHello();
            System.out.println("Response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
        System.out.println("Hello Client");
    }
}
// Manager.java
// import java.rmi.registry.Registry;
// import java.rmi.registry.LocateRegistry;
// import java.rmi.RemoteException;
// import java.awt.image.BufferedImage;
// import javax.imageio.ImageIO;
// import java.io.ByteArrayOutputStream;
// import java.io.File;

// public class Manager {
//     public static void main(String[] args) {
//         try {
//             // Registry registry = LocateRegistry.getRegistry();
//             Registry registry = LocateRegistry.getRegistry("localhost", 1099);
//             RemoteInterface stub = (RemoteInterface) registry.lookup("RemoteInterface");

//             // Capture screenshot
//             BufferedImage screenshot = stub.captureScreenshot();
//             // saveImage(screenshot, "screenshot.png");
//             System.out.println("Screenshot captured");

//             // Capture webcam image
//             BufferedImage webcamImage = stub.captureWebcamImage();
//             if (webcamImage != null) {
//                 // saveImage(webcamImage, "webcam.png");
//                 System.out.println("Webcam image captured");
//             } else {
//                 System.out.println("Failed to capture webcam image");
//             }

//             // Send message to employee
//             stub.sendMessage("Hello, employee!");
//             System.out.println("Message sent to employee");

//         } catch (Exception e) {
//             System.err.println("Manager exception: " + e.toString());
//             e.printStackTrace();
//         }
//     }

//     private static void saveImage(BufferedImage image, String fileName) {
//         try {
//             File outputFile = new File(fileName);
//             ImageIO.write(image, "png", outputFile);
//         } catch (Exception e) {
//             System.err.println("Error saving image: " + e.toString());
//         }
//     }
// }