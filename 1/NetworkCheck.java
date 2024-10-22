import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkCheck {
    public static void main(String[] args) {
        if (isNetworkAvailable()) {
            System.out.println("网络连接正常");
        } else {
            System.out.println("没有网络连接");
            openNoNetworkApp();
        }
    }

    public static boolean isNetworkAvailable() {
        try {
            InetAddress address = InetAddress.getByName("www.baidu.com");
            return !address.equals("");
        } catch (UnknownHostException e) {
            return false;
        }
    }

    public static void openNoNetworkApp() {
        try {
            // 替换为您希望打开的程序的实际路径
            String command = "C:/Users/16154/Desktop/校园网自动连接.url";
            Process process = Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            System.out.println("打开程序失败: " + e.getMessage());
        }
    }
}
