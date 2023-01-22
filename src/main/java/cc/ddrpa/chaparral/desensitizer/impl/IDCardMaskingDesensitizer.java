package cc.ddrpa.chaparral.desensitizer.impl;

import cc.ddrpa.chaparral.desensitizer.IDesensitizer;

/**
 * 中华人民共和国居民身份证号码脱敏，保留前1后1，共18位，用「*」填充
 */
public class IDCardMaskingDesensitizer implements IDesensitizer<String> {
    public String desensitize(String s) {
        return s.charAt(0) + "****************" + s.charAt(s.length() - 1);
    }
}