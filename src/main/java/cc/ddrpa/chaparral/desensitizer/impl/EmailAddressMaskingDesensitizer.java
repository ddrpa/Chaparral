package cc.ddrpa.chaparral.desensitizer.impl;

import cc.ddrpa.chaparral.desensitizer.IDesensitizer;

import static cc.ddrpa.chaparral.Constant.EMPTY;

public class EmailAddressMaskingDesensitizer implements IDesensitizer<String> {
    public String desensitize(String s) {
        int posOfSymbol = s.indexOf('@');
        if (posOfSymbol < 2) {
            return EMPTY;
        }
        return s.charAt(0) + "***" + s.charAt(posOfSymbol - 1) + s.substring(posOfSymbol);
    }
}