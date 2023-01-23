package cc.ddrpa.chaparral.desensitizer.impl;

import cc.ddrpa.chaparral.desensitizer.IDesensitizer;

import static cc.ddrpa.chaparral.Constant.EMPTY;

public class NameMaskingDesensitizer implements IDesensitizer<String> {
    public String desensitize(String s) {
        if (s.trim().isEmpty()) {
            return EMPTY;
        }
        return s.charAt(0) + "*" + s.charAt(s.length() - 1);
    }
}