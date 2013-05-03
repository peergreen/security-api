package com.peergreen.security.realm;

/**
 * User: guillaume
 * Date: 03/05/13
 * Time: 12:25
 */
public class AccountStoreException extends Exception {
    public AccountStoreException(String message) {
        super(message);
    }

    public AccountStoreException(String message, Throwable cause) {
        super(message, cause);
    }
}
