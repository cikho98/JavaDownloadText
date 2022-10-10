import common.HttpURLConnectionUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DownLoad {
    private static String baseUrl = "http://doc.canglaoshi.org/";

    public static void main(String[] args) {
//        String message =
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要下载的文件");
        String urlPath = scan.nextLine();
        if ("".equals(urlPath.trim()) || urlPath != null) {
            urlPath = "jsd";
        }
        List<String> messageList = getData(baseUrl + urlPath + "/?j");

    }

    public static List<String> getData(String url) {
        HttpURLConnectionUtil requests = new HttpURLConnectionUtil();
        String message = requests.doGet(url);
        String messageSub = message.substring(1, message.length() - 1);
        String messageArray[] = messageSub.split(",");
        List<String> messageList = Arrays.asList(messageArray);
        return messageList;
    }

}
