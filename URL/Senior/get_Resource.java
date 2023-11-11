package URL.Senior;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class get_Resource {
    public static void main(String[] args) throws IOException {
        //  对应资源链接
        String address = "";
        URL url = new URL(address);
        //  资源是http资源，转一下类型
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        //  IO操作下载到本地
        InputStream is = urlConnection.getInputStream();
        FileOutputStream fos = new FileOutputStream("resource.click");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        //  关闭 IO 流
        fos.close();
        is.close();
        urlConnection.disconnect();

    }
}
