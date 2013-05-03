package com.peergreen.security.realm.key;

/**
 * User: guillaume
 * Date: 25/04/13
 * Time: 11:31
 */
public interface KeyInfo {
    String getFingerPrint();
    byte[] getContent();
}
