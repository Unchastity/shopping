package com.sr.shopping.utils;

import java.util.Random;
import java.util.UUID;

public class StringUtils {

    /**
     * 返回长度为len的随机字符串
     */
    public static String getRandomString(int len) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            int r = random.nextInt(2) % 2 == 0 ? 65 : 97;
            char tmp = (char) (r + random.nextInt(26));
            sb.append(tmp);
        }
        return sb.toString();
    }

    /**
     * 返回UUID
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

}
