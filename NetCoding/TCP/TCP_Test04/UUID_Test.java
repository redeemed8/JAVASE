package NetCoding.TCP.TCP_Test04;

import java.util.UUID;

public class UUID_Test {
    public static void main(String[] args) {
        //  UUID
        String str = UUID.randomUUID().toString().replace("-","");
        System.out.println(str);

    }
}
