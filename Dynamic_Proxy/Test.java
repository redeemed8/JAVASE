package Dynamic_Proxy;

public class Test {
    public static void main(String[] args) {

        //  请求大明星，代理唱歌

        //  获取代理对象
        BigStar bigStar = new BigStar("坤哥");
        Star proxy_bigStar = ProxyUtil.createProxy(bigStar);

        //  再调用代理的唱歌方法
        String ret = proxy_bigStar.sing("只因你太美");
        System.out.println(ret);

    }
}
