package cc.ddrpa.chaparral.desensitizer.impl;

import cc.ddrpa.chaparral.desensitizer.IDesensitizer;

import static cc.ddrpa.chaparral.Constant.DEFAULT_MASK;
import static cc.ddrpa.chaparral.Constant.EMPTY;

public class CellPhoneNumberMaskingDesensitizer implements IDesensitizer<String> {
    public String desensitize(String s) {
        if (s.trim().isEmpty()) {
            return EMPTY;
        } else if (s.length() < 4) {
            return DEFAULT_MASK;
        }
        return s.substring(0, 3) + "****" + s.substring(s.length() - 4);
    }
}