package com.peergreen.security.realm;

/**
 * User: guillaume
 * Date: 30/04/13
 * Time: 17:06
 */
public interface AccountFilter {
    boolean accept(AccountInfo account);
}
