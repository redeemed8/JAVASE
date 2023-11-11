//package URL.Senior;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.URLConnection;
//
//public class get_NetFile {
//    public static void main(String[] args) {
//        String address = "https://baike.baidu.com/item/%E7%99%BE%E5%BA%A6%E6%96%87%E5%BA%93/4928294";
//        openFile(address);
//    }
//
//    private static String openFile(String filePath) {
//        int HttpResult;     //  服务器返回的状态
//
//        String ee = "";
//
//        try {
//            URL url = new URL(filePath);
//            URLConnection urlconn = url.openConnection();       //  试图连接并取得返回状态码
//            urlconn.connect();
//            HttpURLConnection httpconn = (HttpURLConnection) urlconn;
//            HttpResult = httpconn.getResponseCode();
//            if (HttpResult != HttpURLConnection.HTTP_OK) {
//                System.out.println("无法连接到!");
//            } else {
//                int filesize = urlconn.getContentLength();              // 取数据长度
//                InputStreamReader isr = new InputStreamReader(urlconn.getInputStream(), "UTF-8");
//                BufferedReader br = new BufferedReader(isr);
//                StringBuffer buffer = new StringBuffer();
//                String line;               // 用来保存每行读取的内容
//                line = br.readLine();           // 读取第一行
//                while (line != null) {
//                    //     这个字符串我只想要中文的
//                    String newline = line.replaceAll("\s*", "").replaceAll("[^(\u4e00-\u9fa5)|\\，|\\。]", "");
//                    newline = newline.replaceAll("[()]", "");
//                    if (newline.length() > 0) {
//                        buffer.append(newline);
//                        buffer.append("\n");         // 添加换行符
//                    }
//
//                    line = br.readLine();
//                }
//                System.out.println(buffer.toString());
//                ee = buffer.toString();
//            }
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return ee;
//    }
//}
