package cc.ddrpa.chaparral.desensitizer.impl;

import cc.ddrpa.chaparral.desensitizer.IDesensitizer;

/**
 * 中文姓名脱敏，无论原长多少，保留第一个字和最后一个字，中间添加一个「*」
 */
public class NameMaskingDesensitizer implements IDesensitizer<String> {
    public String desensitize(String s) {
        return s.charAt(0) + "*" + s.charAt(s.length() - 1);
    }
}