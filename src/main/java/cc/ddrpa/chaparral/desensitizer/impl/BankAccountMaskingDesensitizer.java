package cc.ddrpa.chaparral.desensitizer.impl;

import cc.ddrpa.chaparral.desensitizer.IDesensitizer;

/**
 * 银行帐号脱敏
 * 借记卡/储蓄卡通常为 19 位，特殊情况有招商银行、建设银行（16 位），交通银行（17 位）
 * 贷记卡/信用卡统一卡号为16位
 * 保留前6后4，中间用「*」代替，总长16
 */
public class BankAccountMaskingDesensitizer implements IDesensitizer<String> {
    public String desensitize(String s) {
        return s.substring(0, 6) + "******" + s.substring(s.length() - 4);
    }
}