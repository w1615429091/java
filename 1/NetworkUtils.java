import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NetworkUtils {

    public static String getCurrentWifiName() {
        String wifiName = "";
        try {
            Process process = Runtime.getRuntime().exec("netsh wlan show interfaces");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("SSID")) { // 查找包含 "SSID" 的行
                    String[] parts = line.split(":");
                    if (parts.length > 1) {
                        wifiName = parts[1].trim(); // 获取SSID名称并去除前后空格
                    }
                    break;
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wifiName;
    }

    public static void main(String[] args) {
        String currentWifiName = getCurrentWifiName();
        System.out.println("当前连接的 WiFi 网络名称: " + currentWifiName);
    }
}
