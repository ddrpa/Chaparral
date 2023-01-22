package cc.ddrpa.chaparral.desensitizer.impl;

import cc.ddrpa.chaparral.desensitizer.IDesensitizer;

/**
 * 移动电话号码脱敏，保留前3后4，中间使用「*」代替
 */
public class CellPhoneNumberMaskingDesensitizer implements IDesensitizer<String> {
    public String desensitize(String s) {
        return s.substring(0, 3) + "****" + s.substring(s.length() - 4);
    }
}