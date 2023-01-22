package cc.ddrpa.chaparral.desensitizer.impl;

import cc.ddrpa.chaparral.desensitizer.IDesensitizer;

/**
 * 无论原值为何，返回 null
 */
public class NullingOutDesensitizer implements IDesensitizer<Object> {
    public Object desensitize(Object value) {
        return null;
    }
}