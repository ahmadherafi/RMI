import java.rmi.Remote;
import java.rmi.RemoteException;
// 
public interface RemoteRMI extends Remote {
    String sayHello() throws RemoteException;
// 
}
// RemoteInterface.java
// import java.rmi.Remote;
// import java.rmi.RemoteException;
// import java.awt.image.BufferedImage;

// public interface RemoteInterface extends Remote {
//     BufferedImage captureScreenshot() throws RemoteException;
//     BufferedImage captureWebcamImage() throws RemoteException;
//     void sendMessage(String message) throws RemoteException;
// }