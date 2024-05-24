import java.awt.image.BufferedImage;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteIMPL extends UnicastRemoteObject implements RemoteRMI {

    protected RemoteIMPL() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }

    @Override
    public String sayHello() throws RemoteException {
        // TODO Auto-generated method stub
        return "HHHHHHHH";
    }

    // @Override
    // public BufferedImage captureScreenshot() throws RemoteException {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'captureScreenshot'");
    // }

    // @Override
    // public BufferedImage captureWebcamImage() throws RemoteException {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'captureWebcamImage'");
    // }
    

}
