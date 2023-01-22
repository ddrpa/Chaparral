package cc.ddrpa.chaparral.desensitizer.impl;

import cc.ddrpa.chaparral.desensitizer.IDesensitizer;

/**
 * 电子邮件地址脱敏，保留用户名的第一个字母和电子邮箱域名
 */
public class EmailAddressMaskingDesensitizer implements IDesensitizer<String> {
    public String desensitize(String s) {
        // FEAT：先判断是否为合法邮箱地址，保留「@」前的一个字母？
        return s.charAt(0) + "***" + s.substring(s.indexOf("@"));
    }
}