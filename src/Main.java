import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        try{
            RemoteIMPL remoteIMPL = new RemoteIMPL();
            
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("test" , remoteIMPL);
            System.out.println("Server ready");

        }
        catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}
// Server.java
// import java.rmi.registry.Registry;
// import java.rmi.registry.LocateRegistry;
// import java.rmi.RemoteException;
// import java.rmi.server.UnicastRemoteObject;
// import java.awt.Robot;
// import java.awt.image.BufferedImage;
// import javax.imageio.ImageIO;
// import java.io.ByteArrayOutputStream;

// public class Server implements RemoteInterface {
//     public Server() throws RemoteException {}

//     public BufferedImage captureScreenshot() throws RemoteException {
//         try {
//             Robot robot = new Robot();
//             BufferedImage image = robot.createScreenCapture(new java.awt.Rectangle(java.awt.Toolkit.getDefaultToolkit().getScreenSize()));
//             return image;
//         } catch (Exception e) {
//             throw new RemoteException("Error capturing screenshot", e);
//         }
//     }

//     public BufferedImage captureWebcamImage() throws RemoteException {
//         // Code to capture image from webcam goes here
//         return null;
//     }

//     public void sendMessage(String message) throws RemoteException {
        
//         System.out.println("Message from manager: " + message);
//     }

//     public static void main(String[] args) {
//         try {
            
//             Server obj = new Server();
//             RemoteInterface stub = (RemoteInterface) UnicastRemoteObject.exportObject(obj, 0);
//             // Registry registry = LocateRegistry.getRegistry();
//             Registry registry = LocateRegistry.createRegistry(1099);
//             registry.bind("RemoteInterface", stub);
//             System.out.println("Server ready");
            
//         } catch (Exception e) {
//             System.err.println("Server exception: " + e.toString());
//             e.printStackTrace();
//         }
        
//     }
// }