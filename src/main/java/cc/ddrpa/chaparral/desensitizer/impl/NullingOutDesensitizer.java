package cc.ddrpa.chaparral.desensitizer.impl;

import cc.ddrpa.chaparral.desensitizer.IDesensitizer;

public class NullingOutDesensitizer implements IDesensitizer<Object> {
    public Object desensitize(Object value) {
        return null;
    }
}