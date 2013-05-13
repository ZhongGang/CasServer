package org.jasig.cas.util;

import org.jasig.cas.authentication.handler.PasswordEncoder;

/**
 * Created by IntelliJ IDEA.
 * User: Gang Zhong
 * Date: 13-4-22
 * Time: 下午4:00
 */
public class MD5PasswordEncoder implements PasswordEncoder {
    private org.springframework.security.authentication.encoding.PasswordEncoder passwordEncoder;

    @Override
    public String encode(String password) {
        return passwordEncoder.encodePassword(password, null);
    }

    public void setPasswordEncoder(org.springframework.security.authentication.encoding.PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }
}
