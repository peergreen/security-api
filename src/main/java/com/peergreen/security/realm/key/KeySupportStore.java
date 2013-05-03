package com.peergreen.security.realm.key;

import java.io.InputStream;

import com.peergreen.security.realm.ModifiableAccountStore;

/**
 * User: guillaume
 * Date: 25/04/13
 * Time: 11:14
 */
public interface KeySupportStore extends ModifiableAccountStore {
    AccountKeysInfo getKeys(String id);
    void addKey(String id, InputStream key);
    void removeKey(String id, String fingerprint);
}
